import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        //used to populate a list
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("T'Challa");
        System.out.println(staff);

        //list iteration ,methdd createsa a new list iterator
        //The | is used to represent the iterator position
        ListIterator<String> iterator = staff.listIterator();
        //next method advacned iterator to next element in the list
        iterator.next();

        //next method also returns the element that the iterator passes over 
        String avenger = iterator.next();
        System.out.println(avenger);
    }
}
