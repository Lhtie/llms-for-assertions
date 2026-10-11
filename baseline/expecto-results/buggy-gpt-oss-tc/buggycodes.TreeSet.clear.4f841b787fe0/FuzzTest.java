
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;

import buggycodes.mut_048.TreeSet;

public class FuzzTest{
    public void FuzzTest_clear(TreeSet<Integer> fuzzobj_old, TreeSet<Integer> fuzzobj_new){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values


        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr1 = exec(() -> (boolean) (true));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
var fuzzexpr3 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr4 = exec(() -> (int) (0));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.isEmpty()));
        Boolean normalpost = exec(() -> (fuzzexpr2 && fuzzexpr5) == (fuzzexpr6));
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
