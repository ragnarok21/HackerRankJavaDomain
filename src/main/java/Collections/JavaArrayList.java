package Collections;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by ramon on 08-02-16.
 */
public class JavaArrayList {
    static List<List<Integer>>myLists = new ArrayList<List<Integer>>();
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int number_list = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <number_list ; i++) {
            myLists.add(new ArrayList<Integer>());
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line," ");
            while (stk.hasMoreTokens()){
                myLists.get(i).add(Integer.parseInt(stk.nextToken()));
            }
        }
        number_list=sc.nextInt();
        for (int i = 0; i <number_list ; i++) {
            int n = sc.nextInt();
            int n1 = sc.nextInt();
            try {
                System.out.println(getNumber(n,n1));
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }


    }

    static int getNumber(int x, int y){
       return myLists.get(x-1).get(y);
    }
}
