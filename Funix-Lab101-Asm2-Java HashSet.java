import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String left[] = new String[t];
        String right[] = new String[t];
        for (int i=0; i<t; i++) {
            left[i] = input.next();
            right[i] = input.next();
        }
        HashSet<String> set = new HashSet<String>();
        for (int i=0; i<t ; i++) {
            set.add(left[i] + " " + right[i]);
            System.out.println(set.size());
        }
    }
}
