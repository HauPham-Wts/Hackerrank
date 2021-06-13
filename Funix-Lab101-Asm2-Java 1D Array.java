import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        // Create array with size n
        int n = input.nextInt();    
        int arr[] = new int[n];
        // Input arr[i]
        for (int i=0; i<arr.length; i++) {
            arr[i] = input.nextInt();
        }
        // Output arr[i]
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
