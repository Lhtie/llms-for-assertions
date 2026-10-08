
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
    public void FuzzTest_flip(BitSet fuzzobj_old, BitSet fuzzobj_new, int bitIndex){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (bitIndex));
var OLD_var1 = exec(() -> (fuzzobj_old.length()));
var OLD_var2 = exec(() -> fuzzobj_old.get((bitIndex)));
var OLD_var3 = exec(() -> fuzzobj_old.get(__expecto_jml_1));
var OLD_var4 = exec(() -> ((bitIndex >= 0 && fuzzobj_old.get(bitIndex))));
var OLD_var5 = exec(() -> fuzzobj_old.get(bitIndex));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> ((int) (0)) <= ((int) (OLD_var0))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> ((int) (OLD_var0)) < ((int) (OLD_var1))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 && fuzzexpr1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> !(((boolean) (fuzzobj_new.get(OLD_var0))) == ((boolean) (OLD_var2)))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr3));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var1).allMatch(__expecto_jml_1 -> ((!((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var1)))) && ((!(((int) (__expecto_jml_1)) == ((int) (OLD_var0))))))) || (((((boolean) (fuzzobj_new.get(__expecto_jml_1))) == ((boolean) (OLD_var3))))))))));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> !(((boolean) (((bitIndex >= 0 && fuzzobj_new.get(bitIndex))))) == ((boolean) (OLD_var4)))));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> bitIndex>=0));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(bitIndex)!=OLD_var5));
        Boolean normalpost = exec(() -> (fuzzexpr6 && fuzzexpr7) == (!fuzzexpr8 || fuzzexpr9));
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
