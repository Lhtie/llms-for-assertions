
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.io.*;

import c2s_aug.HashMap;

public class FuzzTest{
    public void FuzzTest_HashMap(HashMap<Integer,Integer> fuzzobj_old, HashMap<Integer,Integer> fuzzobj_new, java.util.Map<Integer,Integer> m){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (m.size()));

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr1 = exec(() -> (int) (OLD_var0));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> m!=null));
var fuzzexpr3 = exec(() -> fuzzobj_new.size());
var fuzzexpr4 = exec(() -> m.size());
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
        Boolean normalpost = exec(() -> (Objects.equals(fuzzexpr0, fuzzexpr1)) == (!fuzzexpr2 || fuzzexpr5));
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
