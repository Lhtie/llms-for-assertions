
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

import c2s_aug_sub.PriorityQueue;

public class FuzzTest{
    public void FuzzTest_poll(PriorityQueue<Integer> fuzzobj_old, PriorityQueue<Integer> fuzzobj_new, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> fuzzobj_old.peek());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!(fuzzobj_new.isEmpty())))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> New_Ret != null));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> ((Integer)fuzzobj_new.toArray()[0]) != null));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr2));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> ((int) (((Integer)(((Integer)fuzzobj_new.toArray()[0]))).intValue())) >= ((int) (((Integer)(New_Ret)).intValue()))));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.size()>0));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.comparator()!=null));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.comparator().compare(fuzzobj_new.peek(), OLD_var0)>=0));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr8));
var fuzzexpr10 = exec(() -> fuzzobj_new.comparator());
var fuzzexpr11 = exec(() -> null);
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 == fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> ((Comparable) fuzzobj_new.peek()).compareTo(OLD_var0)>=0));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 || fuzzexpr14));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr5) == (!fuzzexpr6 || fuzzexpr15));
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
