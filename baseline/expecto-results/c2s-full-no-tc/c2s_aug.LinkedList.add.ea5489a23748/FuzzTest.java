
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import c2s_aug.LinkedList;

public class FuzzTest{
    public void FuzzTest_add(LinkedList<Integer> fuzzobj_old, LinkedList<Integer> fuzzobj_new, int index, Integer element){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (element));
var OLD_var1 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[index]), OLD_var0)));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> index<=OLD_var1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr2));
var fuzzexpr4 = exec(() -> element);
var fuzzexpr5 = exec(() -> null);
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 == fuzzexpr5));
var fuzzexpr7 = exec(() -> fuzzobj_new.get(index));
var fuzzexpr8 = exec(() -> null);
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 == fuzzexpr8));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(index).equals(element)));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 || fuzzexpr11));
        Boolean normalpost = exec(() -> (fuzzexpr0) == (!fuzzexpr3 || fuzzexpr12));
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
