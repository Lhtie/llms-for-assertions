
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


        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !java.util.stream.IntStream.rangeClosed(0, fuzzobj_new.size()).anyMatch(__expecto_jml_1 -> ((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (fuzzobj_new.size())))) && (java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), New_Ret)))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> New_Ret!=null));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> !fuzzobj_new.contains(New_Ret)));
        Boolean normalpost = exec(() -> (fuzzexpr0) == (!fuzzexpr1 || fuzzexpr2));
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
