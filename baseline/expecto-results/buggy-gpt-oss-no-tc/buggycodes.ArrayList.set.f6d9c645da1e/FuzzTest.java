
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import buggycodes.mut_004.ArrayList;

public class FuzzTest{
    public void FuzzTest_set(ArrayList<Integer> fuzzobj_old, ArrayList<Integer> fuzzobj_new, int index, Integer element, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var2 = exec(() -> fuzzobj_old.size());
var OLD_var3 = exec(() -> (element));
var OLD_var4 = exec(() -> fuzzobj_old.toArray());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (0)) <= ((int) (index))) && (((int) (index)) < ((int) (OLD_var0)))))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) (OLD_var0));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr5 = exec(() -> (boolean) (OLD_var1));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> !((((((int) (fuzzobj_new.size())) == ((int) (OLD_var2)))) && ((((int) (0)) <= ((int) (index))) && (((int) (index)) < ((int) (OLD_var2))))))));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var2).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var2))))) || (((!(((((int) (__expecto_jml_1)) == ((int) (index))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), OLD_var3)))) && (!(((!(((int) (__expecto_jml_1)) == ((int) (index)))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var4)[__expecto_jml_1]))))))))))));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 || fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr10));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(New_Ret, ((Integer)(OLD_var4)[index]))));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 && fuzzexpr12));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> index<OLD_var2));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> fuzzexpr14 && fuzzexpr15));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(fuzzobj_new.get(index),element)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr13) == (!fuzzexpr16 || fuzzexpr17));
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
