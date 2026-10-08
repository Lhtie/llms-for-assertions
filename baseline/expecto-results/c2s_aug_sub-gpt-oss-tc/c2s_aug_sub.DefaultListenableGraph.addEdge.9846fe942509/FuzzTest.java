
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
var fuzzexpr0 = exec(() -> OLD_var0);
var fuzzexpr1 = exec(() -> null);
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 == fuzzexpr1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, fuzzobj_new.vertexSet().size()).anyMatch(__expecto_jml_1 -> ((((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (fuzzobj_new.vertexSet().size())))) && (OLD_var0 != null)) && (((Integer)fuzzobj_new.vertexSet().toArray()[__expecto_jml_1]) != null)) && ((((int) (((Integer)(OLD_var0)).intValue())) == ((int) (((Integer)(((Integer)fuzzobj_new.vertexSet().toArray()[__expecto_jml_1]))).intValue())))))))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.containsVertex(sourceVertex)));
        Boolean normalpost = exec(() -> (fuzzexpr2 || fuzzexpr3) == (fuzzexpr4));
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
