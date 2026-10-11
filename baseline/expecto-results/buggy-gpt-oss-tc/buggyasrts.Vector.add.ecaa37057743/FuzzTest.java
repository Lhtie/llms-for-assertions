
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import buggyasrts.mut_000.Vector;

public class FuzzTest{
    public void FuzzTest_add(Vector<Integer> fuzzobj_old, Vector<Integer> fuzzobj_new, Integer e, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (e));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> OLD_var0 != null));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> ((Integer)fuzzobj_new.toArray()[0]) != null));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 && fuzzexpr1));
var fuzzexpr3 = exec(() -> (int) (((Integer)(OLD_var0)).intValue()));
var fuzzexpr4 = exec(() -> (int) (((Integer)(((Integer)fuzzobj_new.toArray()[0]))).intValue()));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
var fuzzexpr6 = exec(() -> e);
var fuzzexpr7 = exec(() -> null);
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 == fuzzexpr7));
var fuzzexpr9 = exec(() -> fuzzobj_new.get(0));
var fuzzexpr10 = exec(() -> null);
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 == fuzzexpr10));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 && fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> e!=null));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> e.equals(fuzzobj_new.get(0))));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr13 && fuzzexpr14));
        Boolean normalpost = exec(() -> (fuzzexpr2 && fuzzexpr5) == (fuzzexpr12 || fuzzexpr15));
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
