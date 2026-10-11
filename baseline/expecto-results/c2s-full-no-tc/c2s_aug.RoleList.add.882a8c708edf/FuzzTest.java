
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import javax.management.relation.Role;

import c2s_aug.RoleList;

public class FuzzTest{
    public void FuzzTest_add(RoleList fuzzobj_old, RoleList fuzzobj_new, Object o, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values


        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> ((int) ((fuzzobj_new.size()))) > ((int) (0))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(fuzzobj_new.toArray()[(((int) ((fuzzobj_new.size()))) - ((int) (1)))],o)));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 && fuzzexpr1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> New_Ret));
var fuzzexpr4 = exec(() -> o);
var fuzzexpr5 = exec(() -> null);
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 == fuzzexpr5));
var fuzzexpr7 = exec(() -> fuzzobj_new.get(fuzzobj_new.size()-1));
var fuzzexpr8 = exec(() -> null);
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 == fuzzexpr8));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> o!=null));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> o.equals(fuzzobj_new.get(fuzzobj_new.size()-1))));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 && fuzzexpr12));
        Boolean normalpost = exec(() -> (fuzzexpr2 && fuzzexpr3) == (fuzzexpr10 || fuzzexpr13));
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
