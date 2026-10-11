
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
    public void FuzzTest_offer(PriorityQueue<Integer> fuzzobj_old, PriorityQueue<Integer> fuzzobj_new, Integer e, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> fuzzobj_old.size());
var OLD_var3 = exec(() -> fuzzobj_old.peek());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((boolean) (OLD_var0)) == ((boolean) (false)))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> ((Integer)(OLD_var1)[0]) != null));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> ((Integer)fuzzobj_new.toArray()[0]) != null));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr2));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> ((int) (((Integer)(((Integer)fuzzobj_new.toArray()[0]))).intValue())) >= ((int) (((Integer)(((Integer)(OLD_var1)[0]))).intValue()))));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 || fuzzexpr5));
var fuzzexpr7 = exec(() -> (boolean) (New_Ret));
var fuzzexpr8 = exec(() -> (boolean) (true));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr7, fuzzexpr8)));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> e!=null));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> OLD_var2>0));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.comparator()!=null));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.comparator().compare(fuzzobj_new.peek(), OLD_var3)>=0));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr13 && fuzzexpr14));
var fuzzexpr16 = exec(() -> fuzzobj_new.comparator());
var fuzzexpr17 = exec(() -> null);
Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> fuzzexpr16 == fuzzexpr17));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> ((Comparable) fuzzobj_new.peek()).compareTo(OLD_var3)>=0));
Boolean fuzzexpr20 = Boolean.TRUE.equals(exec(() -> fuzzexpr18 && fuzzexpr19));
Boolean fuzzexpr21 = Boolean.TRUE.equals(exec(() -> fuzzexpr15 || fuzzexpr20));
        Boolean normalpost = exec(() -> (fuzzexpr6 && fuzzexpr9) == (!fuzzexpr12 || fuzzexpr21));
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
