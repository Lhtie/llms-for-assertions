
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

import buggyasrts.mut_000.PriorityQueue;

public class FuzzTest{
    public void FuzzTest_poll(PriorityQueue<Integer> fuzzobj_old, PriorityQueue<Integer> fuzzobj_new, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> fuzzobj_old.size());
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> fuzzobj_old.get(1));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (OLD_var0)) > ((int) (1)))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(New_Ret, ((Integer)(OLD_var1)[1]))));
var fuzzexpr2 = exec(() -> New_Ret);
var fuzzexpr3 = exec(() -> OLD_var2);
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (Objects.equals(fuzzexpr2, fuzzexpr3)));
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
