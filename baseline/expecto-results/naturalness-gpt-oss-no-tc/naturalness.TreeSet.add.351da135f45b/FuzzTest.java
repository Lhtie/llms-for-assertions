
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;

import naturalness.TreeSet;

public class FuzzTest{
    public void FuzzTest_add(TreeSet<Integer> fuzzobj_old, TreeSet<Integer> fuzzobj_new, Integer e, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> fuzzobj_old.size());
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> (e));
var OLD_var3 = exec(() -> (fuzzobj_old.size()));
var OLD_var4 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var5 = exec(() -> fuzzobj_old.contains(e));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(java.util.stream.IntStream.rangeClosed(0, OLD_var0).anyMatch(__expecto_jml_1 -> ((((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0)))) && (((Integer)(OLD_var1)[__expecto_jml_1]) != null)) && (OLD_var2 != null)) && ((((int) (((Integer)(((Integer)(OLD_var1)[__expecto_jml_1]))).intValue())) == ((int) (((Integer)(OLD_var2)).intValue()))))))))));
var fuzzexpr1 = exec(() -> (boolean) (New_Ret));
var fuzzexpr2 = exec(() -> (boolean) (false));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr5 = exec(() -> (int) (OLD_var3));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
var fuzzexpr7 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr8 = exec(() -> (boolean) (OLD_var4));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr7, fuzzexpr8)));
var fuzzexpr10 = exec(() -> fuzzobj_new.size());
var fuzzexpr11 = exec(() -> OLD_var0);
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr10, fuzzexpr11)));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.size()).allMatch(__expecto_jml_2 -> (java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_2]), ((Integer)(OLD_var1)[__expecto_jml_2]))))));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr9 && fuzzexpr14));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr15));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> e!=null));
Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> OLD_var5));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> fuzzexpr17 && fuzzexpr18));
var fuzzexpr20 = exec(() -> New_Ret);
var fuzzexpr21 = exec(() -> false);
Boolean fuzzexpr22 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr20, fuzzexpr21)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr16) == (!fuzzexpr19 || fuzzexpr22));
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
