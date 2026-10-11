
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
    public void FuzzTest_insertElementAt(Vector<Integer> fuzzobj_old, Vector<Integer> fuzzobj_new, Integer obj, int index){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> (obj));
var OLD_var2 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((((((int) (0)) <= ((int) (index)))) && ((((int) (index)) < ((int) (OLD_var0))))))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) ((((int) (OLD_var0)) + ((int) (1)))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> OLD_var1 != null));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[(((int) (index)) + ((int) (1)))]), OLD_var1)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> index<=OLD_var2));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 && fuzzexpr9));
var fuzzexpr11 = exec(() -> obj);
var fuzzexpr12 = exec(() -> null);
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 == fuzzexpr12));
var fuzzexpr14 = exec(() -> fuzzobj_new.get(index+1));
var fuzzexpr15 = exec(() -> null);
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> fuzzexpr14 == fuzzexpr15));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> fuzzexpr13 && fuzzexpr16));
Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(index+1).equals(obj)));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> fuzzexpr17 || fuzzexpr18));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr7) == (!fuzzexpr10 || fuzzexpr19));
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
