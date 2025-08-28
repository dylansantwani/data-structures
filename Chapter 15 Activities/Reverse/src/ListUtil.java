import java.util.LinkedList;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
 */
public class ListUtil {
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
     */
    public static void reverse(LinkedList<String> strings) {
        int initalsize = strings.size();
        for (int i = 0; i < initalsize; i++) {
            strings.addLast(strings.get((initalsize- 1) - i));
        }
        for (int i = 0; i < initalsize; i++) {
            strings.removeFirst();
        }
    }
}