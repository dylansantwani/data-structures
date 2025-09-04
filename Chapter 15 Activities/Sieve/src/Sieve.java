import java.util.Scanner;
import java.util.*;

/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();
        Set<Integer> numbers = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            numbers.add(i);
        }
        for (int j = 2; j <= n; j++) {
           if (j==2){
            continue;
           }
           else{
            if (j%2==0){
                numbers.remove(j);
            }
            if (j%3==0){
                numbers.remove(j);
            }
           }
        }
        System.out.println(numbers);
        // Your work goes here







    }
}
