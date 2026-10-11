
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
var OLD_var2 = exec(() -> (list.isEmpty()));

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (boolean) (OLD_var0));
var fuzzexpr1 = exec(() -> (boolean) (false));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
var fuzzexpr3 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr4 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr5));
var fuzzexpr7 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr8 = exec(() -> (boolean) (OLD_var2));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr7, fuzzexpr8)));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr9));
var fuzzexpr11 = exec(() -> (boolean) ((fuzzobj_new.equals(list))));
var fuzzexpr12 = exec(() -> (boolean) (true));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr11, fuzzexpr12)));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, (list==null?0:fuzzobj_new.toArray().length*list.size())).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) ((list==null?0:fuzzobj_new.toArray().length*list.size())))))) || (((((boolean) (java.util.Objects.equals(fuzzobj_new.toArray()[__expecto_jml_1/list.size()],list.get(__expecto_jml_1%list.size())))) == ((boolean) (true))))))))));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> list!=null));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.equals(list)));
        Boolean normalpost = exec(() -> (fuzzexpr14 && fuzzexpr15) == (!fuzzexpr16 || fuzzexpr17));
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
