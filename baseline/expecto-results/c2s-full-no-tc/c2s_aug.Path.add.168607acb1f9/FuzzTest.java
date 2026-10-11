
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Stream;
import org.graphstream.graph.Structure;
import org.graphstream.graph.Node;
import org.graphstream.graph.Edge;

import c2s_aug.Path;

public class FuzzTest{
    public void FuzzTest_add(Path fuzzobj_old, Path fuzzobj_new, org.graphstream.graph.Edge edge){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values


        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> ((int) ((((int) ((fuzzobj_new.size()))) - ((int) (1))))) >= ((int) (0))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(fuzzobj_new.getEdgePath().toArray()[(((int) ((fuzzobj_new.size()))) - ((int) (1)))],edge)));
var fuzzexpr2 = exec(() -> edge);
var fuzzexpr3 = exec(() -> null);
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 == fuzzexpr3));
var fuzzexpr5 = exec(() -> fuzzobj_new.getEdgePath().get(fuzzobj_new.size()-1));
var fuzzexpr6 = exec(() -> null);
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 == fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> edge!=null));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> edge.equals(fuzzobj_new.getEdgePath().get(fuzzobj_new.size()-1))));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 && fuzzexpr10));
        Boolean normalpost = exec(() -> (fuzzexpr0 && fuzzexpr1) == (fuzzexpr8 || fuzzexpr11));
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
