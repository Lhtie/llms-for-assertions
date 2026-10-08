
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
var OLD_var2 = exec(() -> ((word == null ? 0 : word.length())));
var OLD_var3 = exec(() -> (fuzzobj_old.size()));
var OLD_var4 = exec(() -> fuzzobj_old.countPrefix(word.substring(0, __expecto_jml_1)));
var OLD_var5_forallidx0_sample = exec(() -> fuzzobj_old.countPrefix(word.substring(0,1)));
var OLD_var5_forallidx0 = exec(() -> {
	int capacity = (word.length()) - (1) + 1;
	var ret = Array.newInstance(OLD_var5_forallidx0_sample.getClass(), capacity);
	int cur_idx = 0;
	for (int i = 1; i <= word.length(); i += 1) {
		Array.set(ret, cur_idx, fuzzobj_old.countPrefix(word.substring(0,i)));
		cur_idx += 1;
	}
	return ret;
});
var OLD_var5 = exec(() -> fuzzobj_old.contains(word));

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 1; _i <= word.length(); _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (1<=i&&i<=word.length()) {
			var fuzzexpr10 = exec(() -> fuzzobj_new.countPrefix(word.substring(0,i)));
			var fuzzexpr11 = exec(() -> get_from_array(OLD_var5_forallidx0, cur_idx, OLD_var5_forallidx0_sample)-1);
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr10, fuzzexpr11)));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((((!OLD_var0) && OLD_var1) && ((((int) (OLD_var2)) > ((int) (0))))))));
var fuzzexpr1 = exec(() -> (boolean) (New_Ret));
var fuzzexpr2 = exec(() -> (boolean) (true));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr5 = exec(() -> (int) ((((int) (OLD_var3)) - ((int) (1)))));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(1, OLD_var2).allMatch(__expecto_jml_1 -> ((!((((((int) (1)) <= ((int) (__expecto_jml_1)))) && ((((int) (__expecto_jml_1)) <= ((int) (OLD_var2)))))) || (((((int) (fuzzobj_new.countPrefix(word.substring(0, __expecto_jml_1)))) == ((int) ((((int) (OLD_var4)) - ((int) (1)))))))))))));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr8));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> word!=null));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> OLD_var5));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr9) == (!fuzzexpr14 || fuzzexpr15));
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
