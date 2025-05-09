package wrappers;
import java.util.ArrayList;

public class ArrayListWrapper{
    public static void add_Contract(ArrayList<Integer> obj, int e){
        // pre condition
        if (!true)
            throw new RuntimeException("Precondition Violated");
        
        int old_objsize = obj.size();

        try{
            obj.add(e);

        } catch (Exception exception){
            // exceptional post condition
        }

        int objsize = obj.size();

        // normal post condition
        if (!(objsize == old_objsize + 1))
            throw new RuntimeException("Postcondition Violated");
    }
}