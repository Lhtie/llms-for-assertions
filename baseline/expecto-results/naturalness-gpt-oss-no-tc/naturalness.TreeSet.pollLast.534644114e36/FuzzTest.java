
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;

import naturalness.TreeSet;

public class FuzzTest{
    public void FuzzTest_pollLast(TreeSet<Integer> fuzzobj_old, TreeSet<Integer> fuzzobj_new, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var1 = exec(() -> fuzzobj_old.isEmpty());

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (boolean) ((New_Ret == null)));
var fuzzexpr1 = exec(() -> (boolean) (OLD_var0));
var fuzzexpr2 = exec(() -> New_Ret);
var fuzzexpr3 = exec(() -> null);
var fuzzexpr4 = exec(() -> fuzzexpr2 == fuzzexpr3);
var fuzzexpr5 = exec(() -> OLD_var1);
        Boolean normalpost = exec(() -> (Objects.equals(fuzzexpr0, fuzzexpr1)) == (Objects.equals(fuzzexpr4, fuzzexpr5)));
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
