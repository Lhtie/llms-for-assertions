
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
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> fuzzobj_old.toArray()[__expecto_jml_1]==role);

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr1 = exec(() -> (int) (OLD_var0));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
var fuzzexpr3 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr4 = exec(() -> (int) ((((int) (OLD_var0)) + ((int) (1)))));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
var fuzzexpr6 = exec(() -> fuzzobj_new.toArray()[(((int) ((fuzzobj_new.size()))) - ((int) (1)))]);
var fuzzexpr7 = exec(() -> role);
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr6, fuzzexpr7)));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 && fuzzexpr8));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 || fuzzexpr9));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0))))) || (((((boolean) (fuzzobj_new.toArray()[__expecto_jml_1]==role)) == ((boolean) (OLD_var1))))))))));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> role!=null));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> role.equals(fuzzobj_new.get(fuzzobj_new.size()-1))));
        Boolean normalpost = exec(() -> (fuzzexpr10 && fuzzexpr11) == (!fuzzexpr12 || fuzzexpr13));
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
