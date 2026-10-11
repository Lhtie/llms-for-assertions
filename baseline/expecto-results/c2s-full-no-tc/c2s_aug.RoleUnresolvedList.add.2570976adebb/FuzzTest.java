
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
var OLD_var1 = exec(() -> (fuzzobj_old.size()));
var OLD_var2 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var3 = exec(() -> fuzzobj_old.toArray().length);
var OLD_var4 = exec(() -> fuzzobj_old.toArray()[__expecto_jml_1]==null);
var OLD_var5 = exec(() -> java.util.Objects.equals(fuzzobj_old.toArray()[__expecto_jml_2],role));
var OLD_var6 = exec(() -> fuzzobj_old.toArray()[__expecto_jml_3]==role);
var OLD_var7 = exec(() -> fuzzobj_old.toArray()[__expecto_jml_4]==null);
var OLD_var8 = exec(() -> java.util.Objects.equals(fuzzobj_old.toArray()[__expecto_jml_4],role));
var OLD_var9 = exec(() -> fuzzobj_old.toArray()[__expecto_jml_4]==role);

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(OLD_var0)));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr5 = exec(() -> (boolean) (OLD_var2));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
var fuzzexpr8 = exec(() -> fuzzobj_new.toArray().length);
var fuzzexpr9 = exec(() -> OLD_var3);
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr8, fuzzexpr9)));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.toArray().length).allMatch(__expecto_jml_1 -> ((((boolean) (fuzzobj_new.toArray()[__expecto_jml_1]==null)) == ((boolean) (OLD_var4)))))));
Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr11));
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr12));
var fuzzexpr14 = exec(() -> fuzzobj_new.toArray().length);
var fuzzexpr15 = exec(() -> OLD_var3);
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr14, fuzzexpr15)));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.toArray().length).allMatch(__expecto_jml_2 -> ((((boolean) (java.util.Objects.equals(fuzzobj_new.toArray()[__expecto_jml_2],role))) == ((boolean) (OLD_var5)))))));
Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> fuzzexpr16 && fuzzexpr17));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> fuzzexpr13 && fuzzexpr18));
var fuzzexpr20 = exec(() -> fuzzobj_new.toArray().length);
var fuzzexpr21 = exec(() -> OLD_var3);
Boolean fuzzexpr22 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr20, fuzzexpr21)));
Boolean fuzzexpr23 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.range(0, fuzzobj_new.toArray().length).allMatch(__expecto_jml_3 -> ((((boolean) (fuzzobj_new.toArray()[__expecto_jml_3]==role)) == ((boolean) (OLD_var6)))))));
Boolean fuzzexpr24 = Boolean.TRUE.equals(exec(() -> fuzzexpr22 && fuzzexpr23));
Boolean fuzzexpr25 = Boolean.TRUE.equals(exec(() -> fuzzexpr19 && fuzzexpr24));
Boolean fuzzexpr26 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 || fuzzexpr25));
Boolean fuzzexpr27 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
var fuzzexpr28 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr29 = exec(() -> (int) ((((int) (OLD_var1)) + ((int) (1)))));
Boolean fuzzexpr30 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr28, fuzzexpr29)));
var fuzzexpr31 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr32 = exec(() -> (boolean) (false));
Boolean fuzzexpr33 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr31, fuzzexpr32)));
Boolean fuzzexpr34 = Boolean.TRUE.equals(exec(() -> fuzzexpr30 && fuzzexpr33));
Boolean fuzzexpr35 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var1).allMatch(__expecto_jml_4 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_4))) && (((int) (__expecto_jml_4)) < ((int) (OLD_var1))))) || (((((((boolean) (OLD_var7)) == ((boolean) (fuzzobj_new.toArray()[__expecto_jml_4]==null)))) && ((((boolean) (OLD_var8)) == ((boolean) (java.util.Objects.equals(fuzzobj_new.toArray()[__expecto_jml_4],role)))))) && ((((boolean) (OLD_var9)) == ((boolean) (fuzzobj_new.toArray()[__expecto_jml_4]==role)))))))))));
Boolean fuzzexpr36 = Boolean.TRUE.equals(exec(() -> fuzzexpr34 && fuzzexpr35));
var fuzzexpr37 = exec(() -> (boolean) (fuzzobj_new.toArray()[OLD_var1]==null));
var fuzzexpr38 = exec(() -> (boolean) (false));
Boolean fuzzexpr39 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr37, fuzzexpr38)));
var fuzzexpr40 = exec(() -> (boolean) (java.util.Objects.equals(fuzzobj_new.toArray()[OLD_var1],role)));
var fuzzexpr41 = exec(() -> (boolean) (true));
Boolean fuzzexpr42 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr40, fuzzexpr41)));
Boolean fuzzexpr43 = Boolean.TRUE.equals(exec(() -> fuzzexpr39 && fuzzexpr42));
var fuzzexpr44 = exec(() -> (boolean) (fuzzobj_new.toArray()[OLD_var1]==role));
var fuzzexpr45 = exec(() -> (boolean) (true));
Boolean fuzzexpr46 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr44, fuzzexpr45)));
Boolean fuzzexpr47 = Boolean.TRUE.equals(exec(() -> fuzzexpr43 && fuzzexpr46));
Boolean fuzzexpr48 = Boolean.TRUE.equals(exec(() -> fuzzexpr36 && fuzzexpr47));
Boolean fuzzexpr49 = Boolean.TRUE.equals(exec(() -> fuzzexpr27 || fuzzexpr48));
Boolean fuzzexpr50 = Boolean.TRUE.equals(exec(() -> role!=null));
Boolean fuzzexpr51 = Boolean.TRUE.equals(exec(() -> role.equals(fuzzobj_new.get(fuzzobj_new.size()-1))));
        Boolean normalpost = exec(() -> (fuzzexpr26 && fuzzexpr49) == (!fuzzexpr50 || fuzzexpr51));
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
