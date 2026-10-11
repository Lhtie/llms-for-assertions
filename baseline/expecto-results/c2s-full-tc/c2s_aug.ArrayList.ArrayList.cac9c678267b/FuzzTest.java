
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import c2s_aug.ArrayList;

public class FuzzTest{
    public void FuzzTest_ArrayList(ArrayList<Integer> fuzzobj_old, ArrayList<Integer> fuzzobj_new, java.util.Collection<Integer> c){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (c == null));
var OLD_var1 = exec(() -> (c.size()));
var OLD_var2 = exec(() -> (c.isEmpty()));
var OLD_var3 = exec(() -> c.size());
var OLD_var4 = exec(() -> c.toArray());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!((!OLD_var0)) || ((((((((((int) ((fuzzobj_new.size()))) == ((int) (OLD_var1)))) && ((((boolean) ((fuzzobj_new.isEmpty()))) == ((boolean) (OLD_var2))))) && ((((int) (fuzzobj_new.size())) == ((int) (OLD_var3))))) && java.util.stream.IntStream.rangeClosed(0, OLD_var3).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var3))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var4)[__expecto_jml_1])))))))) && ((((boolean) ((fuzzobj_new.equals(c)))) == ((boolean) (true))))) && OLD_var0))))));
var fuzzexpr1 = exec(() -> (boolean) ((fuzzobj_new.equals(c))));
var fuzzexpr2 = exec(() -> (boolean) (false));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> c!=null));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.equals(c)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr3) == (!fuzzexpr4 || fuzzexpr5));
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
