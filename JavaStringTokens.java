// https://www.hackerrank.com/challenges/java-string-tokens/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // This fails 4/11 test without .trim()
        String s = scan.nextLine().trim();
        scan.close();
        // If string is empty
        if (s.isEmpty()) {
            System.out.println("0");
            return;
        }
        /* Alternate method:
        String[] array = s.split("[ !,?._'@]+");
        // Count and print tokens
        System.out.println(array.length);
        // For-each loop (can't control index)
        for (String s1 : array) {
            System.out.println(s1);
        } */
        // Split string into String array
        String[] arr = s.split("[ !,?._'@]+");
        // Count tokens
        int n = arr.length;
        // Print token count
        System.out.println(n);
        // Print tokens out (by controling index)
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
