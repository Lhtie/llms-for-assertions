
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.*;
import java.util.function.Consumer;

import combinedcodes.ArrayList;

public class FuzzTest<E>{
    public void FuzzTest_size(ArrayList<E> fuzzobj){
        if (fuzzobj == null) return ;   // ignore null test objects
        
        // copy old values


        // function call
		var paired_ret = func_call_supplier(() -> fuzzobj.size());
		var New_Ret = paired_ret.first;
		String exceptionType = paired_ret.second;

        // compute forall


        // normal post condition
		Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(a != null)));
		Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> New_Ret));
		Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> null));
		Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 != fuzzexpr2));
        Boolean normalpost = exec(() -> fuzzexpr0 || fuzzexpr3);
        if (normalpost == null || !normalpost)
            throw new RuntimeException("Normal Postcondition Violated");

        // exceptional post condition

        Boolean exceptionalpost = exec(() -> true);
        if (exceptionalpost == null || !exceptionalpost)
            throw new RuntimeException("Exceptional Postcondition Violated");
    }
    
    public static class Pair<A, B> {
        public final A first;
        public final B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }
    
    public static <T> T exec(Supplier<T> supplier){
		try {
			return supplier.get();
		} catch (Exception fuzzexception) {
			return null;
		}
	}
 
    public static <T> Pair<T, String> func_call_supplier(Supplier<T> supplier){
        try {
            return new Pair<>(supplier.get(), null);
        } catch (Exception fuzzexception){
            String exceptionType = fuzzexception.getClass().getSimpleName();
            return new Pair<>(null, exceptionType);
        }
    }
    
    public static String func_call_runnable(Runnable runnable){
        try {
            runnable.run();
            return null;
        } catch (Exception fuzzexception){
            return fuzzexception.getClass().getSimpleName();
        }
    }
}
