
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
    public void FuzzTest_flip(BitSet fuzzobj_old, BitSet fuzzobj_new, int bitIndex){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (bitIndex));
var OLD_var1 = exec(() -> (fuzzobj_old.length()));
var OLD_var2 = exec(() -> fuzzobj_old.length());
var OLD_var3 = exec(() -> fuzzobj_old.get(__expecto_jml_1));
var OLD_var4 = exec(() -> ((bitIndex >= 0 && fuzzobj_old.get(bitIndex))));
var OLD_var5 = exec(() -> fuzzobj_old.get(bitIndex));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> ((int) (0)) <= ((int) (OLD_var0))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> ((int) (OLD_var0)) < ((int) (OLD_var1))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 && fuzzexpr1));
var fuzzexpr3 = exec(() -> (int) ((fuzzobj_new.length())));
var fuzzexpr4 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr5));
var fuzzexpr7 = exec(() -> (int) (OLD_var2));
var fuzzexpr8 = exec(() -> (int) (fuzzobj_new.length()));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr7, fuzzexpr8)));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var2).allMatch(__expecto_jml_1 -> ((!((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var2)))) && ((!(((int) (__expecto_jml_1)) == ((int) (OLD_var0))))))) || (((((boolean) (OLD_var3)) == ((boolean) (fuzzobj_new.get(__expecto_jml_1)))))))))));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 && fuzzexpr10));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> !(((boolean) (((bitIndex >= 0 && fuzzobj_new.get(bitIndex))))) == ((boolean) (OLD_var4)))));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> bitIndex>=0));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(bitIndex)!=OLD_var5));
        Boolean normalpost = exec(() -> (fuzzexpr12 && fuzzexpr13) == (!fuzzexpr14 || fuzzexpr15));
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
