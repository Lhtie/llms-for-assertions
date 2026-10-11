
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.io.InvalidObjectException;

import c2s_aug.HashSet;

public class FuzzTest{
    public void FuzzTest_clone(HashSet<Integer> fuzzobj_old, HashSet<Integer> fuzzobj_new, HashSet<Integer> New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var2 = exec(() -> fuzzobj_old.size());
var OLD_var3 = exec(() -> fuzzobj_old.toArray());

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (int) (OLD_var0));
var fuzzexpr1 = exec(() -> (int) ((((HashSet<Integer>)New_Ret).size())));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
var fuzzexpr3 = exec(() -> (boolean) (OLD_var1));
var fuzzexpr4 = exec(() -> (boolean) ((((HashSet<Integer>)New_Ret).isEmpty())));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr5));
var fuzzexpr7 = exec(() -> OLD_var2);
var fuzzexpr8 = exec(() -> ((HashSet<Integer>)New_Ret).size());
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr7, fuzzexpr8)));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, OLD_var2).allMatch(__expecto_jml_1 -> (java.util.Objects.equals(((Integer)(OLD_var3)[__expecto_jml_1]), ((Integer)((HashSet<Integer>)New_Ret).toArray()[__expecto_jml_1]))))));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 && fuzzexpr10));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> New_Ret.equals(fuzzobj_new)));
        Boolean normalpost = exec(() -> (fuzzexpr6 && fuzzexpr11) == (fuzzexpr12));
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
