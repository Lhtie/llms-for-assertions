
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import c2s_aug_sub.ArrayList;

public class FuzzTest{
    public void FuzzTest_set(ArrayList<Integer> fuzzobj_old, ArrayList<Integer> fuzzobj_new, int index, Integer element, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2_forallidx0_sample = exec(() -> fuzzobj_old.get(index + 1));
var OLD_var2_forallidx0 = exec(() -> {
	int capacity = (fuzzobj_old.size() - 1) - (index + 1) + 1;
	var ret = Array.newInstance(OLD_var2_forallidx0_sample.getClass(), capacity);
	int cur_idx = 0;
	for (int i = index + 1; i <= fuzzobj_old.size() - 1; i += 1) {
		Array.set(ret, cur_idx, fuzzobj_old.get(i));
		cur_idx += 1;
	}
	return ret;
});
var OLD_var2 = exec(() -> fuzzobj_old.size());

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = index + 1; _i <= fuzzobj_new.size() - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (index<i && i<fuzzobj_new.size()) {
			var fuzzexpr2 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr3 = exec(() -> null);
			Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 == fuzzexpr3));
			var fuzzexpr5 = exec(() -> get_from_array(OLD_var2_forallidx0, cur_idx, OLD_var2_forallidx0_sample));
			var fuzzexpr6 = exec(() -> null);
			Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 == fuzzexpr6));
			Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr7));
			Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(i).equals(get_from_array(OLD_var2_forallidx0, cur_idx, OLD_var2_forallidx0_sample))));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr8 || fuzzexpr9));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (0)) <= ((int) (index))) && (((int) (index)) < ((int) (OLD_var0)))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(index, OLD_var0).allMatch(__expecto_jml_1 -> ((!(((((int) (index)) < ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var1)[__expecto_jml_1])))))))));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> index<OLD_var2));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (!fuzzexpr12 || fuzzexpr13));
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
