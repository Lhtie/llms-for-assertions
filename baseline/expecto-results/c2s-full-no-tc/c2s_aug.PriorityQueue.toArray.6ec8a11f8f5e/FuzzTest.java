
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
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> fuzzobj_old.toArray());

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 0; _i <= fuzzobj_new.size() - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (0<=i && i<fuzzobj_new.size()) {
			var fuzzexpr4 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr5 = exec(() -> null);
			Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 == fuzzexpr5));
			var fuzzexpr7 = exec(() -> New_Ret[i]);
			var fuzzexpr8 = exec(() -> null);
			Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 == fuzzexpr8));
			Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr9));
			Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(i).equals(New_Ret[i])));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr10 || fuzzexpr11));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
var fuzzexpr0 = exec(() -> (int) (New_Ret.length));
var fuzzexpr1 = exec(() -> (int) (OLD_var0));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0))))) || ((java.util.Objects.equals(((Integer)(OLD_var1)[__expecto_jml_1]), ((Integer)New_Ret[__expecto_jml_1])))))))));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr2 && fuzzexpr3) == (fuzzexpr12));
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
