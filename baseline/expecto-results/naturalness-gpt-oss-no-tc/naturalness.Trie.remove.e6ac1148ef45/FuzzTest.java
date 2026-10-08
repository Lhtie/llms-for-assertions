
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

import naturalness.Trie;

public class FuzzTest{
    public void FuzzTest_remove(Trie fuzzobj_old, Trie fuzzobj_new, String word, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (word == null));
var OLD_var1 = exec(() -> ((word != null && fuzzobj_old.contains(word))));

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (boolean) (((word != null && fuzzobj_new.contains(word)))));
var fuzzexpr1 = exec(() -> (boolean) (false));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> !(OLD_var0)));
var fuzzexpr4 = exec(() -> (boolean) (New_Ret));
var fuzzexpr5 = exec(() -> (boolean) (false));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 || fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
var fuzzexpr10 = exec(() -> (boolean) (New_Ret));
var fuzzexpr11 = exec(() -> (boolean) (OLD_var1));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr10, fuzzexpr11)));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 || fuzzexpr12));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> word!=null));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> !fuzzobj_new.contains(word)));
        Boolean normalpost = exec(() -> (fuzzexpr8 && fuzzexpr13) == (!fuzzexpr14 || fuzzexpr15));
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
