
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;

import naturalness.TreeSet;

public class FuzzTest{
    public void FuzzTest_pollFirst(TreeSet<Integer> fuzzobj_old, TreeSet<Integer> fuzzobj_new, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> fuzzobj_old.size());
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> fuzzobj_old.first());

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr1 = exec(() -> (boolean) (((((int) ((fuzzobj_new.size()))) == ((int) (0))))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> !(((((int) ((fuzzobj_new.size()))) == ((int) (0)))))));
var fuzzexpr4 = exec(() -> fuzzobj_new.size());
var fuzzexpr5 = exec(() -> 0);
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.size()).allMatch(__expecto_jml_1 -> (java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), (new Integer[]{})[__expecto_jml_1])))));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 || fuzzexpr8));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> !((New_Ret != null))));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).anyMatch(__expecto_jml_2 -> ((((((((int) (0)) <= ((int) (__expecto_jml_2))) && (((int) (__expecto_jml_2)) < ((int) (OLD_var0)))) && (((Integer)(OLD_var1)[__expecto_jml_2]) != null)) && ((((int) (((Integer)(New_Ret)).intValue())) == ((int) (((Integer)(((Integer)(OLD_var1)[__expecto_jml_2]))).intValue()))))) && java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_3 -> ((!((((((int) (0)) <= ((int) (__expecto_jml_3))) && (((int) (__expecto_jml_3)) < ((int) (OLD_var0)))) && (((Integer)(OLD_var1)[__expecto_jml_3]) != null))) || (((((int) (((Integer)(New_Ret)).intValue())) <= ((int) (((Integer)(((Integer)(OLD_var1)[__expecto_jml_3]))).intValue())))))))))))));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 || fuzzexpr12));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> New_Ret!=null));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> New_Ret.equals(OLD_var2)));
        Boolean normalpost = exec(() -> (fuzzexpr10 && fuzzexpr13) == (!fuzzexpr14 || fuzzexpr15));
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
