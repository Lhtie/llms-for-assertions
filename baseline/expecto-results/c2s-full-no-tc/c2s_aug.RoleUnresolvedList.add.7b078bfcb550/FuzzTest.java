
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
    public void FuzzTest_add(RoleUnresolvedList fuzzobj_old, RoleUnresolvedList fuzzobj_new, Object o, boolean New_Ret){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (int) ((((int) (OLD_var0)) + ((int) (1)))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> ((int) (0)) <= ((int) ((((int) ((fuzzobj_new.size()))) - ((int) (1)))))));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr3));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> ((int) ((((int) ((fuzzobj_new.size()))) - ((int) (1))))) < ((int) (fuzzobj_new.toArray().length))));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(fuzzobj_new.toArray()[(((int) ((fuzzobj_new.size()))) - ((int) (1)))],o)));
var fuzzexpr8 = exec(() -> o);
var fuzzexpr9 = exec(() -> null);
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 == fuzzexpr9));
var fuzzexpr11 = exec(() -> fuzzobj_new.get(fuzzobj_new.size()-1));
var fuzzexpr12 = exec(() -> null);
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 == fuzzexpr12));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> o!=null));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> o.equals(fuzzobj_new.get(fuzzobj_new.size()-1))));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> fuzzexpr15 && fuzzexpr16));
        Boolean normalpost = exec(() -> (fuzzexpr6 && fuzzexpr7) == (fuzzexpr14 || fuzzexpr17));
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
