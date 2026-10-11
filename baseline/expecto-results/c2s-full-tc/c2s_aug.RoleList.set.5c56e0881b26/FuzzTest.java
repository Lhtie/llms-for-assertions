
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import javax.management.relation.Role;

import c2s_aug.RoleList;

public class FuzzTest{
    public void FuzzTest_set(RoleList fuzzobj_old, RoleList fuzzobj_new, int index, javax.management.relation.Role role){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (index));
var OLD_var1 = exec(() -> (fuzzobj_old.size()));
var OLD_var2 = exec(() -> (role==null));
var OLD_var3 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((((int) (0)) <= ((int) (OLD_var0)))) && ((((int) (OLD_var0)) < ((int) (OLD_var1))))) && (!OLD_var2)))));
var fuzzexpr1 = exec(() -> fuzzobj_new.toArray()[OLD_var0]);
var fuzzexpr2 = exec(() -> role);
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> index<OLD_var3));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> role!=null));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr5 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(index).equals(role)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr3) == (!fuzzexpr7 || fuzzexpr8));
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
