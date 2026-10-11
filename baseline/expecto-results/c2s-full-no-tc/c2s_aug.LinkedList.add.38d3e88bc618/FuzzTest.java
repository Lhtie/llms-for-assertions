
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import c2s_aug.LinkedList;

public class FuzzTest{
    public void FuzzTest_add(LinkedList<Integer> fuzzobj_old, LinkedList<Integer> fuzzobj_new, Integer e, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> (e));

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (boolean) (New_Ret));
var fuzzexpr1 = exec(() -> (boolean) (true));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
var fuzzexpr3 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr4 = exec(() -> (int) ((((int) (OLD_var0)) + ((int) (1)))));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> ((int) (fuzzobj_new.size())) > ((int) (0))));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[(((int) (fuzzobj_new.size())) - ((int) (1)))]), OLD_var1)));
var fuzzexpr10 = exec(() -> e);
var fuzzexpr11 = exec(() -> null);
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 == fuzzexpr11));
var fuzzexpr13 = exec(() -> fuzzobj_new.get(fuzzobj_new.size()-1));
var fuzzexpr14 = exec(() -> null);
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr13 == fuzzexpr14));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr15));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> e!=null));
Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> e.equals(fuzzobj_new.get(fuzzobj_new.size()-1))));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> fuzzexpr17 && fuzzexpr18));
        Boolean normalpost = exec(() -> (fuzzexpr8 && fuzzexpr9) == (fuzzexpr16 || fuzzexpr19));
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
