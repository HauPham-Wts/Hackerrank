import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int h = input.nextInt();
        if (b <= 0 || h <= 0) {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.print(b * h);
        }
    }
}
