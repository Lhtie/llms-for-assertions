package fuzztests;
import java.util.ArrayList;

public class FuzzTest_equivchecker{
    public static void ADD_FuzzTest(ArrayList<Integer> fuzzobj_old, ArrayList<Integer> fuzzobj_new, int fuzzarg0, int New_Ret){
        // pre condition
        if (!(true && true))
            throw new RuntimeException("Precondition Violated");
        
        boolean OLD_fuzzobjisEmpty = fuzzobj_old.isEmpty();
        int OLD_fuzzobjsize = fuzzobj_old.size();
        int OLD_fuzzobjindexOf = fuzzobj_old.indexOf(fuzzarg0);
        int OLD_fuzzobjlastIndexOf = fuzzobj_old.lastIndexOf(fuzzarg0);
        boolean OLD_fuzzobjcontains = fuzzobj_old.contains(fuzzarg0);

        boolean NEW_fuzzobjisEmpty = fuzzobj_new.isEmpty();
        int NEW_fuzzobjsize = fuzzobj_new.size();
        int NEW_fuzzobjindexOf = fuzzobj_new.indexOf(fuzzarg0);
        int NEW_fuzzobjlastIndexOf = fuzzobj_new.lastIndexOf(fuzzarg0);
        boolean NEW_fuzzobjcontains = fuzzobj_new.contains(fuzzarg0);

        // normal post condition
        if ((OLD_fuzzobjsize + 1 == NEW_fuzzobjsize) != (fuzzobj_new.size() == OLD_fuzzobjsize + 1))
            throw new RuntimeException("Equivalence Checker Failed");
    }
}