
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

import naturalness.Trie;

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
    public static Trie makeFuzzInput() {
        return (Trie) constructSeededObject(Trie.class, 0);
    }

    public void FuzzTest_add(Trie fuzzobj_old, Trie fuzzobj_new, String word, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // Seed both copies with small valid but distinct states. Comparing only
        // identical states can hide differences between old- and new-state terms.
seedStructure(fuzzobj_old, "old");
        if (fuzzobj_new != fuzzobj_old) seedStructure(fuzzobj_new, "seed");

        // copy old values
var OLD_var0 = exec(() -> (word == null));
var OLD_var1 = exec(() -> ((word == null ? 0 : word.length())));

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 1; _i <= word.codePointCount(0,word.length()); _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (1<=i&&i<=word.codePointCount(0,word.length())) {
			Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.keysWithPrefix(word.substring(0,word.offsetByCodePoints(0,i))).contains(word)));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr2));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> OLD_var0));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var1).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) <= ((int) (OLD_var1))))) || (fuzzobj_new.keysWithPrefix(word.substring(0, __expecto_jml_1)).contains(word)))))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> word!=null));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (!fuzzexpr3 || fuzzexpr4));
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
