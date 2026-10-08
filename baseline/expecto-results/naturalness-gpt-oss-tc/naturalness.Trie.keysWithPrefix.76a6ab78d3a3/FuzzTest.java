
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
    public void FuzzTest_keysWithPrefix(Trie fuzzobj_old, Trie fuzzobj_new, String prefix, java.util.List<String> New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (prefix == null));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(OLD_var0)));
var fuzzexpr1 = exec(() -> New_Ret);
var fuzzexpr2 = exec(() -> null);
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 == fuzzexpr2));
var fuzzexpr4 = exec(() -> (int) ((New_Ret.size())));
var fuzzexpr5 = exec(() -> (int) (0));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 || fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> !(New_Ret == null)));
var fuzzexpr11 = exec(() -> (int) ((New_Ret.size())));
var fuzzexpr12 = exec(() -> (int) (((prefix == null ? 0 : fuzzobj_new.countPrefix(prefix)))));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr11, fuzzexpr12)));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 || fuzzexpr14));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> prefix!=null));
var fuzzexpr17 = exec(() -> New_Ret.size());
var fuzzexpr18 = exec(() -> fuzzobj_new.countPrefix(prefix));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr17, fuzzexpr18)));
        Boolean normalpost = exec(() -> (fuzzexpr8 && fuzzexpr15) == (!fuzzexpr16 || fuzzexpr19));
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
