
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
    public void FuzzTest_add(CircularFifoQueue<Integer> fuzzobj_old, CircularFifoQueue<Integer> fuzzobj_new, Integer element, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (element));
var OLD_var1 = exec(() -> fuzzobj_old.size());
var OLD_var2 = exec(() -> fuzzobj_old.toArray());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!((OLD_var0 != null)) || (((((((boolean) (New_Ret)) == ((boolean) (true)))) && java.util.stream.IntStream.range(0, fuzzobj_new.size()).anyMatch(__expecto_jml_1 -> ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), OLD_var0))))) && (OLD_var0 == null)))))));
var fuzzexpr1 = exec(() -> (boolean) (New_Ret));
var fuzzexpr2 = exec(() -> (boolean) (false));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> fuzzobj_new.size());
var fuzzexpr5 = exec(() -> OLD_var1);
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.size()).allMatch(__expecto_jml_2 -> (java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_2]), ((Integer)(OLD_var2)[__expecto_jml_2]))))));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr8));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> element!=null));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(element)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr9) == (!fuzzexpr10 || fuzzexpr11));
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
