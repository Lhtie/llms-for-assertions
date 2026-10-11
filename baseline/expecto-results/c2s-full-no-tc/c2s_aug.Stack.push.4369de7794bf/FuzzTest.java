
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;

import c2s_aug.Stack;

public class FuzzTest{
    public void FuzzTest_push(Stack<Integer> fuzzobj_old, Stack<Integer> fuzzobj_new, Integer item, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (item));
var OLD_var1 = exec(() -> (fuzzobj_old.size()));
var OLD_var2 = exec(() -> fuzzobj_old.toArray());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(New_Ret, OLD_var0)));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) ((((int) (OLD_var1)) + ((int) (1)))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 && fuzzexpr3));
var fuzzexpr5 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr6 = exec(() -> (boolean) (false));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var1).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var1))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var2)[__expecto_jml_1])))))))));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 && fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[OLD_var1]), OLD_var0)));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr11));
var fuzzexpr13 = exec(() -> (int) (fuzzobj_new.size()));
var fuzzexpr14 = exec(() -> (int) ((fuzzobj_new.size())));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr13, fuzzexpr14)));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(item)));
        Boolean normalpost = exec(() -> (fuzzexpr12 && fuzzexpr15) == (fuzzexpr16));
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
