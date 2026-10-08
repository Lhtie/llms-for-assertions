
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
    public void FuzzTest_flip(BitSet fuzzobj_old, BitSet fuzzobj_new, int fromIndex, int toIndex){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fromIndex));
var OLD_var1 = exec(() -> (toIndex));
var OLD_var2 = exec(() -> (fuzzobj_old.length()));
var OLD_var3 = exec(() -> fuzzobj_old.get(__expecto_jml_1));
var OLD_var4_forallidx0_sample = exec(() -> fuzzobj_old.get(fromIndex));
var OLD_var4_forallidx0 = exec(() -> {
	int capacity = (toIndex - 1) - (fromIndex) + 1;
	var ret = Array.newInstance(OLD_var4_forallidx0_sample.getClass(), capacity);
	int cur_idx = 0;
	for (int i = fromIndex; i <= toIndex - 1; i += 1) {
		Array.set(ret, cur_idx, fuzzobj_old.get(i));
		cur_idx += 1;
	}
	return ret;
});

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = fromIndex; _i <= toIndex - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (fromIndex<=i && i<toIndex) {
			Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(i)!=get_from_array(OLD_var4_forallidx0, cur_idx, OLD_var4_forallidx0_sample)));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr2));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((((int) (0)) <= ((int) (OLD_var0)))) && ((((int) (OLD_var0)) <= ((int) (OLD_var1))))) && ((((int) (OLD_var1)) <= ((int) (OLD_var2))))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var2).allMatch(__expecto_jml_1 -> ((!((((((int) (0)) <= ((int) (__expecto_jml_1)))) && ((((int) (__expecto_jml_1)) < ((int) (OLD_var2)))))) || (((!((((((int) (OLD_var0)) <= ((int) (__expecto_jml_1)))) && ((((int) (__expecto_jml_1)) < ((int) (OLD_var1)))))) || (((!(((boolean) (fuzzobj_new.get(__expecto_jml_1))) == ((boolean) (OLD_var3))))))) && (!((((((int) (__expecto_jml_1)) < ((int) (OLD_var0)))) || ((((int) (__expecto_jml_1)) >= ((int) (OLD_var1)))))) || (((((boolean) (fuzzobj_new.get(__expecto_jml_1))) == ((boolean) (OLD_var3)))))))))))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fromIndex>=0));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> toIndex>=fromIndex));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
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
