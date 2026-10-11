
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
    public void FuzzTest_add(RoleUnresolvedList fuzzobj_old, RoleUnresolvedList fuzzobj_new, javax.management.relation.RoleUnresolved role){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (role==null));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(OLD_var0)));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> true));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 || fuzzexpr1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> ((int) ((fuzzobj_new.size()))) > ((int) (0))));
var fuzzexpr5 = exec(() -> (boolean) (fuzzobj_new.toArray()[(((int) ((fuzzobj_new.size()))) - ((int) (1)))]==role));
var fuzzexpr6 = exec(() -> (boolean) (true));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 || fuzzexpr8));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> role!=null));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> role.equals(fuzzobj_new.get(fuzzobj_new.size()-1))));
        Boolean normalpost = exec(() -> (fuzzexpr2 && fuzzexpr9) == (!fuzzexpr10 || fuzzexpr11));
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
