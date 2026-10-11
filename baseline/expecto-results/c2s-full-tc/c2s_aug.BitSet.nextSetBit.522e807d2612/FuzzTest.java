
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
    public void FuzzTest_nextSetBit(BitSet fuzzobj_old, BitSet fuzzobj_new, int fromIndex, int New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fromIndex));

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = fromIndex; _i <= New_Ret - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (i>=fromIndex && i<New_Ret) {
			var fuzzexpr8 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr9 = exec(() -> false);
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr8, fuzzexpr9)));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (New_Ret)) >= ((int) (0)))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(OLD_var0, New_Ret).allMatch(__expecto_jml_1 -> ((!(((((int) (OLD_var0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (New_Ret))))) || ((!fuzzobj_new.get(__expecto_jml_1))))))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> !(((((int) (New_Ret)) >= ((int) (0)))))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> New_Ret >= 0));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(New_Ret)));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 || fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr6));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fromIndex>=0));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> New_Ret!=-1));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr7) == (!fuzzexpr12 || fuzzexpr13));
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
