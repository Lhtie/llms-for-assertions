
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
    public void FuzzTest_toArray(PriorityQueue<Integer> fuzzobj_old, PriorityQueue<Integer> fuzzobj_new, Integer[] New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> fuzzobj_old.size());
var OLD_var1 = exec(() -> (fuzzobj_old.size()));
var OLD_var2 = exec(() -> fuzzobj_old.toArray());

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 0; _i <= fuzzobj_new.size() - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (0<=i && i<fuzzobj_new.size()) {
			var fuzzexpr14 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr15 = exec(() -> null);
			Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> fuzzexpr14 == fuzzexpr15));
			var fuzzexpr17 = exec(() -> New_Ret[i+1]);
			var fuzzexpr18 = exec(() -> null);
			Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> fuzzexpr17 == fuzzexpr18));
			Boolean fuzzexpr20 = Boolean.TRUE.equals(exec(() -> fuzzexpr16 && fuzzexpr19));
			Boolean fuzzexpr21 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(i).equals(New_Ret[i+1])));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr20 || fuzzexpr21));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
var fuzzexpr0 = exec(() -> (int) (OLD_var0));
var fuzzexpr1 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
var fuzzexpr3 = exec(() -> (int) (New_Ret.length));
var fuzzexpr4 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, (((int) (OLD_var1)) - ((int) (1)))).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) ((((int) (OLD_var1)) - ((int) (1)))))))) || ((java.util.Objects.equals(((Integer)New_Ret[(((int) (__expecto_jml_1)) + ((int) (1)))]), ((Integer)(OLD_var2)[__expecto_jml_1])))))))));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> !(((((int) (OLD_var1)) > ((int) (0)))))));
var fuzzexpr10 = exec(() -> (Integer)New_Ret[0]);
var fuzzexpr11 = exec(() -> null);
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 == fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 || fuzzexpr12));
Boolean fuzzexpr22 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr8 && fuzzexpr13) == (fuzzexpr22));
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
