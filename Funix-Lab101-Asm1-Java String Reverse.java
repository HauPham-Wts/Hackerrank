import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        char arr[] = s.toCharArray();    // Convert to array of char
        String ans = "";
        for (int i=arr.length-1; i>=0; i--) {
            ans += arr[i];
        }
        if (s.equals(ans)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
