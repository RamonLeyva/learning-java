// https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=false
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int count = 0;
        
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        
        // Iterate through all possible starting points of subarrays
        for (int start = 0; start < numbers.length; start++) {
            // Iterate through all possible ending points of subarrays
            for (int end = start; end < numbers.length; end++) {
                int temp = 0;
                // Sum the subarray from start to end
                for (int k = start; k <= end; k++) {
                    temp += numbers[k];
                }
                // Check if negative and increase count if so
                if (temp < 0) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
