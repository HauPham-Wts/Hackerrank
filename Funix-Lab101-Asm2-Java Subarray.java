import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        // Input 
        for (int i=0; i<a.length; i++) {
            a[i] = input.nextInt();
        }
        // Check - using 2 for loops 
        int count = 0;
        for (int i=0; i<a.length; i++) {
            int sum = 0;
            for (int j=i; j<a.length; j++) {
                sum += a[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        // Output
        System.out.print(count);
    }
}
