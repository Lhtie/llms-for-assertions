
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

import buggyasrts.mut_031.BitSet;

public class FuzzTest{
    public void FuzzTest_clear(BitSet fuzzobj_old, BitSet fuzzobj_new, int fromIndex, int toIndex){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.length()));
var OLD_var1 = exec(() -> (fromIndex));
var OLD_var2 = exec(() -> (toIndex));

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = fromIndex; _i <= toIndex - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (fromIndex<=i && i<toIndex) {
			var fuzzexpr1 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr2 = exec(() -> true);
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_1 -> ((!((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0)))) && ((((int) (OLD_var1)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var2)))))) || (((((boolean) (fuzzobj_new.get(__expecto_jml_1))) == ((boolean) (true))))))))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fromIndex>=0));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> toIndex>=fromIndex));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0) == (!fuzzexpr5 || fuzzexpr6));
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
