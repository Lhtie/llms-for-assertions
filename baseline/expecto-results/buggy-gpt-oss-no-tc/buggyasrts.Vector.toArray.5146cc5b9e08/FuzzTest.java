
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import buggyasrts.mut_000.Vector;

public class FuzzTest{
    public void FuzzTest_toArray(Vector<Integer> fuzzobj_old, Vector<Integer> fuzzobj_new, Integer[] New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> fuzzobj_old.size());
var OLD_var1 = exec(() -> fuzzobj_old.toArray());

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 0; _i <= fuzzobj_new.size() - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (0<=i && i<fuzzobj_new.size()) {
			var fuzzexpr8 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr9 = exec(() -> null);
			Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 == fuzzexpr9));
			var fuzzexpr11 = exec(() -> New_Ret[i+1]);
			var fuzzexpr12 = exec(() -> null);
			Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 == fuzzexpr12));
			Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr13));
			Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(i).equals(New_Ret[i+1])));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr14 || fuzzexpr15));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
var fuzzexpr0 = exec(() -> (int) (New_Ret.length));
var fuzzexpr1 = exec(() -> (int) ((((int) (OLD_var0)) + ((int) (1)))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
var fuzzexpr3 = exec(() -> (Integer)New_Ret[0]);
var fuzzexpr4 = exec(() -> null);
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 == fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0))))) || ((java.util.Objects.equals(((Integer)New_Ret[(((int) (__expecto_jml_1)) + ((int) (1)))]), ((Integer)(OLD_var1)[__expecto_jml_1])))))))));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr6 && fuzzexpr7) == (fuzzexpr16));
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
