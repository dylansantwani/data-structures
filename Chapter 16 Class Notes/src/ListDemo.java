/**
 * A program that demonstrates the LinkedList class
 */
public class ListDemo {

    public static void main(String[] args) {
        LinkedList students = new LinkedList();
        students.addFirst("Cam");
        students.addFirst("Connor");
        students.addFirst("Katherine");
        students.addFirst("Johnathan");
        System.out.println(students);
    }

}
