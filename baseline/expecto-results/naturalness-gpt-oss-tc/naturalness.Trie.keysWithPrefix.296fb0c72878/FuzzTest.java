
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


        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 0; _i <= New_Ret.size() - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (0<=i&&i<New_Ret.size()) {
			Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(New_Ret.get(i))));
			Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> New_Ret.get(i).startsWith(prefix)));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr2));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, (New_Ret.size())).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) ((New_Ret.size())))))) || ((fuzzobj_new.contains(New_Ret.get(__expecto_jml_1)) && New_Ret.get(__expecto_jml_1).startsWith(prefix))))))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> prefix!=null));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0) == (!fuzzexpr3 || fuzzexpr4));
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
