package Strings;

import java.util.Scanner;

/**
 * Created by ramon on 01-02-16.
 */
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }

    private static boolean isAnagram(String a, String b) {
        boolean isAnagram = false;
        a=a.toUpperCase();
        b=b.toUpperCase();
        StringBuilder stringa = new StringBuilder(a);
        if(b.length()!=a.length()){
            isAnagram=false;
        }else{
            for (int i = 0; i < b.length(); i++) {
                String letter = b.substring(i,i+1);
                int indexLetter = stringa.lastIndexOf(letter);
                if(indexLetter >= 0){
                    stringa.deleteCharAt(indexLetter);
                    isAnagram = true;
                }else{
                    isAnagram = false;
                }
            }
        }

        if(stringa.length() != 0){
            isAnagram=false;
        }

        return isAnagram;
    }
}
