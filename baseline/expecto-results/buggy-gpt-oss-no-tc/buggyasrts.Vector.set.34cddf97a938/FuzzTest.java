
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
    public void FuzzTest_set(Vector<Integer> fuzzobj_old, Vector<Integer> fuzzobj_new, int index, Integer element, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> (element));
var OLD_var2 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var3 = exec(() -> fuzzobj_old.toArray());
var OLD_var4 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (0)) <= ((int) (index))) && (((int) (index)) < ((int) (OLD_var0)))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(New_Ret, OLD_var1)));
var fuzzexpr2 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr3 = exec(() -> (int) (OLD_var0));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr4));
var fuzzexpr6 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr7 = exec(() -> (boolean) (OLD_var2));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr6, fuzzexpr7)));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 && fuzzexpr8));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0))))) || ((!((!(((((int) (__expecto_jml_1)) == ((int) (index))))) || (((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), OLD_var1)) && ((!(((int) (__expecto_jml_1)) == ((int) (index))))))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var3)[__expecto_jml_1])))))))))));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 && fuzzexpr10));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> index<OLD_var4));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr13));
var fuzzexpr15 = exec(() -> New_Ret);
var fuzzexpr16 = exec(() -> element);
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr15, fuzzexpr16)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr11) == (!fuzzexpr14 || fuzzexpr17));
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
