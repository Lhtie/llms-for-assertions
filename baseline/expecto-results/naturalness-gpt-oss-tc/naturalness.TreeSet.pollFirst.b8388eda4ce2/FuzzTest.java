
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;

import naturalness.TreeSet;

public class FuzzTest{
    public void FuzzTest_pollFirst(TreeSet<Integer> fuzzobj_old, TreeSet<Integer> fuzzobj_new, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var1 = exec(() -> fuzzobj_old.isEmpty());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(OLD_var0)));
var fuzzexpr1 = exec(() -> New_Ret);
var fuzzexpr2 = exec(() -> null);
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 == fuzzexpr2));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 || fuzzexpr3));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> New_Ret != null));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 || fuzzexpr6));
var fuzzexpr8 = exec(() -> New_Ret);
var fuzzexpr9 = exec(() -> null);
var fuzzexpr10 = exec(() -> fuzzexpr8 == fuzzexpr9);
var fuzzexpr11 = exec(() -> OLD_var1);
        Boolean normalpost = exec(() -> (fuzzexpr4 && fuzzexpr7) == (Objects.equals(fuzzexpr10, fuzzexpr11)));
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
