// https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
// Example input: JavaIPREgex.java 192.168.152.15 192.168.152.16 192.168.152.17 192.168.152.18 192.168.152.19

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Solution {
    
    private static String MyRegex(String ip) {
        // Create the regex for an ip pattern
        String ipRegex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        // Compile the regex into a pattern
        Pattern pattern = Pattern.compile(ipRegex);
        // Make a matcher object to compare the ip to
        Matcher matcher = pattern.matcher(ip);
        // Compare and print if true or false
        if (matcher.matches()) {
            return "true";
        } 
        else {
            return "false";
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // While there is still input from the scanner, call MyRegex and print answer
        while (scanner.hasNext()) {
            String ip = scanner.nextLine();
            String answer = MyRegex(ip);
            System.out.println(answer);
        }
        scanner.close();
    }
}
