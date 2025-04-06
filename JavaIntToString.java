//https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        String s = String.valueOf(n);
        if (s.getClass() == String.class) {
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer");
        }
    }
}
