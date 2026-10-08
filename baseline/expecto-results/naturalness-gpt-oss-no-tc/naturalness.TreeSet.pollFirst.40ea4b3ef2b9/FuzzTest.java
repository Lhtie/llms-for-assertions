
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
var OLD_var0 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var1 = exec(() -> (fuzzobj_old.size()));
var OLD_var2 = exec(() -> fuzzobj_old.size());
var OLD_var3 = exec(() -> fuzzobj_old.toArray());
var OLD_var4 = exec(() -> fuzzobj_old.first());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(OLD_var0)));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(New_Ret, null)));
var fuzzexpr2 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr3 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr4));
var fuzzexpr6 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr7 = exec(() -> (boolean) (OLD_var0));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr6, fuzzexpr7)));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 && fuzzexpr8));
var fuzzexpr10 = exec(() -> fuzzobj_new.size());
var fuzzexpr11 = exec(() -> OLD_var2);
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr10, fuzzexpr11)));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.size()).allMatch(__expecto_jml_1 -> (java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var3)[__expecto_jml_1]))))));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 && fuzzexpr14));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 || fuzzexpr15));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> New_Ret != null));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var2).allMatch(__expecto_jml_2 -> ((!((((((int) (0)) <= ((int) (__expecto_jml_2))) && (((int) (__expecto_jml_2)) < ((int) (OLD_var2)))) && (((Integer)(OLD_var3)[__expecto_jml_2]) != null))) || ((((((int) (((Integer)(New_Ret)).intValue())) <= ((int) (((Integer)(((Integer)(OLD_var3)[__expecto_jml_2]))).intValue())))) && java.util.stream.IntStream.rangeClosed(0, OLD_var2).anyMatch(__expecto_jml_3 -> (((((((((int) (0)) <= ((int) (__expecto_jml_3))) && (((int) (__expecto_jml_3)) < ((int) (OLD_var2)))) && (java.util.Objects.equals(((Integer)(OLD_var3)[__expecto_jml_3]), New_Ret))) && ((((int) ((fuzzobj_new.size()))) == ((int) ((((int) (OLD_var1)) - ((int) (1)))))))) && ((((boolean) ((fuzzobj_new.isEmpty()))) == ((boolean) (((((int) ((fuzzobj_new.size()))) == ((int) (0))))))))) && java.util.stream.IntStream.rangeClosed(0, OLD_var2).allMatch(__expecto_jml_4 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_4))) && (((int) (__expecto_jml_4)) < ((int) (OLD_var2))))) || ((!((!(((((int) (__expecto_jml_4)) == ((int) (__expecto_jml_3))))) || (((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_4]), null)) && ((!(((int) (__expecto_jml_4)) == ((int) (__expecto_jml_3))))))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_4]), ((Integer)(OLD_var3)[__expecto_jml_4])))))))))))))))))));
Boolean fuzzexpr20 = Boolean.TRUE.equals(exec(() -> fuzzexpr18 && fuzzexpr19));
Boolean fuzzexpr21 = Boolean.TRUE.equals(exec(() -> fuzzexpr17 || fuzzexpr20));
Boolean fuzzexpr22 = Boolean.TRUE.equals(exec(() -> New_Ret!=null));
Boolean fuzzexpr23 = Boolean.TRUE.equals(exec(() -> New_Ret.equals(OLD_var4)));
        Boolean normalpost = exec(() -> (fuzzexpr16 && fuzzexpr21) == (!fuzzexpr22 || fuzzexpr23));
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
