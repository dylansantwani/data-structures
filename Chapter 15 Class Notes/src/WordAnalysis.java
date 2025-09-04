import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program checks which words in a file are not present in a dictionary.
 */
public class WordAnalysis {
    public static void main(String[] args) 
        //System.out.println(System.getProperty(user.dir));
        throws FileNotFoundException
        {
        Set<String> dictionary = readWords("Chapter 15 Class Notes/src/war-and-peace.txt");
        }
    

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     *         word is a sequence of upper- and lowercase letters.
     */
    public static Set<String> readWords(String filename)
            throws FileNotFoundException {

        Set<String> words = new HashSet<>();
        Scanner in = new Scanner(new File(filename), "UTF-8");
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext()) {
            String word = in.next().toLowerCase();
            words.add(word);
        }
        return words;
    }
}
