
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.stream.*;

import naturalness.UnionFind;

public class FuzzTest{
    public void FuzzTest_union(UnionFind<Integer> fuzzobj_old, UnionFind<Integer> fuzzobj_new, Integer element1, Integer element2){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.numberOfSets()));
var OLD_var1 = exec(() -> (fuzzobj_old.contains(element1)));
var OLD_var2 = exec(() -> (fuzzobj_old.contains(element2)));
var OLD_var3 = exec(() -> ((fuzzobj_old.contains(element1) && fuzzobj_old.contains(element2) && fuzzobj_old.inSameSet(element1, element2))));
var OLD_var4 = exec(() -> fuzzobj_old.numberOfSets());

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (boolean) (((((int) ((fuzzobj_new.numberOfSets()))) == ((int) ((((int) (OLD_var0)) - ((int) (1)))))))));
var fuzzexpr1 = exec(() -> (boolean) (((OLD_var1 && OLD_var2) && (!OLD_var3))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(element1)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(element2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr3));
var fuzzexpr5 = exec(() -> fuzzobj_new.numberOfSets());
var fuzzexpr6 = exec(() -> OLD_var4-1);
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
        Boolean normalpost = exec(() -> (Objects.equals(fuzzexpr0, fuzzexpr1)) == (!fuzzexpr4 || fuzzexpr7));
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
