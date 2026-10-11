
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
var OLD_var3 = exec(() -> fuzzobj_old.toArray());
var OLD_var4_forallidx0_sample = exec(() -> fuzzobj_old.get(index + 1));
var OLD_var4_forallidx0 = exec(() -> {
	int capacity = (fuzzobj_old.size() - 1) - (index + 1) + 1;
	var ret = Array.newInstance(OLD_var4_forallidx0_sample.getClass(), capacity);
	int cur_idx = 0;
	for (int i = index + 1; i <= fuzzobj_old.size() - 1; i += 1) {
		Array.set(ret, cur_idx, fuzzobj_old.get(i));
		cur_idx += 1;
	}
	return ret;
});
var OLD_var4 = exec(() -> fuzzobj_old.size());

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = index + 1; _i <= fuzzobj_new.size() - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (index<i && i<fuzzobj_new.size()) {
			var fuzzexpr6 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr7 = exec(() -> null);
			Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 == fuzzexpr7));
			var fuzzexpr9 = exec(() -> get_from_array(OLD_var4_forallidx0, cur_idx, OLD_var4_forallidx0_sample));
			var fuzzexpr10 = exec(() -> null);
			Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr9 == fuzzexpr10));
			Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 && fuzzexpr11));
			Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(i).equals(get_from_array(OLD_var4_forallidx0, cur_idx, OLD_var4_forallidx0_sample))));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr12 || fuzzexpr13));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((((((int) (0)) <= ((int) (OLD_var0))) && (((int) (OLD_var0)) < ((int) (OLD_var1)))) && (!OLD_var2)))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(OLD_var0, OLD_var1).allMatch(__expecto_jml_1 -> ((!(((((int) (OLD_var0)) < ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var1))))) || ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var1))))) || (java.util.Objects.equals(fuzzobj_new.toArray()[(((int) ((((int) (__expecto_jml_1)) * ((int) (OLD_var1))))) + ((int) (__expecto_jml_1)))/OLD_var3.length],OLD_var3[(((int) ((((int) (__expecto_jml_1)) * ((int) (OLD_var1))))) + ((int) (__expecto_jml_1)))%OLD_var3.length])))))))));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> index<OLD_var4));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> role!=null));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> fuzzexpr14 && fuzzexpr15 && fuzzexpr16));
Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr5) == (!fuzzexpr17 || fuzzexpr18));
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
