
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
    public void FuzzTest_clear(Vector<Integer> fuzzobj_old, Vector<Integer> fuzzobj_new){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values


        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.isEmpty()));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) (0));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 && fuzzexpr3));
var fuzzexpr5 = exec(() -> fuzzobj_new.size());
var fuzzexpr6 = exec(() -> 0);
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.size()).allMatch(__expecto_jml_1 -> (java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), (new Integer[]{})[__expecto_jml_1])))));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr8));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, fuzzobj_new.size()).allMatch(__expecto_jml_2 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_2))) && (((int) (__expecto_jml_2)) < ((int) (fuzzobj_new.size()))))) || ((((Integer)fuzzobj_new.toArray()[__expecto_jml_2]) == null)))))));
var fuzzexpr12 = exec(() -> fuzzobj_new.size());
var fuzzexpr13 = exec(() -> 0);
        Boolean normalpost = exec(() -> (fuzzexpr10 && fuzzexpr11) == (Objects.equals(fuzzexpr12, fuzzexpr13)));
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
