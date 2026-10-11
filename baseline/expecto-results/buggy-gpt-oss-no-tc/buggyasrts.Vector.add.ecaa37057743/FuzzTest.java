
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
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(OLD_var0, ((Integer)fuzzobj_new.toArray()[0]))));
var fuzzexpr1 = exec(() -> e);
var fuzzexpr2 = exec(() -> null);
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 == fuzzexpr2));
var fuzzexpr4 = exec(() -> fuzzobj_new.get(0));
var fuzzexpr5 = exec(() -> null);
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 == fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> e!=null));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> e.equals(fuzzobj_new.get(0))));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 && fuzzexpr9));
        Boolean normalpost = exec(() -> (fuzzexpr0) == (fuzzexpr7 || fuzzexpr10));
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
