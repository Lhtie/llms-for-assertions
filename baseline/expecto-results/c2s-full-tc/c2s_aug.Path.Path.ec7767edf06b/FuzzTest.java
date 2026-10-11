
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
    public void FuzzTest_Path(Path fuzzobj_old, Path fuzzobj_new){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values


        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (boolean) ((fuzzobj_new.empty())));
var fuzzexpr1 = exec(() -> (boolean) (true));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
var fuzzexpr3 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr4 = exec(() -> (int) (0));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, fuzzobj_new.getEdgePath().toArray().length).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (fuzzobj_new.getEdgePath().toArray().length))))) || (((((boolean) (fuzzobj_new.getEdgePath().toArray()[__expecto_jml_1]==null)) == ((boolean) (true))))))))));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.empty()));
        Boolean normalpost = exec(() -> (fuzzexpr6 && fuzzexpr7) == (fuzzexpr8));
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
