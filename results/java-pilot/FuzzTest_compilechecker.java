
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.util.*;
import java.util.function.Consumer;

import combinedcodes.ArrayList;

public class FuzzTest<E>{
	public static <T> T exec(Supplier<T> supplier){
		try {
			return supplier.get();
		} catch (Exception fuzzexception) {
			return null;
		}
	}

    public void FuzzTest_add(ArrayList<E> fuzzobj, int index, E element){
		var OLD_var0 = exec(() -> fuzzobj.size());
		var OLD_var1_forallidx0 = exec(() -> {
			int capacity = (OLD_var0 - 1) - (index) + 1;
			Object ex = fuzzobj.get(index);
			var	ret = Array.newInstance(ex.getClass(), capacity);
			int cur_idx = 0;
			for (int i = index; i <= OLD_var0 - 1; i += 1) {
				Array.set(ret, cur_idx, fuzzobj.get(i));
				cur_idx += 1;
			} 
			return ret;
		});
		

        String exceptionType = null;
        try{
            fuzzobj.add(index, element);
        } catch (Exception fuzzexception){
            exceptionType = fuzzexception.getClass().getSimpleName();
        }

		Boolean forall_holds_forallidx0 = exec(() -> {
			boolean ret = true;
			int cur_idx = 0;
			for (int i = index; i <= OLD_var0 - 1; i += 1) {
				if (index <= i&&i <OLD_var0) {
					ret &= fuzzobj.get(i+1) == null&&Array.get(OLD_var1_forallidx0, cur_idx) == null||fuzzobj.get(i+1).equals(Array.get(OLD_var1_forallidx0, cur_idx));
				}
				cur_idx += 1;
			}
			return ret;
		});

        // normal post condition
		Boolean fuzzexpr0 = exec(() -> !(index>=0 && index<=fuzzobj_new.size()));
		Boolean fuzzexpr1 = exec(() -> (forall_holds_forallidx0));
		Boolean normalpost = exec(() -> fuzzexpr0 || fuzzexpr1);
        if (normalpost == null || !normalpost)
            throw new RuntimeException("Normal Postcondition Violated");
			
        // exceptional post condition

		Boolean exceptionalpost = exec(() -> true);
        if (exceptionalpost == null || !exceptionalpost)
            throw new RuntimeException("Exceptional Postcondition Violated");
    }
}
