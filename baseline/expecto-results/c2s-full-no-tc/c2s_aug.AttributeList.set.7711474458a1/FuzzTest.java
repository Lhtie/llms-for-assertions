
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
    public void FuzzTest_set(AttributeList fuzzobj_old, AttributeList fuzzobj_new, int index, javax.naming.directory.Attribute attribute){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (index));
var OLD_var1 = exec(() -> (fuzzobj_old.size()));
var OLD_var2 = exec(() -> (fuzzobj_old.isEmpty()));
var OLD_var3 = exec(() -> (attribute==null));
var OLD_var4 = exec(() -> fuzzobj_old.size());

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((int) (0)) <= ((int) (OLD_var0))) && (((int) (OLD_var0)) < ((int) (OLD_var1)))))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
var fuzzexpr4 = exec(() -> (boolean) ((fuzzobj_new.isEmpty())));
var fuzzexpr5 = exec(() -> (boolean) (OLD_var2));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr4, fuzzexpr5)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr6));
var fuzzexpr8 = exec(() -> (boolean) (fuzzobj_new.toArray()[OLD_var0]==null));
var fuzzexpr9 = exec(() -> (boolean) (OLD_var3));
Boolean fuzzexpr10 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr8, fuzzexpr9)));
Boolean fuzzexpr11 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr10));
var fuzzexpr12 = exec(() -> (boolean) (fuzzobj_new.toArray()[OLD_var0]==attribute));
var fuzzexpr13 = exec(() -> (boolean) (true));
Boolean fuzzexpr14 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr12, fuzzexpr13)));
Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr11 && fuzzexpr14));
Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> index<OLD_var4));
Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> fuzzexpr16 && fuzzexpr17));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(index).equals(attribute)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr15) == (!fuzzexpr18 || fuzzexpr19));
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
