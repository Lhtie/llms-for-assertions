
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.stream.*;

import buggyasrts.mut_054.UnionFind;

public class FuzzTest{
    public void FuzzTest_addElement(UnionFind<Integer> fuzzobj_old, UnionFind<Integer> fuzzobj_new, Integer element){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (element));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((OLD_var0 != null))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> !(fuzzobj_new.contains(element))));
var fuzzexpr2 = exec(() -> fuzzobj_new.contains(element) ? fuzzobj_new.find(element) : null);
var fuzzexpr3 = exec(() -> null);
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 == fuzzexpr3));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> !fuzzobj_new.contains(element)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr5) == (fuzzexpr6));
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
