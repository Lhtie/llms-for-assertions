# Expecto DSL → 本项目的简化 JML / assert

默认输出现在对齐 `prompting.py` 和 `codehelper/javahelper.py`，形式是：

```java
assert expression;
```

保留 `\old(...)`、`\result`，使用 `\forall int i; range; predicate`，不生成 `ensures`、JML 注解块、`\bigint_math` 或 `\bigint`。蕴含转成 Java 布尔表达式 `!A || B`，等价转为布尔值比较，避免项目字符串解析器不能处理的嵌套 `=>`。原来的标准 OpenJML 后端保留，通过 `--dialect openjml` 选择。

## 运行

在项目根目录执行：

```bash
python -m pip install -r baseline/expecto_jml/requirements.txt

# 与 ArrayList.remove(index) 的返回值断言对应的示例
python -m baseline.expecto_jml \
  baseline/expecto_jml/examples/arraylist_remove_return.dsl \
  --mapping baseline/expecto_jml/examples/project_remove_mapping.json \
  -o /tmp/remove.assert

# 只输出 assert 后面的表达式（移除最外层 assert 和结尾分号）
python -m baseline.expecto_jml \
  baseline/expecto_jml/examples/arraylist_remove_return.dsl \
  --mapping baseline/expecto_jml/examples/project_remove_mapping.json \
  --expression

# 直接读取 Expecto 实验结果
python -m baseline.expecto_jml /path/to/sample_results.json \
  --sample-id '完整方法ID' \
  --mapping /path/to/mapping.json -o /tmp/candidate.assert
```

默认返回完整的一条 assert，符合 `javahelper.extract_formula` 的输入要求。`--expression` 用于只需要公式的场景；公式内部量词的分号会保留。转换失败退出码为 2，不覆盖已有输出文件。

## ArrayList 的字段/observer 映射

项目在独立测试类里比较断言，因此不能读取 ArrayList 私有字段。receiver 字段必须明确映射为公开 observer，不自动猜测 backing array 与逻辑列表的关系。

标量映射示例：

```json
{
  "entry_self.size": "this.size()",
  "exit_self.size": "this.size()"
}
```

如果当前测试的方法本身就是 `size()`，后状态可按你期望的规格映射成 `"exit_self.size": "\\result"`，避免通过再次调用被测试的 observer 获取返回值。已有 `project_size_mapping.json` 示例。

逻辑元素序列映射示例：

```json
{
  "entry_self.elements": {
    "length": "this.size()",
    "get": "this.get({index})"
  },
  "exit_self.elements": {
    "length": "this.size()",
    "get": "this.get({index})"
  }
}
```

对应关系：

| DSL | 项目表达式（省略必要的强制类型转换） |
| --- | --- |
| `param.index` | `index` |
| `ret` | `\result` |
| `entry_self.size` | `\old(this.size())` |
| `exit_self.size` | `this.size()` 或显式配置的 `\result` |
| `len(entry_self.elements)` | `\old(this.size())` |
| `entry_self.elements[param.index]` | `\old(this.get(index))` |
| `exit_self.elements[param.index]` | `this.get(index)` |

`param` 的标量在现有测试 harness 中就是入口参数值。参数数组的元素和长度仍通过 `\old` 读取入口状态。普通数组参数/返回值也可以使用，不必改成 observer。

映射是使用者确认的**数据表示契约**：`elements` 必须确实是 logical elements。如果你的 dump 存的是含空槽的 `elementData`，它的长度是 capacity，不能直接映射成 `this.size()`。

当前元素类型支持 `list[int]` / `list[bool]`。可以在 `ArrayList<E>` 的泛型测试函数中编译；实际测试值必须分别是 Integer/Boolean 兼容值，不覆盖任意 E、null 元素或字符串。数值操作/相等比较会加必要的 primitive cast，防止泛型 E 算术编译错误，以及 `\old` 装箱值在否定/条件表达式里被误作引用比较。类名相同并不表示整个泛型域已被覆盖。

只填写当前规格实际使用的映射；拼错或未使用的映射会报错。

## 如何接入项目已有的比较流程

