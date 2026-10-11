
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
    public void FuzzTest_add(AttributeList fuzzobj_old, AttributeList fuzzobj_new, javax.naming.directory.Attribute attribute){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> fuzzobj_old.toArray()[__expecto_jml_1]==attribute);

        // compute forall


        // normal post condition
var fuzzexpr0 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr1 = exec(() -> (int) ((((int) (OLD_var0)) + ((int) (1)))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr0, fuzzexpr1)));
var fuzzexpr3 = exec(() -> (boolean) (java.util.Objects.equals(fuzzobj_new.toArray()[(((int) ((fuzzobj_new.size()))) - ((int) (1)))],attribute)));
var fuzzexpr4 = exec(() -> (boolean) (true));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr3, fuzzexpr4)));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, OLD_var0).allMatch(__expecto_jml_1 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_1))) && (((int) (__expecto_jml_1)) < ((int) (OLD_var0))))) || (((((boolean) (fuzzobj_new.toArray()[__expecto_jml_1]==attribute)) == ((boolean) (OLD_var1))))))))));
var fuzzexpr8 = exec(() -> attribute);
var fuzzexpr9 = exec(() -> null);
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> fuzzexpr8 == fuzzexpr9));
var fuzzexpr11 = exec(() -> fuzzobj_new.get(fuzzobj_new.size()-1));
var fuzzexpr12 = exec(() -> null);
Boolean fuzzexpr13 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 == fuzzexpr12));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 && fuzzexpr13));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> attribute!=null));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> attribute.equals(fuzzobj_new.get(fuzzobj_new.size()-1))));
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
