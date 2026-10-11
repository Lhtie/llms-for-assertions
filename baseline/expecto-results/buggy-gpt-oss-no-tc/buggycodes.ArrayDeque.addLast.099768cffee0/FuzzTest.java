
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.io.Serializable;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import buggycodes.mut_018.ArrayDeque;

public class FuzzTest{
    public void FuzzTest_addLast(ArrayDeque<Integer> fuzzobj_old, ArrayDeque<Integer> fuzzobj_new, Integer e){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> fuzzobj_old.size());
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> (e));
var OLD_var3 = exec(() -> (fuzzobj_old.size()));
var OLD_var4 = exec(() -> (fuzzobj_old.isEmpty()));

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> fuzzobj_new.size());
var fuzzexpr1 = exec(() -> OLD_var0 + 1);
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.size()).allMatch(__expecto_jml_1 -> (java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), (__expecto_jml_1 < OLD_var0 ? ((Integer)(OLD_var1)[__expecto_jml_1]) : (new Integer[]{((Integer)(OLD_var2))})[(__expecto_jml_1 - OLD_var0)]))))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr3));
var fuzzexpr5 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr6 = exec(() -> (int) ((OLD_var0 + 1)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr7));
var fuzzexpr9 = exec(() -> (int) (OLD_var3));
var fuzzexpr10 = exec(() -> (int) (OLD_var0));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr9, fuzzexpr10)));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 && fuzzexpr11));
var fuzzexpr13 = exec(() -> (boolean) (OLD_var4));
var fuzzexpr14 = exec(() -> (boolean) (((((int) (OLD_var3)) == ((int) (0))))));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr13, fuzzexpr14)));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr15));
var fuzzexpr17 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr18 = exec(() -> (boolean) (((((int) ((fuzzobj_new.size()))) == ((int) (0))))));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr17, fuzzexpr18)));
Boolean fuzzexpr20 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(fuzzobj_new.getLast(),e)));
        Boolean normalpost = exec(() -> (fuzzexpr16 && fuzzexpr19) == (fuzzexpr20));
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
