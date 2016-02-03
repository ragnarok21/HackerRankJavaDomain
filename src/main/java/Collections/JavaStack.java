package Collections;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ramon on 02-02-16.
 */
public class JavaStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            System.out.println(scan.next());
           /* if(isBalanced(scan.next())){
                System.out.println(true);
            }else{
                System.out.println(false);
            }*/
        }
        // closing the scanner stream
        scan.close();

    }

    private static void isBalanced(String next) {
        Stack<String>stack=new Stack<String>();

    }

    static String getInverseString(String n) {
        char inverse =0;
       switch (n.charAt(0)){
           case '{':
               inverse='}';
               break;
           case '[':
               inverse=']';
               break;
           case '(':
               inverse=')';
               break;
       }
        return String.valueOf(inverse);
    }
}
