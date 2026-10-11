
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import c2s_aug.LinkedList;

public class FuzzTest{
    public void FuzzTest_addLast(LinkedList<Integer> fuzzobj_old, LinkedList<Integer> fuzzobj_new, Integer e){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> (e));

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr1 = exec(() -> (int) ((((int) (OLD_var0)) + ((int) (1)))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[(((int) (fuzzobj_new.size())) - ((int) (1)))]), OLD_var1)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(e)));
        Boolean normalpost = exec(() -> (fuzzexpr2 && fuzzexpr3) == (fuzzexpr4));
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
