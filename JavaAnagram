// https://www.hackerrank.com/challenges/java-anagrams/problem
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Check if same length
        if (a.length() != b.length()) {
            return false;
        }
        // Convert to array and all lowercase
        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();
        // Sort A
        for (int i = 0; i < arrA.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arrA[j] < arrA[j - 1]) {
                char tempA = arrA[j - 1];
                arrA[j - 1] = arrA[j];
                arrA[j] = tempA;
                }
            }
        }
        // Sort B
        for (int k = 0; k < arrB.length - 1; k++) {
            for (int l = k + 1; l > 0; l--) {
                if (arrB[l] < arrB[l - 1]) {
                char tempB = arrB[l - 1];
                arrB[l - 1] = arrB[l];
                arrB[l] = tempB;
                }
            }
        }
        // Compare        
        for (int m = 0; m < arrA.length; m++) {
            if (arrA[m] != arrB[m]) {
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
