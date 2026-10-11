
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import c2s_aug.LinkedList;

public class FuzzTest{
    public void FuzzTest_removeLast(LinkedList<Integer> fuzzobj_old, LinkedList<Integer> fuzzobj_new, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> fuzzobj_old.size());
var OLD_var3 = exec(() -> fuzzobj_old.isEmpty());
var OLD_var4 = exec(() -> fuzzobj_old.size()-1);
var OLD_var5 = exec(() -> fuzzobj_old.get(OLD_var4));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(New_Ret, ((Integer)(OLD_var1)[(((int) (OLD_var2)) - ((int) (1)))]))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> !OLD_var3));
var fuzzexpr3 = exec(() -> New_Ret);
var fuzzexpr4 = exec(() -> null);
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 == fuzzexpr4));
var fuzzexpr6 = exec(() -> OLD_var5);
var fuzzexpr7 = exec(() -> null);
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 == fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 && fuzzexpr8));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> New_Ret.equals(OLD_var5)));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 || fuzzexpr10));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (!fuzzexpr2 || fuzzexpr11));
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
