// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
import java.util.Scanner;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args){
	  Scanner in = new Scanner(System.in);
    // Provided # of testCases to check
		int testCases = Integer.parseInt(in.nextLine());
    // Check each argument, one at a time, up to # of testCases    
    while(testCases > 0){
      String pattern = in.nextLine();
      //Write your code
      // Use try-catch to see if Pattern.compile is successful to test if regex pattern
      try {
          Pattern p = Pattern.compile(pattern);
          System.out.println("Valid");
      }
      catch (Exception e) {
          System.out.println("Invalid");
      }
      testCases--;
    }
    in.close();
  }
}
