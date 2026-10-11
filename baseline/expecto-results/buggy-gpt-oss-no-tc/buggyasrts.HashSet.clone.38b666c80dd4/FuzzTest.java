
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.io.InvalidObjectException;

import buggyasrts.mut_000.HashSet;

public class FuzzTest{
    public void FuzzTest_clone(HashSet<Integer> fuzzobj_old, HashSet<Integer> fuzzobj_new, HashSet<Integer> New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values


        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (boolean) ((((boolean)(New_Ret == fuzzobj_new)))));
var fuzzexpr1 = exec(() -> (boolean) (false));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> !((((((int) ((fuzzobj_new.size()))) == ((int) ((((HashSet<Integer>)New_Ret).size()))))) && ((((boolean) ((fuzzobj_new.isEmpty()))) == ((boolean) ((((HashSet<Integer>)New_Ret).isEmpty())))))) && java.util.stream.IntStream.rangeClosed(0, (fuzzobj_new.size())).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) ((fuzzobj_new.size())))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)((HashSet<Integer>)New_Ret).toArray()[__expecto_jml_1]))))))))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> !New_Ret.equals(fuzzobj_new)));
        Boolean normalpost = exec(() -> (fuzzexpr2 && fuzzexpr3) == (fuzzexpr4));
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
