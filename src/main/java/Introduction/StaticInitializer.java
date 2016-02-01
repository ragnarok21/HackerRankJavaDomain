package Introduction;

import java.util.Scanner;

/**
 * Created by Arthas on 09-01-2016.
 */
public class StaticInitializer {
    static boolean flag;
    static int B;
    static int H;
    static{
        flag = false;
        Scanner scanner = new Scanner(System.in);
        B=scanner.nextInt();
        H=scanner.nextInt();

        if(B>0 && H>0){
            flag=true;
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
