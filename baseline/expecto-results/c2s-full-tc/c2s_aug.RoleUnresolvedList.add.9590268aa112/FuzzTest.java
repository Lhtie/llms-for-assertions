
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
var OLD_var2 = exec(() -> fuzzobj_old.toArray().length);
var OLD_var3 = exec(() -> fuzzobj_old.toArray()[__expecto_jml_1]==null);
var OLD_var4 = exec(() -> fuzzobj_old.toArray()[__expecto_jml_2]==null);
var OLD_var5 = exec(() -> java.util.Objects.equals(fuzzobj_old.toArray()[__expecto_jml_3],element));
var OLD_var6 = exec(() -> java.util.Objects.equals(fuzzobj_old.toArray()[__expecto_jml_4],element));
var OLD_var7 = exec(() -> fuzzobj_old.toArray()[__expecto_jml_5]==element);
var OLD_var8 = exec(() -> fuzzobj_old.toArray()[__expecto_jml_6]==element);
var OLD_var9 = exec(() -> fuzzobj_old.size());
var OLD_var10_forallidx0_sample = exec(() -> fuzzobj_old.get(index));
var OLD_var10_forallidx0 = exec(() -> {
	int capacity = (OLD_var9 - 1) - (index) + 1;
	var ret = Array.newInstance(OLD_var10_forallidx0_sample.getClass(), capacity);
	int cur_idx = 0;
	for (int i = index; i <= OLD_var9 - 1; i += 1) {
		Array.set(ret, cur_idx, fuzzobj_old.get(i));
		cur_idx += 1;
	}
	return ret;
});

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = index; _i <= OLD_var9 - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (index <= i&&i <OLD_var9) {
			var fuzzexpr28 = exec(() -> fuzzobj_new.get(i+1));
			var fuzzexpr29 = exec(() -> null);
			Boolean fuzzexpr30 = Boolean.TRUE.equals(exec(() -> fuzzexpr28 == fuzzexpr29));
			var fuzzexpr31 = exec(() -> get_from_array(OLD_var10_forallidx0, cur_idx, OLD_var10_forallidx0_sample));
			var fuzzexpr32 = exec(() -> null);
			Boolean fuzzexpr33 = Boolean.TRUE.equals(exec(() -> fuzzexpr31 == fuzzexpr32));
			Boolean fuzzexpr34 = Boolean.TRUE.equals(exec(() -> fuzzexpr30 && fuzzexpr33));
			Boolean fuzzexpr35 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(i+1).equals(get_from_array(OLD_var10_forallidx0, cur_idx, OLD_var10_forallidx0_sample))));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr34 || fuzzexpr35));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((((((int) (0)) <= ((int) (OLD_var0)))) && ((((int) (OLD_var0)) <= ((int) (OLD_var1))))))));
var fuzzexpr1 = exec(() -> (int) (fuzzobj_new.toArray().length));
var fuzzexpr2 = exec(() -> (int) ((((int) (OLD_var2)) + ((int) (1)))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0))))) || (((((boolean) (OLD_var3)) == ((boolean) (fuzzobj_new.toArray()[__expecto_jml_1]==null))))))))));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(OLD_var0, OLD_var2).allMatch(__expecto_jml_2 -> ((!(((((int) (OLD_var0)) <= ((int) (__expecto_jml_2))) && (((int) (__expecto_jml_2)) < ((int) (OLD_var2))))) || (((((boolean) (fuzzobj_new.toArray()[(((int) (__expecto_jml_2)) + ((int) (1)))]==null)) == ((boolean) (OLD_var4))))))))));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 && fuzzexpr6));
var fuzzexpr8 = exec(() -> (int) (fuzzobj_new.toArray().length));
var fuzzexpr9 = exec(() -> (int) ((((int) (OLD_var2)) + ((int) (1)))));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr8, fuzzexpr9)));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_3 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_3))) && (((int) (__expecto_jml_3)) < ((int) (OLD_var0))))) || (((((boolean) (OLD_var5)) == ((boolean) (java.util.Objects.equals(fuzzobj_new.toArray()[__expecto_jml_3],element)))))))))));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(OLD_var0, OLD_var2).allMatch(__expecto_jml_4 -> ((!(((((int) (OLD_var0)) <= ((int) (__expecto_jml_4))) && (((int) (__expecto_jml_4)) < ((int) (OLD_var2))))) || (((((boolean) (java.util.Objects.equals(fuzzobj_new.toArray()[(((int) (__expecto_jml_4)) + ((int) (1)))],element))) == ((boolean) (OLD_var6))))))))));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr14));
var fuzzexpr16 = exec(() -> (int) (fuzzobj_new.toArray().length));
var fuzzexpr17 = exec(() -> (int) ((((int) (OLD_var2)) + ((int) (1)))));
Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr16, fuzzexpr17)));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_5 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_5))) && (((int) (__expecto_jml_5)) < ((int) (OLD_var0))))) || (((((boolean) (OLD_var7)) == ((boolean) (fuzzobj_new.toArray()[__expecto_jml_5]==element))))))))));
Boolean fuzzexpr20 = Boolean.TRUE.equals(exec(() -> fuzzexpr18 && fuzzexpr19));
Boolean fuzzexpr21 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(OLD_var0, OLD_var2).allMatch(__expecto_jml_6 -> ((!(((((int) (OLD_var0)) <= ((int) (__expecto_jml_6))) && (((int) (__expecto_jml_6)) < ((int) (OLD_var2))))) || (((((boolean) (fuzzobj_new.toArray()[(((int) (__expecto_jml_6)) + ((int) (1)))]==element)) == ((boolean) (OLD_var8))))))))));
Boolean fuzzexpr22 = Boolean.TRUE.equals(exec(() -> fuzzexpr20 && fuzzexpr21));
Boolean fuzzexpr23 = Boolean.TRUE.equals(exec(() -> fuzzexpr15 && fuzzexpr22));
var fuzzexpr24 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr25 = exec(() -> (int) ((((int) (OLD_var1)) + ((int) (1)))));
Boolean fuzzexpr26 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr24, fuzzexpr25)));
Boolean fuzzexpr27 = Boolean.TRUE.equals(exec(() -> fuzzexpr23 && fuzzexpr26));
Boolean fuzzexpr36 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr37 = Boolean.TRUE.equals(exec(() -> index<=OLD_var9));
Boolean fuzzexpr38 = Boolean.TRUE.equals(exec(() -> fuzzexpr36 && fuzzexpr37));
Boolean fuzzexpr39 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr27) == (!fuzzexpr38 || fuzzexpr39));
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
