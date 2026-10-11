
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;

import buggycodes.mut_044.TreeSet;

public class FuzzTest{
    public void FuzzTest_pollFirst(TreeSet<Integer> fuzzobj_old, TreeSet<Integer> fuzzobj_new, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> (fuzzobj_old.size()));
var OLD_var3 = exec(() -> fuzzobj_old.isEmpty());
var OLD_var4 = exec(() -> fuzzobj_old.first());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !OLD_var0));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> ((Integer)(OLD_var1)[0]) != null));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 && fuzzexpr1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(New_Ret, ((Integer)(OLD_var1)[0]))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr3));
var fuzzexpr5 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr6 = exec(() -> (int) ((((int) (OLD_var2)) - ((int) (1)))));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr7));
var fuzzexpr9 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr10 = exec(() -> (boolean) (((((int) (OLD_var2)) == ((int) (1))))));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr9, fuzzexpr10)));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 && fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, (fuzzobj_new.size())).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) ((fuzzobj_new.size())))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var1)[(((int) (__expecto_jml_1)) + ((int) (1)))])))))))));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr13));
var fuzzexpr15 = exec(() -> (Integer)fuzzobj_new.toArray()[(fuzzobj_new.size())]);
var fuzzexpr16 = exec(() -> null);
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> fuzzexpr15 == fuzzexpr16));
Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> !OLD_var3));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(New_Ret,OLD_var4)));
        Boolean normalpost = exec(() -> (fuzzexpr14 && fuzzexpr17) == (!fuzzexpr18 || fuzzexpr19));
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
