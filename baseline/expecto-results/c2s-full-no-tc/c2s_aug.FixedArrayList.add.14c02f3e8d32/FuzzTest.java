
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

import c2s_aug.FixedArrayList;

public class FuzzTest{
    public void FuzzTest_add(FixedArrayList<Integer> fuzzobj_old, FixedArrayList<Integer> fuzzobj_new, Integer element, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (element));
var OLD_var1 = exec(() -> (fuzzobj_old.size()));
var OLD_var2 = exec(() -> fuzzobj_old.toArray());
var OLD_var3 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> New_Ret));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> !((OLD_var0 != null))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, fuzzobj_new.size()).anyMatch(__expecto_jml_1 -> ((((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (fuzzobj_new.size())))) && (java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_1]), OLD_var0))) && (((((int) (__expecto_jml_1)) == ((int) (OLD_var1)))) || (java.util.Objects.equals(((Integer)(OLD_var2)[__expecto_jml_1]), null)))) && ((((((int) (fuzzobj_new.size())) == ((int) (OLD_var3)))) || (((((int) (fuzzobj_new.size())) == ((int) ((((int) (OLD_var3)) + ((int) (1))))))) && ((((int) (__expecto_jml_1)) == ((int) (OLD_var3)))))) && java.util.stream.IntStream.rangeClosed(0, OLD_var3).allMatch(__expecto_jml_2 -> ((!((((((int) (0)) <= ((int) (__expecto_jml_2))) && (((int) (__expecto_jml_2)) < ((int) (OLD_var3)))) && ((!(((int) (__expecto_jml_2)) == ((int) (__expecto_jml_1))))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_2]), ((Integer)(OLD_var2)[__expecto_jml_2])))))))))))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 || fuzzexpr2));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> element!=null));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> element.equals(fuzzobj_new.get(fuzzobj_new.size()-1))));
        Boolean normalpost = exec(() -> (fuzzexpr0 && fuzzexpr3) == (!fuzzexpr4 || fuzzexpr5));
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
