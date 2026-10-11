
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

import c2s_aug.Vector;

public class FuzzTest{
    public void FuzzTest_removeElementAt(Vector<Integer> fuzzobj_old, Vector<Integer> fuzzobj_new, int index){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> fuzzobj_old.toArray());
var OLD_var2 = exec(() -> fuzzobj_old.size()-1);
var OLD_var3_forallidx0_sample = exec(() -> fuzzobj_old.get(index + 1+1));
var OLD_var3_forallidx0 = exec(() -> {
	int capacity = (OLD_var2 - 1) - (index + 1) + 1;
	var ret = Array.newInstance(OLD_var3_forallidx0_sample.getClass(), capacity);
	int cur_idx = 0;
	for (int i = index + 1; i <= OLD_var2 - 1; i += 1) {
		Array.set(ret, cur_idx, fuzzobj_old.get(i+1));
		cur_idx += 1;
	}
	return ret;
});
var OLD_var3 = exec(() -> fuzzobj_old.size());

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = index + 1; _i <= OLD_var2 - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (index<i && i<OLD_var2) {
			var fuzzexpr16 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr17 = exec(() -> null);
			Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> fuzzexpr16 == fuzzexpr17));
			var fuzzexpr19 = exec(() -> get_from_array(OLD_var3_forallidx0, cur_idx, OLD_var3_forallidx0_sample));
			var fuzzexpr20 = exec(() -> null);
			Boolean fuzzexpr21 = Boolean.TRUE.equals(exec(() -> fuzzexpr19 == fuzzexpr20));
			Boolean fuzzexpr22 = Boolean.TRUE.equals(exec(() -> fuzzexpr18 && fuzzexpr21));
			Boolean fuzzexpr23 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(i).equals(get_from_array(OLD_var3_forallidx0, cur_idx, OLD_var3_forallidx0_sample))));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr22 || fuzzexpr23));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (0)) <= ((int) (index))) && (((int) (index)) < ((int) (OLD_var0)))))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) ((((int) (OLD_var0)) - ((int) (1)))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr5 = exec(() -> (boolean) (((((int) ((fuzzobj_new.size()))) == ((int) (0))))));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, index).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (index))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var1)[__expecto_jml_1])))))))));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr8));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(index, (fuzzobj_new.size())).allMatch(__expecto_jml_2 -> ((!(((((int) (index)) <= ((int) (__expecto_jml_2))) && (((int) (__expecto_jml_2)) < ((int) ((fuzzobj_new.size())))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_2]), ((Integer)(OLD_var1)[(((int) (__expecto_jml_2)) + ((int) (1)))])))))))));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 && fuzzexpr10));
var fuzzexpr12 = exec(() -> (Integer)fuzzobj_new.toArray()[(((int) (OLD_var0)) - ((int) (1)))]);
var fuzzexpr13 = exec(() -> null);
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 == fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 && fuzzexpr14));
Boolean fuzzexpr24 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr25 = Boolean.TRUE.equals(exec(() -> index<OLD_var3));
Boolean fuzzexpr26 = Boolean.TRUE.equals(exec(() -> fuzzexpr24 && fuzzexpr25));
Boolean fuzzexpr27 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr15) == (!fuzzexpr26 || fuzzexpr27));
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
