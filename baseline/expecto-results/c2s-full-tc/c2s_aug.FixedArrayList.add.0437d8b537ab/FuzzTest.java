
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

import c2s_aug.FixedArrayList;

public class FuzzTest{
    public void FuzzTest_add(FixedArrayList<Integer> fuzzobj_old, FixedArrayList<Integer> fuzzobj_new, Integer element, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (element));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((OLD_var0 != null))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> New_Ret));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> element!=null));
var fuzzexpr3 = exec(() -> New_Ret);
var fuzzexpr4 = exec(() -> true);
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (!fuzzexpr2 || fuzzexpr5));
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
