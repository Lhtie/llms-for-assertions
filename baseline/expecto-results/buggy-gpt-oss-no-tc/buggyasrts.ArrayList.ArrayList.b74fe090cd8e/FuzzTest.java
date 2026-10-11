
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import buggyasrts.mut_000.ArrayList;

public class FuzzTest{
    public void FuzzTest_ArrayList(ArrayList<Integer> fuzzobj_old, ArrayList<Integer> fuzzobj_new, java.util.Collection<Integer> c){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (c == null));
var OLD_var1 = exec(() -> (c.size()));
var OLD_var2 = exec(() -> (c.isEmpty()));
var OLD_var3 = exec(() -> c.toArray());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> !((((((int) (OLD_var1)) == ((int) ((fuzzobj_new.size()))))) && ((((boolean) (OLD_var2)) == ((boolean) ((fuzzobj_new.isEmpty())))))) && java.util.stream.IntStream.rangeClosed(0, OLD_var1).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var1))))) || ((((((Integer)(OLD_var3)[__expecto_jml_1]) == null) && (((Integer)fuzzobj_new.toArray()[__expecto_jml_1]) == null)) || (((((Integer)(OLD_var3)[__expecto_jml_1]) != null) && (((Integer)fuzzobj_new.toArray()[__expecto_jml_1]) != null)) && ((((int) (((Integer)(((Integer)(OLD_var3)[__expecto_jml_1]))).intValue())) == ((int) (((Integer)(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]))).intValue())))))))))))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> c!=null));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> !fuzzobj_new.equals(c)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (!fuzzexpr2 || fuzzexpr3));
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
