
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import c2s_aug.LinkedList;

public class FuzzTest{
    public void FuzzTest_removeFirst(LinkedList<Integer> fuzzobj_old, LinkedList<Integer> fuzzobj_new, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> fuzzobj_old.isEmpty());
var OLD_var3 = exec(() -> fuzzobj_old.get(0));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> New_Ret != null));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> ((Integer)(OLD_var1)[0]) != null));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr2));
var fuzzexpr4 = exec(() -> (int) (((Integer)(New_Ret)).intValue()));
var fuzzexpr5 = exec(() -> (int) (((Integer)(((Integer)(OLD_var1)[0]))).intValue()));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> !OLD_var2));
var fuzzexpr9 = exec(() -> New_Ret);
var fuzzexpr10 = exec(() -> null);
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 == fuzzexpr10));
var fuzzexpr12 = exec(() -> OLD_var3);
var fuzzexpr13 = exec(() -> null);
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 == fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 && fuzzexpr14));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> New_Ret.equals(OLD_var3)));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> fuzzexpr15 || fuzzexpr16));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr7) == (!fuzzexpr8 || fuzzexpr17));
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