```python
from baseline.expecto_jml import translate

candidate = translate(dsl_text, mapping=mapping)  # "assert ...;\n"
# 只需要 assert 后面公式时：
formula = translate(dsl_text, mapping=mapping, expression_only=True)
```

`candidate` 可以直接作为现有 `checkers/equivchecker.py` 中 `java_equivcheck` 的 `asrt` 参数：

```python
# pfx/sfx/ground_truth 和 combinedcodes 沿用项目已有数据准备流程。
from checkers.equivchecker import java_equivcheck
same_on_generated_tests = java_equivcheck(
    pfx, sfx, ground_truth, candidate, combinedcodes
)
```

该 checker 使用 Randoop，是测试范围内的比较，不是形式化等价证明；其原有工作目录、依赖和 combinedcodes 仍需准备。translator 本身不调用它、不修改 dataset、不更改 `checktmp`。输出的 `\old` 等仍须经过 `javahelper` 转换，不能不经预处理就交给 javac。

注意比较粒度：dataset 的一条 assert 对应一个 `@@@` 描述。若 Expecto 生成的是整个方法的多个后置条件，整体公式可能比这一条 ground truth 更强；语法兼容不代表语义必然等价。应对齐同一条描述及状态表示。

## 量词及支持边界

支持：整数/布尔表达式、逻辑、比较、if/then/else、前后状态、record 字段、数组/observer 序列的长度及元素访问、值相等、非递归显式辅助函数展开。

项目模式只接受有显式上下界的单变量整数范围：

```text
∀(i: int) :: (0 <= i and i < param.n) implies condition
∃(i: int) :: (0 <= i and i < param.n) and condition
```

前者生成有限范围 `\forall int`；后者转换为 `!forall !`。上下界必须是 conjunction 中能识别的简单比较。生成的 range 格式与 `javahelper.find_bounds` 的解析方式匹配。拒绝无界/缺少一端边界、嵌套量词和多变量量词，避免默默落到 helper 的默认 `-65536..65536` 范围。数组内容相等会生成一个有界 forall。

算术按本项目的 Java `int` 执行语义，可能溢出；这与原 Expecto/Z3 的数学整数语义不完全相同。默认模式是为与 dataset 执行语义对齐，不能将它当成所有输入下严格保持 Z3 语义的转换。越界/空引用等仍遵循项目 `exec` 的异常处理方式；不自动添加前置条件。

暂不支持 `/`、`%`、`^`、string/real/option/map/set/tuple、高阶函数和隐式函数。旧序列使用后状态索引也拒绝，因为不能把索引错误地移入旧状态。所有不支持的构造明确报错，不生成占位 true。

项目 helper 自身对边界溢出、空/异常 observer 值及循环执行预算也有限制；这里没有改写其执行语义或私自扩大支持范围。

## 保留的标准 OpenJML 模式

```bash
python -m baseline.expecto_jml \
  baseline/expecto_jml/examples/arraylist_size.dsl \
  --dialect openjml -o /tmp/size.jml
```

Python API 使用 `translate(dsl, dialect="openjml")`。该模式输出 `/*@ ensures ...; @*/`，采用数学整数，允许 int/bool 量词；映射规则沿用旧版的 Java 字段路径，不支持本项目 observer-list 模板。`SizeExample.java` 是这个模式的示例。

## 验证

```bash
python -m unittest discover -s baseline/expecto_jml/tests -v
```

测试覆盖两种后端。项目集成测试实际读取 `datasets/c2s_aug/ArrayList.java` 的 ground truth，通过同一个 `javahelper.extract_formula/trans_formula` 转成 Java，并用 javac 编译、java 执行泛型比较函数。覆盖返回值断言、删除前缀保持、元素序列相等、存在量词以及超出 Integer 缓存范围的值；也验证了故意改错的候选与 ground truth 不一致。

测试在临时目录执行，不改动 dataset/checktmp。标准 OpenJML 工具集成测试仅在设置 `OPENJML=/path/to/openjml` 时运行；未安装则明确跳过。

实现：`translator.py` 复用上游语法/AST/类型检查并提供 OpenJML 后端，`project.py` 实现项目方言，`__main__.py` 提供 CLI。仅依赖 Lark，不需要模型 API 或完整 Expecto 环境。
