import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{     public static void main(String[] args)
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
        iterator.add("T'challia");
                iterator.add("Bruce");
        iterator.next();
        //remove method can only be called after a call to next or previous
        //it will cuase the illegalstateexception if called before next or previous
        iterator.remove();
        System.out.println(staff);
        iterator.previous();
        iterator.set("Dr.Strange");
        //the iterator is then positioned after the element that was added   
        //the hasnext method returns true if there is another element after the iterator position
        while (iterator.hasNext())
        {
            String n = iterator.next();
            System.out.println(n);
        }
        //enhanced for loops work with linked lists
        for (String s : staff)
        {
            System.out.println(s +  " ");
        }
        System.out.println(staff);
        //cannot modify a list using an interator unless using the iterator's own methods
        iterator = staff.listIterator();
        for (String s: staff)
        {
           
           if (s.equals("Tony"))
           {
               staff.add("T'Challa");

               
           }
        }
        System.out.println(staff);
    }
}
