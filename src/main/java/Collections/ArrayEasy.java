package Collections;

import java.util.Scanner;

/**
 * Created by ramon on 01-02-16.
 */
public class ArrayEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];

        for (int i = 0; i <n; i++) {
            array[i] =(int)(Math.random() * 201) - 100;
        }
        int j =0;
       while (j<array.length-1){
           for (int i = j+1; i <array.length ; i++) {
               System.out.println("["+j+":"+i+"]");
           }
           j++;
       }
    }
}
