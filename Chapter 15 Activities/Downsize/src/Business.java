import java.util.LinkedList;
import java.util.*;

/**
 * Business utility methods.
*/
public class Business
{
    /**
      * Removes every nth element from the linked list
      *
      * @param employeeNames the linked list to remove from
      * @param n                 the parameter to determine "nth"
     */
    public static void downsize(LinkedList<String> employeeNames, int n)
    {
        ListIterator<String> iter = employeeNames.listIterator();
        int count = 1;
        while(iter.hasNext())
        {   
            iter.next();
            if(count%n == 0)
                iter.remove();
            count++;
        }
        
    }
}