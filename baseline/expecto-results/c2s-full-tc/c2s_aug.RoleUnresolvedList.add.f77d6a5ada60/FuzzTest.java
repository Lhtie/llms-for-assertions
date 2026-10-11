
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
    public void FuzzTest_add(RoleUnresolvedList fuzzobj_old, RoleUnresolvedList fuzzobj_new, int index, Object element){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (index));
var OLD_var1 = exec(() -> (fuzzobj_old.size()));
var OLD_var2 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((((((int) (0)) <= ((int) (OLD_var0)))) && ((((int) (OLD_var0)) <= ((int) (OLD_var1))))))));
var fuzzexpr1 = exec(() -> (boolean) (java.util.Objects.equals(fuzzobj_new.toArray()[OLD_var0],element)));
var fuzzexpr2 = exec(() -> (boolean) (true));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> index<=OLD_var2));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(element)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr3) == (!fuzzexpr6 || fuzzexpr7));
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
