
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
    public void FuzzTest_add(AttributeList fuzzobj_old, AttributeList fuzzobj_new, int index, javax.naming.directory.Attribute attribute){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (index));
var OLD_var1 = exec(() -> (fuzzobj_old.size()));
var OLD_var2 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((((((int) (0)) <= ((int) (OLD_var0)))) && ((((int) (OLD_var0)) <= ((int) (OLD_var1))))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(fuzzobj_new.toArray()[OLD_var0],attribute)));
var fuzzexpr2 = exec(() -> fuzzobj_new.toArray()[OLD_var0]);
var fuzzexpr3 = exec(() -> attribute);
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> index<=OLD_var2));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr7));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(attribute)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr5) == (!fuzzexpr8 || fuzzexpr9));
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
