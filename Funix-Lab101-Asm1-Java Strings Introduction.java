import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        System.out.println(s1.length() + s2.length());
        if (s1.compareTo(s2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.print(s1.substring(0,1).toUpperCase() + s1.substring(1) + " " + 
                         s2.substring(0,1).toUpperCase() + s2.substring(1)
        );
    }
}
