
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.function.Consumer;

import buggyasrts.mut_004.ArrayList;

public class FuzzTest{
    public void FuzzTest_set(ArrayList<Integer> fuzzobj_old, ArrayList<Integer> fuzzobj_new, int index, Integer element, Integer New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var2 = exec(() -> fuzzobj_old.toArray());
var OLD_var3 = exec(() -> (element));
var OLD_var4 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> ((int) (0)) <= ((int) (index))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> ((int) (index)) < ((int) (OLD_var0))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 && fuzzexpr1));
var fuzzexpr3 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr4 = exec(() -> (int) (OLD_var0));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr5));
var fuzzexpr7 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr8 = exec(() -> (boolean) (OLD_var1));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr7, fuzzexpr8)));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(New_Ret, ((Integer)(OLD_var2)[index]))));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0))))) || (((!(((((int) (__expecto_jml_1)) == ((int) (index))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), OLD_var3)))) && (!(((!(((int) (__expecto_jml_1)) == ((int) (index)))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), ((Integer)(OLD_var2)[__expecto_jml_1]))))))))))));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> index<OLD_var4));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> fuzzexpr14 && fuzzexpr15));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(fuzzobj_new.get(0),element)));
        Boolean normalpost = exec(() -> (fuzzexpr12 && fuzzexpr13) == (!fuzzexpr16 || fuzzexpr17));
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
