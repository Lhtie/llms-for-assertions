
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
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.equals(c)));
var fuzzexpr2 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr3 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr4));
var fuzzexpr6 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr7 = exec(() -> (boolean) (OLD_var2));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr6, fuzzexpr7)));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 && fuzzexpr8));
var fuzzexpr10 = exec(() -> fuzzobj_new.size());
var fuzzexpr11 = exec(() -> OLD_var3);
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr10, fuzzexpr11)));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.size()).allMatch(__expecto_jml_1 -> (java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var4)[__expecto_jml_1]))))));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 && fuzzexpr14));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> c!=null));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.equals(c)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr15) == (!fuzzexpr16 || fuzzexpr17));
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
