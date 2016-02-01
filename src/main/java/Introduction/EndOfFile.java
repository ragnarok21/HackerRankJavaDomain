package Introduction;

import java.util.Scanner;

/**
 * Created by Arthas on 08-01-2016.
 */
public class EndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        int i =1;
        while (done==false){
            String input;
            input = scanner.nextLine();
            if (input.equals("")){
                done = true;
            }else{
                System.out.println(i+" "+input);
                i++;

            }
        }
    }
}
