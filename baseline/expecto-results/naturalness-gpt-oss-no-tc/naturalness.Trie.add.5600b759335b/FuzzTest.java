
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
var OLD_var1 = exec(() -> (word == null ? 0 : word.length() + 1));
var OLD_var2 = exec(() -> fuzzobj_old.countPrefix(word.substring(0, __expecto_jml_1)));
var OLD_var3_forallidx0_sample = exec(() -> fuzzobj_old.countPrefix(word.substring(0,1)));
var OLD_var3_forallidx0 = exec(() -> {
	int capacity = (word.length()) - (1) + 1;
	var ret = Array.newInstance(OLD_var3_forallidx0_sample.getClass(), capacity);
	int cur_idx = 0;
	for (int i = 1; i <= word.length(); i += 1) {
		Array.set(ret, cur_idx, fuzzobj_old.countPrefix(word.substring(0,i)));
		cur_idx += 1;
	}
	return ret;
});
var OLD_var3 = exec(() -> fuzzobj_old.contains(word));

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 1; _i <= word.length(); _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (1<=i&&i<=word.length()) {
			var fuzzexpr6 = exec(() -> fuzzobj_new.countPrefix(word.substring(0,i)));
			var fuzzexpr7 = exec(() -> get_from_array(OLD_var3_forallidx0, cur_idx, OLD_var3_forallidx0_sample)+1);
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr6, fuzzexpr7)));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((!OLD_var0) && ((((boolean) (New_Ret)) == ((boolean) (true))))))));
var fuzzexpr1 = exec(() -> (int) ((word == null ? 0 : word.length() + 1)));
var fuzzexpr2 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var1).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var1))))) || (((((int) (fuzzobj_new.countPrefix(word.substring(0, __expecto_jml_1)))) == ((int) ((((int) (OLD_var2)) + ((int) (1)))))))))))));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> word!=null));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> !OLD_var3));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 && fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr5) == (!fuzzexpr10 || fuzzexpr11));
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
