
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;

import buggycodes.mut_000.Stack;

public class FuzzTest{
    public void FuzzTest_push(Stack<Integer> fuzzobj_old, Stack<Integer> fuzzobj_new, Integer item, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (item));
var OLD_var1 = exec(() -> (fuzzobj_old.size()));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((OLD_var0 != null))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[(((int) (fuzzobj_new.size())) - ((int) (1)))]), OLD_var0)));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(New_Ret, OLD_var0)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr2));
var fuzzexpr4 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr5 = exec(() -> (int) ((((int) (OLD_var1)) + ((int) (1)))));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
var fuzzexpr8 = exec(() -> item);
var fuzzexpr9 = exec(() -> null);
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 == fuzzexpr9));
var fuzzexpr11 = exec(() -> fuzzobj_new.get(fuzzobj_new.size()-1));
var fuzzexpr12 = exec(() -> null);
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 == fuzzexpr12));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> item!=null));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> item.equals(fuzzobj_new.get(fuzzobj_new.size()-1))));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> fuzzexpr15 && fuzzexpr16));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr7) == (fuzzexpr14 || fuzzexpr17));
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
