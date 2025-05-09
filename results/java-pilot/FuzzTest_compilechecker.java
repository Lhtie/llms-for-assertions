package fuzztests;
import java.util.ArrayList;

public class FuzzTest{
    public static void ADD_FuzzTest(ArrayList<Integer> fuzzobj, int fuzzarg0){
        // pre condition
        if (!true)
            throw new RuntimeException("Precondition Violated");
        
        int OLD_size = fuzzobj.size();

        try{
            boolean New_Ret = fuzzobj.add(fuzzarg0);

        } catch (Exception exception){
            // exceptional post condition
        }

        int objsize = obj.size();

        // normal post condition
        if (!(fuzzobj.size() == OLD_size + 1))
            throw new RuntimeException("Postcondition Violated");
    }
}