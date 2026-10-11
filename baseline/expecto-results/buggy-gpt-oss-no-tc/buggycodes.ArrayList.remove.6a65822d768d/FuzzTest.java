
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import buggycodes.mut_006.ArrayList;

public class FuzzTest{
    public void FuzzTest_remove(ArrayList<Integer> fuzzobj_old, ArrayList<Integer> fuzzobj_new, int index, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> fuzzobj_old.size());
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> fuzzobj_old.indexOf(fuzzobj_old.get(index)));
var OLD_var3 = exec(() -> fuzzobj_old.lastIndexOf(fuzzobj_old.get(index)));
var OLD_var4 = exec(() -> fuzzobj_old.get(index));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((New_Ret != null) && java.util.stream.IntStream.rangeClosed(0, OLD_var0).anyMatch(__expecto_jml_1 -> (((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0)))) && (java.util.Objects.equals(((Integer)(OLD_var1)[__expecto_jml_1]), Integer.valueOf(((int) (((Integer)(New_Ret)).intValue())))))) && java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_2 -> ((!((((((int) (0)) <= ((int) (__expecto_jml_2))) && (((int) (__expecto_jml_2)) < ((int) (OLD_var0)))) && ((!(((int) (__expecto_jml_2)) == ((int) (__expecto_jml_1))))))) || (((!java.util.Objects.equals(((Integer)(OLD_var1)[__expecto_jml_2]), Integer.valueOf(((int) (((Integer)(New_Ret)).intValue())))))))))))))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, fuzzobj_new.size()).allMatch(__expecto_jml_3 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_3))) && (((int) (__expecto_jml_3)) < ((int) (fuzzobj_new.size()))))) || (((!java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_3]), Integer.valueOf(((int) (((Integer)(New_Ret)).intValue()))))))))))));
var fuzzexpr2 = exec(() -> OLD_var2);
var fuzzexpr3 = exec(() -> OLD_var3);
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> !fuzzobj_new.contains(OLD_var4)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (!fuzzexpr4 || fuzzexpr5));
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
