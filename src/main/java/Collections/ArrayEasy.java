package Collections;

import java.util.Scanner;

public class ArrayEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] =sc.nextInt();
        }
        int j =0;
        int cont = 0;
        while (j<array.length){
           for (int i = j; i <array.length ; i++) {
               int sum =0;
               for (int k = j; k <=i ; k++) {
                   sum+=array[k];
               }
               if(sum<0){
                   cont++;
               }
               sum=0;
           }
           j++;
       }
        System.out.println(cont);
    }
}
