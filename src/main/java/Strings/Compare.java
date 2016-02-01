package Strings;

import java.util.Scanner;

/**
 * Created by ramon on 12-01-16.
 */
public class Compare {
    static String less = "";
    static String higher = "";

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int k = sc.nextInt();
        int aux=k;
        for (int i = 0; i <word.length()-k+1 ; i++) {

            if(i==0){
                higher = word.substring(i,aux);
                less = word.substring(i,aux);
            }else{
                if((word.substring(i,aux).compareTo(higher))>0){
                    higher=word.substring(i,aux);
                }else{
                    if((word.substring(i,aux).compareTo(less))<0){
                        less=word.substring(i,aux);
                    }
                }
            }
            aux++;
        }
        System.out.println(less);
        System.out.println(higher);

    }
}

