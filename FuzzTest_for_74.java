
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.*;
import java.util.function.Consumer;

import combinedcodes.ArrayList;

public class FuzzTest<E>{
    public void FuzzTest_toArray(ArrayList<E> fuzzobj){
        if (fuzzobj == null) return ;   // ignore null test objects
        
        // copy old values


        // function call
		var paired_ret = func_call_supplier(() -> fuzzobj.toArray());
		var New_Ret = paired_ret.first;
		String exceptionType = paired_ret.second;

        // compute forall
		Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
			boolean ret = true;
			int _cur_idx = 0;
			for (int _i = 0; _i <= fuzzobj.size() - 1; _i += 1) {
				int cur_idx = _cur_idx;
				int i = _i;
				if (0 <= i && i < fuzzobj.size()) {
					Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> fuzzobj.get(i)));
					Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> null));
					Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> fuzzexpr0 == fuzzexpr1));
					Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Arrays.copyOf(elementData, size)[i]));
					Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> null));
					Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 == fuzzexpr4));
					Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr2 == fuzzexpr5));
					Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzobj.get(i)));
					Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> null));
					Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 != fuzzexpr8));
					ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr6 && fuzzexpr9));
				}
				_cur_idx += 1;
			}
			return ret;
		}));

        // normal post condition
		Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(forall_holds_forallidx0)));
		Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> fuzzobj.get(i).equals(Arrays.copyOf(elementData, size)[i])));
        Boolean normalpost = exec(() -> fuzzexpr0 || fuzzexpr1);
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
