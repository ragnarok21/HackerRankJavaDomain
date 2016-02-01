package Strings;

import java.util.Scanner;

/**
 * Created by ramon on 12-01-16.
 */
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        if(isPalindrome(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(String word){
        String aux = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            aux=aux+word.charAt(i);
        }

        if(aux.equalsIgnoreCase(word)){
            return true;
        }else{
            return false;
        }
    }
}
