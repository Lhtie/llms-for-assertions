
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

import buggycodes.mut_053.Trie;

public class FuzzTest{
    public void FuzzTest_keysWithPrefix(Trie fuzzobj_old, Trie fuzzobj_new, String prefix, java.util.List<String> New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (prefix == null));
var OLD_var1 = exec(() -> ((prefix == null ? 0 : fuzzobj_old.countPrefix(prefix))));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
var fuzzexpr1 = exec(() -> (int) ((New_Ret.size())));
var fuzzexpr2 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> prefix!=null));
var fuzzexpr5 = exec(() -> New_Ret.size());
var fuzzexpr6 = exec(() -> fuzzobj_new.countPrefix(prefix));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr3) == (!fuzzexpr4 || fuzzexpr7));
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
