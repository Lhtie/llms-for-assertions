
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

import buggycodes.mut_038.BitSet;

public class FuzzTest{
    public void FuzzTest_xor(BitSet fuzzobj_old, BitSet fuzzobj_new, BitSet set){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.length()));
var OLD_var1 = exec(() -> fuzzobj_old.get(__expecto_jml_1));
var OLD_var2 = exec(() -> (set.length()));
var OLD_var3 = exec(() -> set.get(__expecto_jml_1));
var OLD_var4_forallidx0_sample = exec(() -> fuzzobj_old.get(0));
var OLD_var4_forallidx0 = exec(() -> {
	int capacity = (fuzzobj_old.length() - 1) - (0) + 1;
	var ret = Array.newInstance(OLD_var4_forallidx0_sample.getClass(), capacity);
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
			var fuzzexpr2 = exec(() -> get_from_array(OLD_var4_forallidx0, cur_idx, OLD_var4_forallidx0_sample) ^ set.get(i));
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, (((((int) (OLD_var0)) <= ((int) ((fuzzobj_new.length()))))) ? OLD_var0 : (fuzzobj_new.length()))).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) ((((((int) (OLD_var0)) <= ((int) ((fuzzobj_new.length()))))) ? OLD_var0 : (fuzzobj_new.length()))))))) || ((((((boolean) (fuzzobj_new.get(__expecto_jml_1))) == ((boolean) (((((((int) (__expecto_jml_1)) < ((int) (OLD_var0)))) ? OLD_var1 : false) && (!(((((int) (__expecto_jml_1)) < ((int) (OLD_var2)))) ? OLD_var3 : false))))))) || ((!(((((int) (__expecto_jml_1)) < ((int) (OLD_var0)))) ? OLD_var1 : false)) && (((((int) (__expecto_jml_1)) < ((int) (OLD_var2)))) ? OLD_var3 : false)))))))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0) == (fuzzexpr3));
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
