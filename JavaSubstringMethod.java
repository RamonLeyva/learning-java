// https://www.hackerrank.com/challenges/java-substring/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String result = S.substring(start, end);
        System.out.println(result);
    }
}
