
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

import c2s_aug_sub.PriorityQueue;

public class FuzzTest{
    public void FuzzTest_retainAll(PriorityQueue<Integer> fuzzobj_old, PriorityQueue<Integer> fuzzobj_new, java.util.Collection<Integer> c, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> c.size());
var OLD_var1 = exec(() -> c.toArray());

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 0; _i <= fuzzobj_new.size() - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (0<=i && i<fuzzobj_new.size()) {
			Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> c.contains(fuzzobj_new.get(i))));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr1));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, fuzzobj_new.size()).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (fuzzobj_new.size()))))) || ((!((((Integer)fuzzobj_new.toArray()[__expecto_jml_1]) != null)) || (java.util.stream.IntStream.rangeClosed(0, OLD_var0).anyMatch(__expecto_jml_2 -> (((((((int) (0)) <= ((int) (__expecto_jml_2))) && (((int) (__expecto_jml_2)) < ((int) (OLD_var0)))) && (((Integer)(OLD_var1)[__expecto_jml_2]) != null)) && ((((int) (((Integer)(((Integer)(OLD_var1)[__expecto_jml_2]))).intValue())) == ((int) (((Integer)(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]))).intValue())))))))))))))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> c!=null));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0) == (!fuzzexpr2 || fuzzexpr3));
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
