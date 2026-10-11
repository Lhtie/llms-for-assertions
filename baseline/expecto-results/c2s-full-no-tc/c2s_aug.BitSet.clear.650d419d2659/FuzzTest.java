
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
    public void FuzzTest_clear(BitSet fuzzobj_old, BitSet fuzzobj_new){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.length()));

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (int) ((fuzzobj_new.length())));
var fuzzexpr1 = exec(() -> (int) (OLD_var0));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.isEmpty()));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr3));
var fuzzexpr5 = exec(() -> (int) ((fuzzobj_new.cardinality())));
var fuzzexpr6 = exec(() -> (int) (0));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, (fuzzobj_new.length())).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) ((fuzzobj_new.length())))))) || ((!fuzzobj_new.get(__expecto_jml_1))))))));
var fuzzexpr10 = exec(() -> fuzzobj_new.cardinality());
var fuzzexpr11 = exec(() -> 0);
        Boolean normalpost = exec(() -> (fuzzexpr8 && fuzzexpr9) == (Objects.equals(fuzzexpr10, fuzzexpr11)));
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
