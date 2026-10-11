
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import c2s_aug.ArrayList;

public class FuzzTest{
    public void FuzzTest_toArray(ArrayList<Integer> fuzzobj_old, ArrayList<Integer> fuzzobj_new, Integer[] a, Integer[] New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (a==null));
var OLD_var1 = exec(() -> a.length);
var OLD_var2 = exec(() -> (fuzzobj_old.size()));

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 0; _i <= fuzzobj_new.size() - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (0<=i&&i<fuzzobj_new.size()) {
			Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> a.getClass().getComponentType().isInstance(fuzzobj_new.toArray()[i])));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr2));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((!OLD_var0) && ((((int) (OLD_var1)) >= ((int) (OLD_var2))))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> !(New_Ret == null)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> a!=null));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> New_Ret!=null));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (!fuzzexpr5 || fuzzexpr6));
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
