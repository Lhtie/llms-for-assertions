
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

import buggyasrts.mut_009.Vector;

public class FuzzTest{
    public void FuzzTest_add(Vector<Integer> fuzzobj_old, Vector<Integer> fuzzobj_new, int index, Integer element){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> (element));
var OLD_var2 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> ((int) (0)) <= ((int) (index))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> ((int) (index)) <= ((int) (OLD_var0))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 && fuzzexpr1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[0]), OLD_var1)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> index<=OLD_var2));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(fuzzobj_new.get(0),element)));
        Boolean normalpost = exec(() -> (fuzzexpr2 && fuzzexpr3) == (!fuzzexpr6 || fuzzexpr7));
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
