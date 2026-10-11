
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.Iterator;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.OrderedIterator;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.iterators.AbstractIteratorDecorator;
import org.apache.commons.collections4.list.UnmodifiableList;
import org.apache.commons.collections4.set.AbstractSerializableSetDecorator;

import c2s_aug.ListOrderedSet;

public class FuzzTest{
    public void FuzzTest_add(ListOrderedSet<Integer> fuzzobj_old, ListOrderedSet<Integer> fuzzobj_new, int index, Integer object){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (fuzzobj_old.size()));
var OLD_var1 = exec(() -> (object));
var OLD_var2 = exec(() -> fuzzobj_old.size());
var OLD_var3 = exec(() -> fuzzobj_old.toArray());
var OLD_var4_forallidx0_sample = exec(() -> fuzzobj_old.get(index));
var OLD_var4_forallidx0 = exec(() -> {
	int capacity = (OLD_var2 - 1) - (index) + 1;
	var ret = Array.newInstance(OLD_var4_forallidx0_sample.getClass(), capacity);
	int cur_idx = 0;
	for (int i = index; i <= OLD_var2 - 1; i += 1) {
		Array.set(ret, cur_idx, fuzzobj_old.get(i));
		cur_idx += 1;
	}
	return ret;
});
var OLD_var4 = exec(() -> fuzzobj_old.contains(object));

        // compute forall
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = index; _i <= OLD_var2 - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (index <= i&&i <OLD_var2) {
			var fuzzexpr10 = exec(() -> fuzzobj_new.get(i+1));
			var fuzzexpr11 = exec(() -> null);
			Boolean fuzzexpr12 = Boolean.TRUE.equals(exec(() -> fuzzexpr10 == fuzzexpr11));
			var fuzzexpr13 = exec(() -> get_from_array(OLD_var4_forallidx0, cur_idx, OLD_var4_forallidx0_sample));
			var fuzzexpr14 = exec(() -> null);
			Boolean fuzzexpr15 = Boolean.TRUE.equals(exec(() -> fuzzexpr13 == fuzzexpr14));
			Boolean fuzzexpr16 = Boolean.TRUE.equals(exec(() -> fuzzexpr12 && fuzzexpr15));
			Boolean fuzzexpr17 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(i+1).equals(get_from_array(OLD_var4_forallidx0, cur_idx, OLD_var4_forallidx0_sample))));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr16 || fuzzexpr17));
		}
		_cur_idx += 1;
	}
	return ret;
}));

        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !(((((((int) (0)) <= ((int) (index))) && (((int) (index)) <= ((int) (OLD_var0)))) && (OLD_var1 != null)) && (!java.util.stream.IntStream.range(0, OLD_var2).anyMatch(__expecto_jml_1 -> ((java.util.Objects.equals(((Integer)(OLD_var3)[__expecto_jml_1]), OLD_var1)))))))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) ((((int) (OLD_var0)) + ((int) (1)))));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(0, index).allMatch(__expecto_jml_2 -> ((!(((((int) (0)) <= ((int) (__expecto_jml_2))) && (((int) (__expecto_jml_2)) < ((int) (index))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_2]), ((Integer)(OLD_var3)[__expecto_jml_2])))))))));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> fuzzexpr3 && fuzzexpr4));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[index]), OLD_var1)));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzexpr5 && fuzzexpr6));
Boolean fuzzexpr8 = Boolean.TRUE.equals(exec(() -> java.util.stream.IntStream.rangeClosed(index, (fuzzobj_new.size())).allMatch(__expecto_jml_3 -> ((!(((((int) (index)) < ((int) (__expecto_jml_3))) && (((int) (__expecto_jml_3)) < ((int) ((fuzzobj_new.size())))))) || ((java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[__expecto_jml_3]), ((Integer)(OLD_var3)[(((int) (__expecto_jml_3)) - ((int) (1)))])))))))));
Boolean fuzzexpr9 = Boolean.TRUE.equals(exec(() -> fuzzexpr7 && fuzzexpr8));
Boolean fuzzexpr18 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr19 = Boolean.TRUE.equals(exec(() -> index<=OLD_var2));
Boolean fuzzexpr20 = Boolean.TRUE.equals(exec(() -> !OLD_var4));
Boolean fuzzexpr21 = Boolean.TRUE.equals(exec(() -> fuzzexpr18 && fuzzexpr19 && fuzzexpr20));
Boolean fuzzexpr22 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr9) == (!fuzzexpr21 || fuzzexpr22));
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
