package Introduction;

import java.util.Scanner;

/**
 * Created by Arthas on 08-01-2016.
 */
public class Formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++) {
            String s1=sc.next();
            int x=sc.nextInt();
            //System.out.println(String.format("%03d",x));
            //Complete this line
            System.out.printf( "%-15s%03d\n", s1,x);
        }
        System.out.println("================================");
    }
}
