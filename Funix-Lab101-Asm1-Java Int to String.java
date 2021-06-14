import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = Integer.toString(n); // Convert to string
        if (n == Integer.parseInt(s)) { // Convert to int to compare
            System.out.print("Good job");
        } else {
            System.out.print("Wrong answer");
        }
    }
}
