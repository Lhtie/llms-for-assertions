
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


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (OLD_var0)) >= ((int) (0)))))));
var fuzzexpr1 = exec(() -> (int) (New_Ret));
var fuzzexpr2 = exec(() -> (int) ((-((int) (1)))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> ((int) (New_Ret)) >= ((int) (OLD_var0))));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> ((int) (New_Ret)) < ((int) ((fuzzobj_new.length())))));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(New_Ret)));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 || fuzzexpr8));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fromIndex>=0));
var fuzzexpr11 = exec(() -> New_Ret);
var fuzzexpr12 = exec(() -> -1);
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr11, fuzzexpr12)));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> New_Ret>=fromIndex));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr13 || fuzzexpr14));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr9) == (!fuzzexpr10 || fuzzexpr15));
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
