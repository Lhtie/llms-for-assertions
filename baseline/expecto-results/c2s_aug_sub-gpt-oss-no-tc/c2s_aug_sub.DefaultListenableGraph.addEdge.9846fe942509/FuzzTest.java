
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
var OLD_var0 = exec(() -> (sourceVertex));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((OLD_var0 == null))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> true));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 || fuzzexpr1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> !((OLD_var0 != null))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, fuzzobj_new.vertexSet().size()).anyMatch(__expecto_jml_1 -> (((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (fuzzobj_new.vertexSet().size())))) && (((Integer)fuzzobj_new.vertexSet().toArray()[__expecto_jml_1]) != null)) && ((((int) (((Integer)(((Integer)fuzzobj_new.vertexSet().toArray()[__expecto_jml_1]))).intValue())) == ((int) (((Integer)(OLD_var0)).intValue())))))))));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 || fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.containsVertex(sourceVertex)));
        Boolean normalpost = exec(() -> (fuzzexpr2 && fuzzexpr5) == (fuzzexpr6));
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
