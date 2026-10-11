
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

import buggyasrts.mut_049.Trie;

public class FuzzTest{
    public void FuzzTest_add(Trie fuzzobj_old, Trie fuzzobj_new, String word, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (word == null));
var OLD_var1 = exec(() -> ((word != null && fuzzobj_old.contains(word))));
var OLD_var2 = exec(() -> (fuzzobj_old.size()));
var OLD_var3 = exec(() -> fuzzobj_old.contains(word));
var OLD_var4 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((!OLD_var0) && (!OLD_var1)))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> New_Ret));
var fuzzexpr2 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr3 = exec(() -> (int) ((((int) (OLD_var2)) + ((int) (2)))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> word!=null));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> !OLD_var3));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr7));
var fuzzexpr9 = exec(() -> fuzzobj_new.size());
var fuzzexpr10 = exec(() -> OLD_var4+2);
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr9, fuzzexpr10)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr5) == (!fuzzexpr8 || fuzzexpr11));
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
