import java.util.*;
import java.io.*;

/**
 * Read all words from a file and add them to a
 * map whose keys are word lengths and whose values
 * are comma-separated strings of words of the same length.
 * Then print out those strings, in increasing order by
 * the length of their entries.
 * Modify Worked Example 15.1.
 */
public class StringLengthMap {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "C:\\Users\\dasantwani\\Documents\\GitHub\\data-structures\\Chapter 15 Activities\\StringLengthMap\\src\\test1.txt";

        try (Scanner in = new Scanner(new File(filename))) {

            // Create your map here
            Map<Integer, String> map = new HashMap<>();

            while (in.hasNext()) {
                String word = clean(in.next());
                Integer len = word.length();
                if (map.get(len) != null) {
                    map.put(len, map.get(len) + "," + word);
                } else {
                    map.put(len, word);
                }
                // Update the map here
                // Modify Worked Example 15.1

            }

            for (Integer key : map.keySet()) {
                String value = map.get(key); 
                System.out.println(key + ":" + value);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }

}
