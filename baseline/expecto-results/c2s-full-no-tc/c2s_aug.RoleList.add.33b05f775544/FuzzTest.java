
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import javax.management.relation.Role;

import c2s_aug.RoleList;

public class FuzzTest{
    public void FuzzTest_add(RoleList fuzzobj_old, RoleList fuzzobj_new, javax.management.relation.Role role){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (role==null));
var OLD_var1 = exec(() -> (fuzzobj_old.size()));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) ((((int) (OLD_var1)) + ((int) (1)))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 || fuzzexpr3));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(fuzzobj_new.toArray()[(((int) ((fuzzobj_new.size()))) - ((int) (1)))],role)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 || fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> role!=null));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> role.equals(fuzzobj_new.get(fuzzobj_new.size()-1))));
        Boolean normalpost = exec(() -> (fuzzexpr4 && fuzzexpr7) == (!fuzzexpr8 || fuzzexpr9));
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
