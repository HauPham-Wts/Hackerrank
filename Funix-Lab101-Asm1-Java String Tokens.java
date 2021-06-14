import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().trim();    // trim - erase space in front and end of string
        if (s.length() > 0) {
            String[] temp = s.split("[!,?._'@\\s]+");    // spit somewhere has regex
            System.out.println(temp.length);
            // using for each to print the splited part
            for (String ans : temp) {    
                System.out.println(ans);
            }
        } else {
            System.out.println(0);
        }
    }
}
