
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

import c2s_aug.BitSet;

public class FuzzTest{
    public void FuzzTest_valueOf(BitSet fuzzobj_old, BitSet fuzzobj_new, java.nio.ByteBuffer bb, BitSet New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> ((int)bb.get(__expecto_jml_1)));

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 0; _i <= New_Ret.toByteArray().length - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (0<=i && i<New_Ret.toByteArray().length) {
			var fuzzexpr2 = exec(() -> New_Ret.toByteArray()[i]);
			var fuzzexpr3 = exec(() -> bb.get(i));
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(New_Ret == null)));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, New_Ret.toByteArray().length).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (New_Ret.toByteArray().length))))) || (((((int) (((int)New_Ret.toByteArray()[__expecto_jml_1]))) == ((int) (OLD_var0))))))))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> New_Ret!=null));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 && fuzzexpr1) == (fuzzexpr4 && fuzzexpr5));
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
