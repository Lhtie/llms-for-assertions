
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
    public void FuzzTest_remove(FixedArrayList<Integer> fuzzobj_old, FixedArrayList<Integer> fuzzobj_new, int i, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> fuzzobj_old.size());
var OLD_var3 = exec(() -> fuzzobj_old.get(i));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((((((int) (0)) <= ((int) (i))) && (((int) (i)) < ((int) (OLD_var0)))) && (((Integer)(OLD_var1)[i]) != null)))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(New_Ret, ((Integer)(OLD_var1)[i]))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> i>=0));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> i<OLD_var2));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr3));
var fuzzexpr5 = exec(() -> New_Ret);
var fuzzexpr6 = exec(() -> OLD_var3);
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (!fuzzexpr4 || fuzzexpr7));
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
