
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import org.jgrapht.graph.*;
import org.jgrapht.*;
import org.jgrapht.event.*;
import org.jgrapht.util.*;
import java.util.*;

import c2s_aug_sub.DefaultListenableGraph;

public class FuzzTest{
    public void FuzzTest_addEdge(DefaultListenableGraph<Integer,Integer> fuzzobj_old, DefaultListenableGraph<Integer,Integer> fuzzobj_new, Integer sourceVertex, Integer targetVertex, Integer e, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (e));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(New_Ret)));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> OLD_var0 != null));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.edgeSet().size()).anyMatch(__expecto_jml_1 -> (java.util.Objects.equals(OLD_var0, ((Integer)fuzzobj_new.edgeSet().toArray()[__expecto_jml_1]))))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr2));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.containsEdge(e)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr3) == (fuzzexpr4));
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
