
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import org.apache.commons.collections4.BoundedCollection;

import c2s_aug.CircularFifoQueue;

public class FuzzTest{
    public void FuzzTest_CircularFifoQueue(CircularFifoQueue<Integer> fuzzobj_old, CircularFifoQueue<Integer> fuzzobj_new, java.util.Collection<Integer> coll){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (coll == null));
var OLD_var1 = exec(() -> (coll.size()));
var OLD_var2 = exec(() -> coll.toArray());

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 0; _i <= fuzzobj_new.size() - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (0<=i&&i<fuzzobj_new.size()) {
			Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzobj_new.get(i), coll.toArray()[i])));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr2));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var1).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var1))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var2)[__expecto_jml_1])))))))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> coll!=null));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (!fuzzexpr3 || fuzzexpr4));
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
