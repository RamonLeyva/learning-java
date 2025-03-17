// https://www.hackerrank.com/challenges/java-string-compare/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {

        // initialize smallest and largest with the first substring
        String substring = s.substring(0, k);
        String smallest = substring;
        String largest = substring;

        // iterate through all substrings
        for (int i = 1; i <= s.length() - k; i++) {

            // create the next substring to compare to
            substring = s.substring(i, k + i);

            // if smaller than the current 'smallest', update
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            // if larger than the current 'largest', update
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
