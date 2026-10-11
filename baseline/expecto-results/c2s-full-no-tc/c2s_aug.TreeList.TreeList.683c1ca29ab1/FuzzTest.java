
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.OrderedIterator;

import c2s_aug.TreeList;

public class FuzzTest{
    public void FuzzTest_TreeList(TreeList<Integer> fuzzobj_old, TreeList<Integer> fuzzobj_new, java.util.Collection<Integer> coll){
        if (fuzzobj_old == null || fuzzobj_new == null) return ;   // ignore null test objects
        
        // copy old values
var OLD_var0 = exec(() -> (coll == null));
var OLD_var1 = exec(() -> (coll.size()));

        // compute forall


        // normal post condition
Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> !((!OLD_var0))));
var fuzzexpr1 = exec(() -> (int) ((fuzzobj_new.size())));
var fuzzexpr2 = exec(() -> (int) (OLD_var1));
Boolean fuzzexpr3 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr1, fuzzexpr2)));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> coll!=null));
var fuzzexpr5 = exec(() -> fuzzobj_new.size());
var fuzzexpr6 = exec(() -> coll.size());
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr5, fuzzexpr6)));
        Boolean normalpost = exec(() -> (fuzzexpr0 || fuzzexpr3) == (!fuzzexpr4 || fuzzexpr7));
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
