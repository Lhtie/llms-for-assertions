import c2s_aug.BitSet;
import java.util.Objects;
import java.util.function.Supplier;
import java.lang.reflect.Array;
public class ReplayLowBitSet {
 static <T> T exec(Supplier<T> f) {try{return f.get();}catch(Exception e){return null;}}
 static void compare(int fromIndex,int toIndex) {
  BitSet fuzzobj_new=new BitSet();
  // A positive-domain witness has all relevant bits true.
  fuzzobj_new.set(0,4);
Boolean forall_holds_forallidx0 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = fromIndex; _i <= toIndex - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (i >= fromIndex && i < toIndex) {
			Boolean fuzzexpr0 = Boolean.TRUE.equals(exec(() -> fuzzobj_new.get(i)));
			ret &= Boolean.TRUE.equals(exec(() -> fuzzexpr0));
		}
		_cur_idx += 1;
	}
	return ret;
}));
Boolean forall_holds_forallidx1 = Boolean.TRUE.equals(exec(() -> {
	boolean ret = true;
	int _cur_idx = 0;
	for (int _i = fromIndex; _i <= toIndex - 1; _i += 1) {
		int cur_idx = _cur_idx;
		int i = _i;
		if (fromIndex<=i && i<toIndex) {
			var fuzzexpr2 = exec(() -> fuzzobj_new.get(i));
			var fuzzexpr3 = exec(() -> true);
			ret &= Boolean.TRUE.equals(exec(() -> Objects.equals(fuzzexpr2, fuzzexpr3)));
		}
		_cur_idx += 1;
	}
	return ret;
}));
Boolean fuzzexpr1 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx0));
Boolean fuzzexpr4 = Boolean.TRUE.equals(exec(() -> fromIndex>=0));
Boolean fuzzexpr5 = Boolean.TRUE.equals(exec(() -> toIndex>=fromIndex));
Boolean fuzzexpr6 = Boolean.TRUE.equals(exec(() -> fuzzexpr4 && fuzzexpr5));
Boolean fuzzexpr7 = Boolean.TRUE.equals(exec(() -> forall_holds_forallidx1));
  System.out.println("from="+fromIndex+", to="+toIndex+", candidate="+(fuzzexpr1)+", GT="+(!fuzzexpr6 || fuzzexpr7));
 }
 public static void main(String[] args){compare(0,1);compare(-1,1);compare(2,1);}
}
