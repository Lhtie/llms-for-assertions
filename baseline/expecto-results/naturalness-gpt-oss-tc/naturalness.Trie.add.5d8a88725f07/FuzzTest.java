
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
    public void FuzzTest_add(Trie fuzzobj_old, Trie fuzzobj_new, String word, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (word == null));
var OLD_var1 = exec(() -> ((word == null ? 0 : word.length())));

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 1; _i <= word.length(); _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (1<=i&&i<=word.length()) {
			var fuzzexpr6 = exec(() -> fuzzobj_new.startsWith(word.substring(0,i)));
			var fuzzexpr7 = exec(() -> true);
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr6, fuzzexpr7)));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(1, OLD_var1).allMatch(__expecto_jml_1 -> ((!(((((int) (1)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var1))))) || (fuzzobj_new.startsWith(word.substring(0, __expecto_jml_1))))))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> !(New_Ret)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.startsWith(word.substring(0, OLD_var1))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 || fuzzexpr3));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr4));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> word!=null));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr5) == (!fuzzexpr8 || fuzzexpr9));
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
