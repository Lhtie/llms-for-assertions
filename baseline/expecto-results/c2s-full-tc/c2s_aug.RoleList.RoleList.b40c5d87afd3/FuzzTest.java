
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import javax.management.relation.Role;

import c2s_aug.RoleList;

public class FuzzTest{
    public void FuzzTest_RoleList(RoleList fuzzobj_old, RoleList fuzzobj_new, java.util.List<javax.management.relation.Role> list){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (list==null));
var OLD_var1 = exec(() -> (list.size()));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(OLD_var0)));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) (0));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.isEmpty()));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> !(fuzzobj_new.equals(list))));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 || fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
var fuzzexpr10 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr11 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr10, fuzzexpr11)));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.equals(list)));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 || fuzzexpr14));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> list!=null));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.equals(list)));
        Boolean normalpost = exec(() -> (fuzzexpr8 && fuzzexpr15) == (!fuzzexpr16 || fuzzexpr17));
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
