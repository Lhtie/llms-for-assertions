
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import c2s_aug.ArrayList;

public class FuzzTest{
    public void FuzzTest_ArrayList(ArrayList<Integer> fuzzobj_old, ArrayList<Integer> fuzzobj_new, int initialCapacity){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values


        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (initialCapacity)) >= ((int) (0)))))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) (0));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr5 = exec(() -> (boolean) (true));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
var fuzzexpr8 = exec(() -> (int) (fuzzobj_new.size()));
var fuzzexpr9 = exec(() -> (int) (0));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr8, fuzzexpr9)));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr10));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> initialCapacity>=0));
var fuzzexpr13 = exec(() -> fuzzobj_new.size());
var fuzzexpr14 = exec(() -> 0);
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr13, fuzzexpr14)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr11) == (!fuzzexpr12 || fuzzexpr15));
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
