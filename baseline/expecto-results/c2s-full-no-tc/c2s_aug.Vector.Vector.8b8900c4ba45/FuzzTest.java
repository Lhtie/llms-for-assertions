
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

import c2s_aug.Vector;

public class FuzzTest{
    public void FuzzTest_Vector(Vector<Integer> fuzzobj_old, Vector<Integer> fuzzobj_new, int initialCapacity, int capacityIncrement){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values


        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((((((int) (initialCapacity)) >= ((int) (0)))) && ((((int) (capacityIncrement)) >= ((int) (0))))))));
var fuzzexpr1 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr2 = exec(() -> (boolean) (true));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr5 = exec(() -> (int) (0));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> initialCapacity>=0));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> capacityIncrement>=0));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 && fuzzexpr9));
var fuzzexpr11 = exec(() -> fuzzobj_new.size());
var fuzzexpr12 = exec(() -> 0);
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr11, fuzzexpr12)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr7) == (!fuzzexpr10 || fuzzexpr13));
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
