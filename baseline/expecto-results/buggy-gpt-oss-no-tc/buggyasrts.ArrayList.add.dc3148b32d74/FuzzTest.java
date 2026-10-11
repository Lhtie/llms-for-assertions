
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import buggyasrts.mut_000.ArrayList;

public class FuzzTest{
    public void FuzzTest_add(ArrayList<Integer> fuzzobj_old, ArrayList<Integer> fuzzobj_new, int index, Integer element){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> fuzzobj_old.toArray());
var OLD_var1_forallidx0_sample = exec(() -> fuzzobj_old.get(0));
var OLD_var1_forallidx0 = exec(() -> {
	int capacity = (index) - (0) + 1;
	var ret = Array.newInstance(OLD_var1_forallidx0_sample.getClass(), capacity);
	int cur_idx = 0;
	for (int i = 0; i <= index; i += 1) {
		Array.set(ret, cur_idx, fuzzobj_old.get(i));
		cur_idx += 1;
	}
	return ret;
});
var OLD_var1 = exec(() -> fuzzobj_old.size());

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 0; _i <= index; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (0 <= i&&i <= index) {
			var fuzzexpr1 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr2 = exec(() -> null);
			Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 == fuzzexpr2));
			var fuzzexpr4 = exec(() -> get_from_array(OLD_var1_forallidx0, cur_idx, OLD_var1_forallidx0_sample));
			var fuzzexpr5 = exec(() -> null);
			Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 == fuzzexpr5));
			Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
			Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(i).equals(get_from_array(OLD_var1_forallidx0, cur_idx, OLD_var1_forallidx0_sample))));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr7 || fuzzexpr8));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, index).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) <= ((int) (index))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var0)[__expecto_jml_1])))))))));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> index<=OLD_var1));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 && fuzzexpr10));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0) == (!fuzzexpr11 || fuzzexpr12));
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
