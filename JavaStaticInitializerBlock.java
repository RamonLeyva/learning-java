import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
        Reads input from STDIN. Prints output to STDOUT. Input would be:
        1
        3
        or
        -1
        3
        Output would be:
        3 
        or 
        java.lang.Exception: Breadth and height must be positive
        */
        int a, b, h;
        try (Scanner scanner = new Scanner(System.in)) {
            b = scanner.nextInt();
            h = scanner.nextInt();
            if (b > 0 && h > 0) {
                a = b*h;
                System.out.println(a);
            }
            else {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
    } 
