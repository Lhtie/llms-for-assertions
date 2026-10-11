
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
    public void FuzzTest_add(Vector<Integer> fuzzobj_old, Vector<Integer> fuzzobj_new, int index, Integer element){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> (element));
var OLD_var2 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (0)) <= ((int) (index))) && (((int) (index)) < ((int) (OLD_var0)))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> ((int) ((((int) (index)) + ((int) (1))))) < ((int) ((fuzzobj_new.size())))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[(((int) (index)) + ((int) (1)))]), OLD_var1)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr2));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> index<=OLD_var2));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr5));
var fuzzexpr7 = exec(() -> element);
var fuzzexpr8 = exec(() -> null);
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 == fuzzexpr8));
var fuzzexpr10 = exec(() -> fuzzobj_new.get(index+1));
var fuzzexpr11 = exec(() -> null);
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 == fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 && fuzzexpr12));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(index+1).equals(element)));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr13 || fuzzexpr14));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr3) == (!fuzzexpr6 || fuzzexpr15));
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
