
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

import c2s_aug.PriorityQueue;

public class FuzzTest{
    public void FuzzTest_toArray(PriorityQueue<Integer> fuzzobj_old, PriorityQueue<Integer> fuzzobj_new, Integer[] New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values


        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 0; _i <= fuzzobj_new.size() - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (0<=i && i<fuzzobj_new.size()) {
			var fuzzexpr2 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr3 = exec(() -> null);
			Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 == fuzzexpr3));
			var fuzzexpr5 = exec(() -> New_Ret[i]);
			var fuzzexpr6 = exec(() -> null);
			Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 == fuzzexpr6));
			Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr7));
			Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(i).equals(New_Ret[i])));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr8 || fuzzexpr9));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> ((int) (New_Ret.length)) >= ((int) ((fuzzobj_new.size())))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, (fuzzobj_new.size())).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) ((fuzzobj_new.size())))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)New_Ret[__expecto_jml_1])))))))));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 && fuzzexpr1) == (fuzzexpr10));
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
