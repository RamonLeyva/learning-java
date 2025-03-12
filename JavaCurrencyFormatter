// https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Format in US locale
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        
        
        // Create a Locale for India
        Locale indiaLocale = new Locale("en", "IN");
        // Format in India locale
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        
        // Format in China locale
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        
        // Format in France locale
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + indiaFormat.format(payment));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));
    }
}
