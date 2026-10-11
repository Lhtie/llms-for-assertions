
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

import buggyasrts.mut_000.PriorityQueue;

public class FuzzTest{
    public void FuzzTest_remove(PriorityQueue<Integer> fuzzobj_old, PriorityQueue<Integer> fuzzobj_new, Integer o, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (o));
var OLD_var1 = exec(() -> fuzzobj_old.size());
var OLD_var2 = exec(() -> fuzzobj_old.toArray());
var OLD_var3 = exec(() -> (fuzzobj_old.size()));
var OLD_var4 = exec(() -> fuzzobj_old.contains(o));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((OLD_var0 != null) && java.util.stream.IntStream.rangeClosed(0, OLD_var1).anyMatch(__expecto_jml_1 -> ((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var1)))) && (java.util.Objects.equals(((Integer)(OLD_var2)[__expecto_jml_1]), OLD_var0)))))))));
var fuzzexpr1 = exec(() -> (boolean) (New_Ret));
var fuzzexpr2 = exec(() -> (boolean) (true));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr5 = exec(() -> (int) ((((int) (OLD_var3)) - ((int) (2)))));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> OLD_var4));
var fuzzexpr9 = exec(() -> fuzzobj_new.size());
var fuzzexpr10 = exec(() -> OLD_var1-2);
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr9, fuzzexpr10)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr7) == (!fuzzexpr8 || fuzzexpr11));
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
