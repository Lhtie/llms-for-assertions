
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.Arrays;

import examples.mut002.IntList;

public class FuzzTest{
    @randoop.TestValue public static final String fuzzSeed0 = "seed0";
    @randoop.TestValue public static final String fuzzSeed1 = "seed1";
    @randoop.TestValue public static final String fuzzSeed2 = "seed2";
    @randoop.TestValue public static final String fuzzOldSeed0 = "old0";
    @randoop.TestValue public static final String fuzzOldSeed1 = "old1";
    @randoop.TestValue public static final String fuzzOldSeed2 = "old2";
    @randoop.TestValue public static final int fuzzIntSeed0 = 0;
    @randoop.TestValue public static final int fuzzIntSeed1 = 1;
    @randoop.TestValue public static final int fuzzIntSeed2 = 2;

    @SuppressWarnings("unchecked")
    public static IntList makeFuzzInput() {
        return (IntList) constructSeededObject(IntList.class, 0);
    }

    public void FuzzTest_remove(IntList fuzzobj_old, IntList fuzzobj_new, int i){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // Seed both copies with small valid but distinct states. Comparing only
        // identical states can hide differences between old- and new-state terms.
seedStructure(fuzzobj_old, "old");
        if (fuzzobj_new != fuzzobj_old) seedStructure(fuzzobj_new, "seed");

        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> fuzzobj_old.get(__expecto_jml_1));
var OLD_var2 = exec(() -> (i));
var OLD_var3 = exec(() -> fuzzobj_old.size());
var OLD_var4 = exec(() -> fuzzobj_old.get((0 + __expecto_jml_2)));
var OLD_var5 = exec(() -> fuzzobj_old.get(((__expecto_jml_1 + 1) + (__expecto_jml_2 - ((0 < 0 || 0 >= fuzzobj_old.size() || __expecto_jml_1 <= 0) ? 0 : Math.min(__expecto_jml_1, (fuzzobj_old.size() - 0)))))));
var OLD_var6 = exec(() -> fuzzobj_old.get(__expecto_jml_3));
var OLD_var7 = exec(() -> fuzzobj_old.get(__expecto_jml_4));
var OLD_var8_forallidx0_sample = exec(() -> fuzzobj_old.get(0));
var OLD_var8_forallidx0 = exec(() -> {
	int capacity = (i - 1) - (0) + 1;
	var ret = Array.newInstance(OLD_var8_forallidx0_sample.getClass(), capacity);
	int cur_idx = 0;
	for (int j = 0; j <= i - 1; j += 1) {
		Array.set(ret, cur_idx, fuzzobj_old.get(j));
		cur_idx += 1;
	}
	return ret;
});
var OLD_var8_forallidx1_sample = exec(() -> fuzzobj_old.get(i+1));
var OLD_var8_forallidx1 = exec(() -> {
	int capacity = (fuzzobj_old.size() - 1) - (i) + 1;
	var ret = Array.newInstance(OLD_var8_forallidx1_sample.getClass(), capacity);
	int cur_idx = 0;
	for (int j = i; j <= fuzzobj_old.size() - 1; j += 1) {
		Array.set(ret, cur_idx, fuzzobj_old.get(j+1));
		cur_idx += 1;
	}
	return ret;
});

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _j = 0; _j <= i - 1; _j += 1) {
		int cur_idx = _cur_idx;
		int j = _j;
		if (0<=j && j<i) {
			var fuzzexpr16 = exec(() -> fuzzobj_new.get(j));
			var fuzzexpr17 = exec(() -> get_from_array(OLD_var8_forallidx0, cur_idx, OLD_var8_forallidx0_sample));
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr16, fuzzexpr17)));
		}
		_cur_idx += 1;
	}
	return ret;
}));
Boolean forall_holds_forallidx1 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _j = i; _j <= fuzzobj_new.size() - 1; _j += 1) {
		int cur_idx = _cur_idx;
		int j = _j;
		if (i<=j && j<fuzzobj_new.size()) {
			var fuzzexpr18 = exec(() -> fuzzobj_new.get(j));
			var fuzzexpr19 = exec(() -> get_from_array(OLD_var8_forallidx1, cur_idx, OLD_var8_forallidx1_sample));
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr18, fuzzexpr19)));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).anyMatch(__expecto_jml_1 -> ((((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0)))) && ((((int) (OLD_var1)) == ((int) (OLD_var2))))) && ((((int) ((fuzzobj_new.size()))) == ((int) ((((int) (OLD_var0)) - ((int) (1)))))))) && (((fuzzobj_new.size() == (((0 < 0 || 0 >= OLD_var3 || __expecto_jml_1 <= 0) ? 0 : Math.min(__expecto_jml_1, (OLD_var3 - 0))) + (((((int) (__expecto_jml_1)) + ((int) (1))) < 0 || (((int) (__expecto_jml_1)) + ((int) (1))) >= OLD_var3 || (((int) ((((int) (OLD_var0)) - ((int) (__expecto_jml_1))))) - ((int) (1))) <= 0) ? 0 : Math.min((((int) ((((int) (OLD_var0)) - ((int) (__expecto_jml_1))))) - ((int) (1))), (OLD_var3 - (((int) (__expecto_jml_1)) + ((int) (1)))))))) && java.util.stream.IntStream.range(0, fuzzobj_new.size()).allMatch(__expecto_jml_2 -> ((((int) (fuzzobj_new.get(__expecto_jml_2))) == ((int) ((__expecto_jml_2 < ((0 < 0 || 0 >= OLD_var3 || __expecto_jml_1 <= 0) ? 0 : Math.min(__expecto_jml_1, (OLD_var3 - 0))) ? OLD_var4 : OLD_var5)))))))))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_3 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_3))) && (((int) (__expecto_jml_3)) < ((int) (OLD_var0))))) || (((!(((int) (OLD_var6)) == ((int) (OLD_var2)))))))))));
var fuzzexpr2 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr3 = exec(() -> (int) (OLD_var0));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr4));
var fuzzexpr6 = exec(() -> fuzzobj_new.size());
var fuzzexpr7 = exec(() -> OLD_var3);
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr6, fuzzexpr7)));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.size()).allMatch(__expecto_jml_4 -> ((((int) (fuzzobj_new.get(__expecto_jml_4))) == ((int) (OLD_var7)))))));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 && fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 && fuzzexpr10));
var fuzzexpr12 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr13 = exec(() -> (boolean) (((((int) ((fuzzobj_new.size()))) == ((int) (0))))));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr12, fuzzexpr13)));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 && fuzzexpr14));
var fuzzexpr20 = exec(() -> fuzzobj_new.size());
var fuzzexpr21 = exec(() -> OLD_var3-1);
Boolean fuzzexpr22 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr20, fuzzexpr21)));
Boolean fuzzexpr23 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
Boolean fuzzexpr24 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx1));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr15) == (fuzzexpr22 && fuzzexpr23 && fuzzexpr24));
        if (normalpost == null || !normalpost)
            throw new RuntimeException("Normal Postcondition Violated");

        // exceptional post condition

        Boolean exceptionalpost = exec(() -> true);
        if (exceptionalpost == null || !exceptionalpost)
            throw new RuntimeException("Exceptional Postcondition Violated");
    }
    
    private static <T> T exec(Supplier<T> supplier){
		try {
			return supplier.get();
		} catch (Exception fuzzexception) {
			return null;
		}
	}
 
    @SuppressWarnings("unchecked")
	private static <T> T get_from_array(Object arr, int index, T ex_val){
		try {
			return (T) Array.get(arr, index);
		} catch (Exception fuzzexception) {
			return null;
		}
	}

    private static void seedStructure(Object target, String seedPrefix) {
        if (target == null) return;
        java.lang.reflect.Method[] methods = target.getClass().getMethods();
        java.util.Arrays.sort(methods, java.util.Comparator
            .comparingInt((java.lang.reflect.Method m) -> seedPriority(m.getName()))
            .thenComparing(java.lang.reflect.Method::toString));
        for (java.lang.reflect.Method method : methods) {
            String name = method.getName();
            if (method.isBridge() || method.isSynthetic()) continue;
            // These operations commonly create useful states for collections,
            // trees, maps, queues, sets, tries, graphs, and union-find structures.
            if (!(name.equals("add") || name.equals("addAll") || name.equals("put") ||
                  name.equals("putAll") || name.equals("offer") ||
                  name.equals("push") || name.equals("addElement") || name.equals("insert") ||
                  name.equals("addVertex") || name.equals("addEdge") || name.equals("union") ||
                  name.equals("set"))) continue;
            Class<?>[] types = method.getParameterTypes();
            if (types.length == 0 || types.length > 3) continue;
            for (int attempt = 0; attempt < 3; attempt++) {
                Object[] args = new Object[types.length];
                boolean supported = true;
                for (int i = 0; i < types.length; i++) {
                    Class<?> type = types[i];
                    int value = attempt + i;
                    if (type == String.class || type == Object.class) args[i] = seedPrefix + value;
                    else if (type.isAssignableFrom(java.util.ArrayList.class) ||
                             type.isAssignableFrom(java.util.LinkedHashSet.class)) {
                        java.util.Collection<Object> values = type.isAssignableFrom(java.util.ArrayList.class)
                            ? new java.util.ArrayList<>() : new java.util.LinkedHashSet<>();
                        values.add(seedPrefix + value); values.add(seedPrefix + (value + 10));
                        args[i] = values;
                    } else if (type.isAssignableFrom(java.util.LinkedHashMap.class)) {
                        java.util.Map<Object, Object> values = new java.util.LinkedHashMap<>();
                        values.put(seedPrefix + "key" + value, seedPrefix + "value" + value); args[i] = values;
                    } else if (type.isInterface()) {
                        supported = false; break;
                    } else if (type == int.class || type == Integer.class) args[i] = value;
                    else if (type == long.class || type == Long.class) args[i] = (long) value;
                    else if (type == short.class || type == Short.class) args[i] = (short) value;
                    else if (type == byte.class || type == Byte.class) args[i] = (byte) value;
                    else if (type == double.class || type == Double.class) args[i] = (double) value;
                    else if (type == float.class || type == Float.class) args[i] = (float) value;
                    else if (type == boolean.class || type == Boolean.class) args[i] = (value % 2 == 0);
                    else if (type == char.class || type == Character.class) args[i] = (char) ('a' + value);
                    else if (type.isArray()) {
                        Object array = java.lang.reflect.Array.newInstance(type.getComponentType(), 1);
                        Class<?> component = type.getComponentType();
                        if (component == String.class || component == Object.class) java.lang.reflect.Array.set(array, 0, seedPrefix + value);
                        else if (component == int.class) java.lang.reflect.Array.setInt(array, 0, value);
                        else { supported = false; break; }
                        args[i] = array;
                    } else { supported = false; break; }
                }
                if (supported) {
                    try { method.invoke(target, args); } catch (ReflectiveOperationException | RuntimeException ignored) { }
                }
            }
        }
    }

    private static int seedPriority(String name) {
        return name.equals("addVertex") ? 0 : name.equals("add") || name.equals("put") || name.equals("push") ? 1 :
               name.equals("addEdge") ? 2 : 3;
    }

    private static Object constructSeededObject(Class<?> type, int depth) {
        if (depth > 4) return null;
        java.lang.reflect.Constructor<?>[] constructors = type.getConstructors();
        java.util.Arrays.sort(constructors, java.util.Comparator.comparingInt(java.lang.reflect.Constructor::getParameterCount));
        for (java.lang.reflect.Constructor<?> constructor : constructors) {
            Class<?>[] types = constructor.getParameterTypes();
            Object[] args = new Object[types.length];
            boolean supported = true;
            for (int i = 0; i < types.length; i++) {
                Class<?> argType = types[i];
                if (argType == String.class) args[i] = "";
                else if (argType == Object.class) args[i] = new Object();
                else if (argType.isAssignableFrom(java.util.ArrayList.class)) args[i] = new java.util.ArrayList<>();
                else if (argType.isAssignableFrom(java.util.LinkedHashSet.class)) args[i] = new java.util.LinkedHashSet<>();
                else if (argType.isAssignableFrom(java.util.LinkedHashMap.class)) args[i] = new java.util.LinkedHashMap<>();
                else if (argType == int.class || argType == Integer.class) args[i] = 0;
                else if (argType == long.class || argType == Long.class) args[i] = 0L;
                else if (argType == short.class || argType == Short.class) args[i] = (short) 0;
                else if (argType == byte.class || argType == Byte.class) args[i] = (byte) 0;
                else if (argType == double.class || argType == Double.class) args[i] = 0.0;
                else if (argType == float.class || argType == Float.class) args[i] = 0.0f;
                else if (argType == boolean.class || argType == Boolean.class) args[i] = false;
                else if (argType == char.class || argType == Character.class) args[i] = 'a';
                else if (argType.isArray()) args[i] = java.lang.reflect.Array.newInstance(argType.getComponentType(), 0);
                else if (argType.getName().equals("org.jgrapht.Graph")) {
                    try {
                        Class<?> graphImpl = Class.forName("org.jgrapht.graph.DefaultDirectedGraph");
                        args[i] = graphImpl.getConstructor(Class.class).newInstance(String.class);
                    } catch (ReflectiveOperationException ex) { supported = false; break; }
                }
                else if (argType.isEnum() && argType.getEnumConstants().length > 0) args[i] = argType.getEnumConstants()[0];
                else if (!argType.isInterface() && !java.lang.reflect.Modifier.isAbstract(argType.getModifiers())) args[i] = constructSeededObject(argType, depth + 1);
                else { supported = false; break; }
                if (args[i] == null) { supported = false; break; }
            }
            if (!supported) continue;
            try { return constructor.newInstance(args); } catch (ReflectiveOperationException | RuntimeException ignored) { }
        }
        return null;
    }
}
