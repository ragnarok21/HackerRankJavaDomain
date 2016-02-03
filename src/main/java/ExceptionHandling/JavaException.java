package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ramon on 03-02-16.
 */
public class JavaException {
    public static void main(String[] args) {
       try {
           Scanner sc = new Scanner(System.in);
           Integer n = sc.nextInt();
           Integer n1=sc.nextInt();
           System.out.println(n/n1);
       }catch (InputMismatchException e){
           System.out.println("java.util.InputMismatchException");
       }catch (Exception e){
           System.out.println(e);
       }
    }

}
