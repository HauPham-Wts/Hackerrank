import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<List<Integer>> lines = new ArrayList<List<Integer>>();
        int n = input.nextInt();
        for (int i=0; i<n; i++) {
            ArrayList<Integer> line = new ArrayList<Integer>();
            int d = input.nextInt();
            for (int j=0; j<d; j++) {
                line.add(input.nextInt());
            }
            lines.add(line);
        }
        int q = input.nextInt();
        for (int i=0; i<q; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            if (y > lines.get(x-1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(lines.get(x-1).get(y-1));
            }
        }
    }
}
