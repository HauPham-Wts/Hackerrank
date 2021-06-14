import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int k = input.nextInt();
        System.out.print(getSmallestAndLargest(s, k));
    }
    public static String getSmallestAndLargest(String s, int k) {
        String min = s.substring(0,k);    // Set (0,k) of S to min
        String max = s.substring(0,k);    // Set (0,k) of S to max
        for (int i=1; i<=s.length()-k; i++) {   
            String temp = s.substring(i, i+k);
            if (temp.compareTo(min) < 0) {
                min = temp;
            }
            if (temp.compareTo(max) > 0) {
                max = temp;
            }
        }
        return min + "\n" + max;
    }
}
