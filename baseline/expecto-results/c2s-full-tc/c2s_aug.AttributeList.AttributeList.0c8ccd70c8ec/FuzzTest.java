
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
			var fuzzexpr4 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr5 = exec(() -> list.get(i));
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> !(((((int) (OLD_var1)) == ((int) ((fuzzobj_new.size()))))))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.equals(list)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 || fuzzexpr2));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> list!=null));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr3) == (!fuzzexpr6 || fuzzexpr7));
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
