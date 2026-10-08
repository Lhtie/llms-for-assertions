
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.stream.*;

import naturalness.UnionFind;

public class FuzzTest{
    public void FuzzTest_addElement(UnionFind<Integer> fuzzobj_old, UnionFind<Integer> fuzzobj_new, Integer element){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (element));
var OLD_var1 = exec(() -> (fuzzobj_old.contains(element)));
var OLD_var2 = exec(() -> (fuzzobj_old.size()));
var OLD_var3 = exec(() -> (fuzzobj_old.numberOfSets()));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> OLD_var0 != null));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> !(((((boolean) (OLD_var1)) == ((boolean) (false)))))));
var fuzzexpr2 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr3 = exec(() -> (int) ((((int) (OLD_var2)) + ((int) (1)))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
var fuzzexpr5 = exec(() -> (int) ((fuzzobj_new.numberOfSets())));
var fuzzexpr6 = exec(() -> (int) ((((int) (OLD_var3)) + ((int) (1)))));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr7));
var fuzzexpr9 = exec(() -> (boolean) ((fuzzobj_new.contains(element))));
var fuzzexpr10 = exec(() -> (boolean) (true));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr9, fuzzexpr10)));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 && fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((fuzzobj_new.contains(element) ? fuzzobj_new.find(element) : null)), OLD_var0)));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 || fuzzexpr14));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> !fuzzobj_new.contains(element)));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> element.equals(fuzzobj_new.find(element))));
        Boolean normalpost = exec(() -> (fuzzexpr0 && fuzzexpr15) == (!fuzzexpr16 || fuzzexpr17));
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
