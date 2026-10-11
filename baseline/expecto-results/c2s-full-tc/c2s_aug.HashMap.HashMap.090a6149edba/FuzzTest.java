
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.io.*;

import c2s_aug.HashMap;

public class FuzzTest{
    public void FuzzTest_HashMap(HashMap<Integer,Integer> fuzzobj_old, HashMap<Integer,Integer> fuzzobj_new, int initialCapacity, float loadFactor){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (initialCapacity));
var OLD_var1 = exec(() -> ((loadFactor>0)));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((((((int) (OLD_var0)) >= ((int) (0)))) && OLD_var1))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) (0));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> initialCapacity>=0));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> loadFactor>0));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr5));
var fuzzexpr7 = exec(() -> fuzzobj_new.size());
var fuzzexpr8 = exec(() -> 0);
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr7, fuzzexpr8)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr3) == (!fuzzexpr6 || fuzzexpr9));
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
