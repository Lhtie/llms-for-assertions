
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.io.*;

import c2s_aug.HashMap;

public class FuzzTest{
    public void FuzzTest_clone(HashMap<Integer,Integer> fuzzobj_old, HashMap<Integer,Integer> fuzzobj_new, HashMap<Integer,Integer> New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(New_Ret == null)));
var fuzzexpr1 = exec(() -> (int) ((New_Ret.size())));
var fuzzexpr2 = exec(() -> (int) (OLD_var0));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> ((HashMap<Integer,Integer>) New_Ret).size());
var fuzzexpr5 = exec(() -> fuzzobj_new.size());
        Boolean normalpost = exec(() -> (fuzzexpr0 && fuzzexpr3) == (Objects.equals(fuzzexpr4, fuzzexpr5)));
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
