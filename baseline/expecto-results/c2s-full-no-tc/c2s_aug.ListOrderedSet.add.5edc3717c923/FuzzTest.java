
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

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((((((int) (0)) <= ((int) (index)))) && ((((int) (index)) <= ((int) (OLD_var0))))))));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> !((OLD_var1 != null))));
Boolean fuzzexpr2 = Boolean.TRUE.equals(exec(() -> java.util.Objects.equals(((Integer)fuzzobj_new.toArray()[index]), OLD_var1)));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> fuzzexpr1 || fuzzexpr2));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> index>=0));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> index<=OLD_var2));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.contains(object)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr3) == (!fuzzexpr6 || fuzzexpr7));
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
