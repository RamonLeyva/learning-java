// https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Read input
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        // Sum the lengths of a and b, then print out
        int sum = a.length() + b.length();
        System.out.println(sum);
        
        // Determine if a is lexicographically larger than b, then print out
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
            
        // Capitalize the first letter in a and b, then print out
        String A = a.substring(0, 1).toUpperCase() + a.substring(1);
        String B = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(A + ' ' + B);
    }
}
