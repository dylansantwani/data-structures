import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as
 * <p>
 * , there
 * must be a closing tag
 * </p>
 * . A tag such as
 * <p>
 * may have other
 * tags inside, for example
 * <p>
 * <ul>
 * <li></li>
 * </ul>
 * <a> </a>
 * </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
 */
public class HTMLChecker {
    public static void main(String[] args) throws FileNotFoundException

    {

        String filename = "Chapter 15 Activities\\HTMLChecker\\src\\TagSample3.html";

        try (Scanner in = new Scanner(new File(filename))) {

            Stack<String> tags = new Stack<String>();
            boolean error = false;

            while (in.hasNext() && !error) {
                String tag = in.next();
                if (tag.charAt(1) != '/') {
                        tags.push(tag);
                    } else {
                        if (tags.isEmpty()) {
                            System.out.println("Too many closing tags: " + tag);
                        error = true;
                    } else {


                        String openTag = tags.pop();
                        String expectedCloseTag = "</" + openTag.substring(1);
                        if (!tag.equals(expectedCloseTag)) {
                            System.out.println("Expected " +
                                    expectedCloseTag + " but found " + tag);
                            error = true;
                        }
                    }
                }
            }
                if (!error && !tags.isEmpty()) {
                    System.out.println("Missing closing tags:");
                    while (!tags.isEmpty()) {
                        String openTag = tags.pop();
                        String expectedCloseTag = "</" + openTag.substring(1);
                    System.out.println(expectedCloseTag);
                }
            } else if (!error) {
                System.out.println("All tags matched.");
            }
        }

    }
}
