
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import c2s_aug.LinkedList;

public class FuzzTest{
    public void FuzzTest_add(LinkedList<Integer> fuzzobj_old, LinkedList<Integer> fuzzobj_new, int index, Integer element){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> (element));
var OLD_var2 = exec(() -> fuzzobj_old.toArray());
var OLD_var3 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (0)) <= ((int) (index))) && (((int) (index)) <= ((int) (OLD_var0)))))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) ((((int) (OLD_var0)) + ((int) (1)))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> OLD_var1 != null));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, index).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (index))))) || ((((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var2)[__expecto_jml_1]))) && (java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[index]), Integer.valueOf(((int) (((Integer)(OLD_var1)).intValue())))))) && java.util.stream.IntStream.rangeClosed(index, (fuzzobj_new.size())).allMatch(__expecto_jml_2 -> ((!(((((int) (index)) < ((int) (__expecto_jml_2))) && (((int) (__expecto_jml_2)) < ((int) ((fuzzobj_new.size())))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_2]), ((Integer)(OLD_var2)[(((int) (__expecto_jml_2)) - ((int) (1)))]))))))))))))));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> index<=OLD_var3));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 && fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(element)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr7) == (!fuzzexpr10 || fuzzexpr11));
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
