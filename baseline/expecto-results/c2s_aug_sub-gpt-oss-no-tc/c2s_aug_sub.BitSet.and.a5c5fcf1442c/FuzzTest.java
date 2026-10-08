
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.LongBuffer;

import c2s_aug_sub.BitSet;

public class FuzzTest{
    public void FuzzTest_and(BitSet fuzzobj_old, BitSet fuzzobj_new, BitSet set){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> fuzzobj_old.get(__expecto_jml_1));
var OLD_var1 = exec(() -> set.get(__expecto_jml_1));
var OLD_var2_forallidx0_sample = exec(() -> fuzzobj_old.get(0));
var OLD_var2_forallidx0 = exec(() -> {
	int capacity = (fuzzobj_old.length() - 1) - (0) + 1;
	var ret = Array.newInstance(OLD_var2_forallidx0_sample.getClass(), capacity);
	int cur_idx = 0;
	for (int i = 0; i <= fuzzobj_old.length() - 1; i += 1) {
		Array.set(ret, cur_idx, fuzzobj_old.get(i));
		cur_idx += 1;
	}
	return ret;
});

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 0; _i <= fuzzobj_new.length() - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (0<=i && i<fuzzobj_new.length()) {
			var fuzzexpr1 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr2 = exec(() -> get_from_array(OLD_var2_forallidx0, cur_idx, OLD_var2_forallidx0_sample));
			var fuzzexpr3 = exec(() -> true);
			Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
			var fuzzexpr5 = exec(() -> set.get(i));
			var fuzzexpr6 = exec(() -> true);
			Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
			var fuzzexpr8 = exec(() -> fuzzexpr4 && fuzzexpr7);
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr8)));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, (fuzzobj_new.length())).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) ((fuzzobj_new.length())))))) || (((((boolean) (fuzzobj_new.get(__expecto_jml_1))) == ((boolean) ((OLD_var0 && OLD_var1)))))))))));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0) == (fuzzexpr9));
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
