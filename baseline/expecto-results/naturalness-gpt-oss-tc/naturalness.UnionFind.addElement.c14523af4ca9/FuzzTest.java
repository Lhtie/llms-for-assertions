
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.stream.*;

import naturalness.UnionFind;

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
    public static UnionFind<Integer> makeFuzzInput() {
        return (UnionFind<Integer>) constructSeededObject(UnionFind.class, 0);
    }

    public void FuzzTest_addElement(UnionFind<Integer> fuzzobj_old, UnionFind<Integer> fuzzobj_new, Integer element){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // Seed both copies with small valid but distinct states. Comparing only
        // identical states can hide differences between old- and new-state terms.
seedStructure(fuzzobj_old, "old");
        if (fuzzobj_new != fuzzobj_old) seedStructure(fuzzobj_new, "seed");

        // copy old values
var OLD_var0 = exec(() -> (element));
var OLD_var1 = exec(() -> (fuzzobj_old.size()));
var OLD_var2 = exec(() -> (fuzzobj_old.numberOfSets()));
var OLD_var3 = exec(() -> (fuzzobj_old.contains(element)));
var OLD_var4 = exec(() -> ((fuzzobj_old.contains(element) ? fuzzobj_old.find(element) : null)));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!(OLD_var0 != null)))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> (int) ((fuzzobj_new.numberOfSets())));
var fuzzexpr5 = exec(() -> (int) (OLD_var2));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
var fuzzexpr8 = exec(() -> (boolean) ((fuzzobj_new.contains(element))));
var fuzzexpr9 = exec(() -> (boolean) (OLD_var3));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr8, fuzzexpr9)));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr10));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((fuzzobj_new.contains(element) ? fuzzobj_new.find(element) : null)), OLD_var4)));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 && fuzzexpr12));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 || fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> !((OLD_var0 != null))));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> !(OLD_var3)));
var fuzzexpr17 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr18 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr17, fuzzexpr18)));
var fuzzexpr20 = exec(() -> (int) ((fuzzobj_new.numberOfSets())));
var fuzzexpr21 = exec(() -> (int) (OLD_var2));
Boolean fuzzexpr22 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr20, fuzzexpr21)));
Boolean fuzzexpr23 = Boolean.TRUE.equals(exec(() -> fuzzexpr19 && fuzzexpr22));
var fuzzexpr24 = exec(() -> (boolean) ((fuzzobj_new.contains(element))));
var fuzzexpr25 = exec(() -> (boolean) (OLD_var3));
Boolean fuzzexpr26 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr24, fuzzexpr25)));
Boolean fuzzexpr27 = Boolean.TRUE.equals(exec(() -> fuzzexpr23 && fuzzexpr26));
Boolean fuzzexpr28 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((fuzzobj_new.contains(element) ? fuzzobj_new.find(element) : null)), OLD_var4)));
Boolean fuzzexpr29 = Boolean.TRUE.equals(exec(() -> fuzzexpr27 && fuzzexpr28));
Boolean fuzzexpr30 = Boolean.TRUE.equals(exec(() -> fuzzexpr16 || fuzzexpr29));
Boolean fuzzexpr31 = Boolean.TRUE.equals(exec(() -> !((!OLD_var3))));
var fuzzexpr32 = exec(() -> (boolean) ((fuzzobj_new.contains(element))));
var fuzzexpr33 = exec(() -> (boolean) (true));
Boolean fuzzexpr34 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr32, fuzzexpr33)));
Boolean fuzzexpr35 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((fuzzobj_new.contains(element) ? fuzzobj_new.find(element) : null)), OLD_var0)));
Boolean fuzzexpr36 = Boolean.TRUE.equals(exec(() -> fuzzexpr34 && fuzzexpr35));
Boolean fuzzexpr37 = Boolean.TRUE.equals(exec(() -> fuzzexpr31 || fuzzexpr36));
Boolean fuzzexpr38 = Boolean.TRUE.equals(exec(() -> fuzzexpr30 && fuzzexpr37));
Boolean fuzzexpr39 = Boolean.TRUE.equals(exec(() -> fuzzexpr15 || fuzzexpr38));
Boolean fuzzexpr40 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(element)));
        Boolean normalpost = exec(() -> (fuzzexpr14 && fuzzexpr39) == (fuzzexpr40));
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
