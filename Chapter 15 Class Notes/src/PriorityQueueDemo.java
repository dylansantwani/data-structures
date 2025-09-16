import java.util.PriorityQueue;
import java.util.Queue;

/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        // create a priority queue of strings
        // needs to be composed of comparable objects
        Queue<String> students = new PriorityQueue<>();
        students.add("Neel");
        students.add("Johnathan");
        students.add("Cam");
        students.add("Kaitlyn");
        students.add("Dylan");
        //the next highest priority object is moved to the front of the queue when the head of the queue is removed
        while (!students.isEmpty()) {
            System.out.println(students.remove()); 
        }  
        //create a to do list with priorities
        Queue<WorkOrder> toDo = new PriorityQueue<>();
        //lower priority numbers are more important
        toDo.add(new WorkOrder(4, "Do the dishes"));
    }
}
