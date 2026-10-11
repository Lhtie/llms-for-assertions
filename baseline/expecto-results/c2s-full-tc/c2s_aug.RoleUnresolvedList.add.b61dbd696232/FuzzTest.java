
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.io.Serializable;
import javax.management.relation.RoleUnresolved;

import c2s_aug.RoleUnresolvedList;

public class FuzzTest{
    public void FuzzTest_add(RoleUnresolvedList fuzzobj_old, RoleUnresolvedList fuzzobj_new, Object o, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (o==null));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, (fuzzobj_new.size())).anyMatch(__expecto_jml_1 -> ((((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) ((fuzzobj_new.size()))))) && (((!OLD_var0) && java.util.Objects.equals(fuzzobj_new.toArray()[__expecto_jml_1],o)) || (OLD_var0 && fuzzobj_new.toArray()[__expecto_jml_1]==null)))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(o)));
        Boolean normalpost = exec(() -> (fuzzexpr0) == (fuzzexpr1));
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
