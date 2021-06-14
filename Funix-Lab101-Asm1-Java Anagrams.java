import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        if (isAnagram(s1, s2)) {
            System.out.print("Anagrams");
        } else {
            System.out.print("Not Anagrams");
        }
    }
    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase(); // To lower
        s2 = s2.toLowerCase(); // To lower
        char arr1[] = s1.toCharArray(); // Convert to array
        char arr2[] = s2.toCharArray(); // Convert to array
        Arrays.sort(arr1);  // sort
        Arrays.sort(arr2);  // sort
        String ans1 = new String(arr1); // create new string
        String ans2 = new String(arr2); // create new string 
        // Check true false
        if (ans1.equals(ans2)) {
            return true;
        } else {
            return false;
        }
    }
    
}
