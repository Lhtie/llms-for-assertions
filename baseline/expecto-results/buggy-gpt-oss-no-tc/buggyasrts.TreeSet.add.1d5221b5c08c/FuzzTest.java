
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;

import buggyasrts.mut_042.TreeSet;

public class FuzzTest{
    public void FuzzTest_add(TreeSet<Integer> fuzzobj_old, TreeSet<Integer> fuzzobj_new, Integer e, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> fuzzobj_old.size());
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> (e));
var OLD_var3 = exec(() -> fuzzobj_old.contains(e));

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (boolean) (((((boolean) (New_Ret)) == ((boolean) (false))))));
var fuzzexpr1 = exec(() -> (boolean) ((!java.util.stream.IntStream.rangeClosed(0, OLD_var0).anyMatch(__expecto_jml_1 -> ((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0)))) && (java.util.Objects.equals(((Integer)(OLD_var1)[__expecto_jml_1]), OLD_var2))))))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> !OLD_var3));
var fuzzexpr3 = exec(() -> New_Ret);
var fuzzexpr4 = exec(() -> false);
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
        Boolean normalpost = exec(() -> (Objects.equals(fuzzexpr0, fuzzexpr1)) == (!fuzzexpr2 || fuzzexpr5));
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
