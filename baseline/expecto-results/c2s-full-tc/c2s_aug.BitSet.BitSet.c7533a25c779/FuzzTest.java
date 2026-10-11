
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
    public void FuzzTest_BitSet(BitSet fuzzobj_old, BitSet fuzzobj_new, int nbits){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (nbits));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (OLD_var0)) >= ((int) (0)))))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.length())));
var fuzzexpr2 = exec(() -> (int) (0));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr5 = exec(() -> (boolean) (true));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
var fuzzexpr8 = exec(() -> (int) ((fuzzobj_new.cardinality())));
var fuzzexpr9 = exec(() -> (int) (0));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr8, fuzzexpr9)));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr10));
var fuzzexpr12 = exec(() -> fuzzobj_new.length());
var fuzzexpr13 = exec(() -> 0);
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr12, fuzzexpr13)));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.length()).allMatch(__expecto_jml_1 -> ((((boolean) (fuzzobj_new.get(__expecto_jml_1))) == ((boolean) ((new Integer[]{})[__expecto_jml_1])))))));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> fuzzexpr14 && fuzzexpr15));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 && fuzzexpr16));
Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> nbits>=0));
var fuzzexpr19 = exec(() -> fuzzobj_new.length());
var fuzzexpr20 = exec(() -> 0);
Boolean fuzzexpr21 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr19, fuzzexpr20)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr17) == (!fuzzexpr18 || fuzzexpr21));
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
