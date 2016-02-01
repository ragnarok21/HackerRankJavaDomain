package Strings;

import java.util.Scanner;

/**
 * Created by Arthas on 09-01-2016.
 */
public class Introduction {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String a=cin.next(),b=cin.next();
        System.out.println(a.length()+b.length());
        System.out.println(a.compareTo(b)>0 ? "Yes" : "No");
        System.out.println(capitalize(a)+" "+capitalize(b));
    }
    static String capitalize(String s){
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
}
