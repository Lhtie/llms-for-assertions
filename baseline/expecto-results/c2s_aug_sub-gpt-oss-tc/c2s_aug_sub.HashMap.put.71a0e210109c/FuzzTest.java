
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.io.*;

import c2s_aug_sub.HashMap;

public class FuzzTest{
    public void FuzzTest_put(HashMap<Integer,Integer> fuzzobj_old, HashMap<Integer,Integer> fuzzobj_new, Integer key, Integer value, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (key));
var OLD_var1 = exec(() -> (value));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> OLD_var0 != null));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.containsKey(key)));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 && fuzzexpr1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals((((Integer)fuzzobj_new.get(key))), OLD_var1)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr3));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> !((OLD_var1 != null))));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.containsValue(value)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 || fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.containsKey(key)));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.containsValue(value)));
        Boolean normalpost = exec(() -> (fuzzexpr4 && fuzzexpr7) == (fuzzexpr8 && fuzzexpr9));
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
