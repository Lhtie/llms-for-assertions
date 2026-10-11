
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import c2s_aug.ArrayList;

public class FuzzTest{
    public void FuzzTest_add(ArrayList<Integer> fuzzobj_old, ArrayList<Integer> fuzzobj_new, Integer e, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> (e));

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr1 = exec(() -> (int) ((((int) (OLD_var0)) + ((int) (1)))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
var fuzzexpr3 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr4 = exec(() -> (boolean) (false));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr5));
var fuzzexpr7 = exec(() -> (boolean) (New_Ret));
var fuzzexpr8 = exec(() -> (boolean) (true));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr7, fuzzexpr8)));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var1)[__expecto_jml_1])))))))));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[OLD_var0]), OLD_var2)));
var fuzzexpr14 = exec(() -> e);
var fuzzexpr15 = exec(() -> null);
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> fuzzexpr14 == fuzzexpr15));
var fuzzexpr17 = exec(() -> fuzzobj_new.get(fuzzobj_new.size()-1));
var fuzzexpr18 = exec(() -> null);
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> fuzzexpr17 == fuzzexpr18));
Boolean fuzzexpr20 = Boolean.TRUE.equals(exec(() -> fuzzexpr16 && fuzzexpr19));
Boolean fuzzexpr21 = Boolean.TRUE.equals(exec(() -> e!=null));
Boolean fuzzexpr22 = Boolean.TRUE.equals(exec(() -> e.equals(fuzzobj_new.get(fuzzobj_new.size()-1))));
Boolean fuzzexpr23 = Boolean.TRUE.equals(exec(() -> fuzzexpr21 && fuzzexpr22));
        Boolean normalpost = exec(() -> (fuzzexpr12 && fuzzexpr13) == (fuzzexpr20 || fuzzexpr23));
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
