
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
    public void FuzzTest_addElement(Vector<Integer> fuzzobj_old, Vector<Integer> fuzzobj_new, Integer obj){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (obj));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((OLD_var0 != null))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[0]), OLD_var0)));
var fuzzexpr2 = exec(() -> obj);
var fuzzexpr3 = exec(() -> null);
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 == fuzzexpr3));
var fuzzexpr5 = exec(() -> fuzzobj_new.get(0));
var fuzzexpr6 = exec(() -> null);
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 == fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> obj!=null));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> obj.equals(fuzzobj_new.get(0))));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 && fuzzexpr10));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (fuzzexpr8 || fuzzexpr11));
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
