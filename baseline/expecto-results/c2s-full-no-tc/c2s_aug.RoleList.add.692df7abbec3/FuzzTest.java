
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import javax.management.relation.Role;

import c2s_aug.RoleList;

public class FuzzTest{
    public void FuzzTest_add(RoleList fuzzobj_old, RoleList fuzzobj_new, int index, Object element){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (index));
var OLD_var1 = exec(() -> (fuzzobj_old.size()));
var OLD_var2 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((((((int) (0)) <= ((int) (OLD_var0)))) && ((((int) (OLD_var0)) < ((int) (OLD_var1))))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(fuzzobj_new.toArray()[OLD_var0],element)));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> index<=OLD_var2));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr3));
var fuzzexpr5 = exec(() -> element);
var fuzzexpr6 = exec(() -> null);
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 == fuzzexpr6));
var fuzzexpr8 = exec(() -> fuzzobj_new.get(index));
var fuzzexpr9 = exec(() -> null);
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 == fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr10));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(index).equals(element)));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 || fuzzexpr12));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (!fuzzexpr4 || fuzzexpr13));
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
