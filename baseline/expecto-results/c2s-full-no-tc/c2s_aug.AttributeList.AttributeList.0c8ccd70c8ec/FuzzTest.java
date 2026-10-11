
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.*;
import java.util.ArrayList;
import javax.naming.directory.Attribute;
import javax.management.RuntimeOperationsException;

import c2s_aug.AttributeList;

public class FuzzTest{
    public void FuzzTest_AttributeList(AttributeList fuzzobj_old, AttributeList fuzzobj_new, AttributeList list){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (list==null));
var OLD_var1 = exec(() -> (list.size()));

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = 0; _i <= fuzzobj_new.size() - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (0<=i&&i<fuzzobj_new.size()) {
			var fuzzexpr2 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr3 = exec(() -> list.get(i));
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var1).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var1))))) || (java.util.Objects.equals(fuzzobj_new.toArray()[(((int) ((((int) (__expecto_jml_1)) * ((int) (OLD_var1))))) + ((int) (__expecto_jml_1)))/list.size()],list.get((((int) ((((int) (__expecto_jml_1)) * ((int) (OLD_var1))))) + ((int) (__expecto_jml_1)))%list.size()))))))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> list!=null));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr1) == (!fuzzexpr4 || fuzzexpr5));
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
