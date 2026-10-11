
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;

import buggycodes.mut_041.TreeSet;

public class FuzzTest{
    public void FuzzTest_add(TreeSet<Integer> fuzzobj_old, TreeSet<Integer> fuzzobj_new, Integer e, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> fuzzobj_old.contains(e));
var OLD_var2 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> ((int) (OLD_var0)) <= ((int) ((fuzzobj_new.size())))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> ((int) ((fuzzobj_new.size()))) <= ((int) ((((int) (OLD_var0)) + ((int) (1)))))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> !OLD_var1));
var fuzzexpr3 = exec(() -> fuzzobj_new.size());
var fuzzexpr4 = exec(() -> OLD_var2+1);
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
        Boolean normalpost = exec(() -> (fuzzexpr0 && fuzzexpr1) == (!fuzzexpr2 || fuzzexpr5));
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
