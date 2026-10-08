
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;

import naturalness.TreeSet;

public class FuzzTest{
    public void FuzzTest_remove(TreeSet<Integer> fuzzobj_old, TreeSet<Integer> fuzzobj_new, Integer o, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> fuzzobj_old.size());
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> (o));
var OLD_var3 = exec(() -> fuzzobj_old.contains(o));

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (boolean) (New_Ret));
var fuzzexpr1 = exec(() -> (boolean) (java.util.stream.IntStream.rangeClosed(0, OLD_var0).anyMatch(__expecto_jml_1 -> ((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0)))) && (java.util.Objects.equals(((Integer)(OLD_var1)[__expecto_jml_1]), OLD_var2)))))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> o!=null));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> OLD_var3));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr3));
var fuzzexpr5 = exec(() -> New_Ret);
var fuzzexpr6 = exec(() -> true);
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
        Boolean normalpost = exec(() -> (Objects.equals(fuzzexpr0, fuzzexpr1)) == (!fuzzexpr4 || fuzzexpr7));
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
}
