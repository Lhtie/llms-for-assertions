
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.io.InvalidObjectException;

import c2s_aug.HashSet;

public class FuzzTest{
    public void FuzzTest_HashSet(HashSet<Integer> fuzzobj_old, HashSet<Integer> fuzzobj_new, int initialCapacity, float loadFactor){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> ((loadFactor>0)));
var OLD_var1 = exec(() -> (Float.isNaN(loadFactor)));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((((int) (initialCapacity)) >= ((int) (0)))) && OLD_var0) && (!OLD_var1)))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.isEmpty()));
var fuzzexpr2 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr3 = exec(() -> (int) (0));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> initialCapacity>=0));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> loadFactor>0));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.isEmpty()));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr5) == (!fuzzexpr8 || fuzzexpr9));
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
