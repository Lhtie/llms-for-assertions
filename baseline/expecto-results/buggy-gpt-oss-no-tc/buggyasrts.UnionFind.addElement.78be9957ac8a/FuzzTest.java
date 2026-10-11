
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.stream.*;

import buggyasrts.mut_054.UnionFind;

public class FuzzTest{
    public void FuzzTest_addElement(UnionFind<Integer> fuzzobj_old, UnionFind<Integer> fuzzobj_new, Integer element){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (element));
var OLD_var1 = exec(() -> (fuzzobj_old.contains(element)));
var OLD_var2 = exec(() -> (fuzzobj_old.size()));
var OLD_var3 = exec(() -> fuzzobj_old.contains(element));
var OLD_var4 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> OLD_var0 != null));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> !OLD_var1));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 && fuzzexpr1));
var fuzzexpr3 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr4 = exec(() -> (int) ((((int) (OLD_var2)) + ((int) (2)))));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(element)));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> !OLD_var3));
var fuzzexpr9 = exec(() -> fuzzobj_new.size());
var fuzzexpr10 = exec(() -> OLD_var4+2);
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr9, fuzzexpr10)));
        Boolean normalpost = exec(() -> (fuzzexpr6 && fuzzexpr7) == (!fuzzexpr8 || fuzzexpr11));
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
