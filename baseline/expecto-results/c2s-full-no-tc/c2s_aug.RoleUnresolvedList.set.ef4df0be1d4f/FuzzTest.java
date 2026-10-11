
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
    public void FuzzTest_set(RoleUnresolvedList fuzzobj_old, RoleUnresolvedList fuzzobj_new, int index, Object element, Object New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (index));
var OLD_var1 = exec(() -> (fuzzobj_old.size()));
var OLD_var2 = exec(() -> fuzzobj_old.toArray());
var OLD_var3 = exec(() -> fuzzobj_old.size());
var OLD_var4 = exec(() -> fuzzobj_old.get(index));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (0)) <= ((int) (OLD_var0))) && (((int) (OLD_var0)) < ((int) (OLD_var1)))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(New_Ret,OLD_var2[OLD_var0])));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> index<OLD_var3));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr3));
var fuzzexpr5 = exec(() -> New_Ret);
var fuzzexpr6 = exec(() -> OLD_var4);
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (!fuzzexpr4 || fuzzexpr7));
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
