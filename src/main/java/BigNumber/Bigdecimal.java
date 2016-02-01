package BigNumber;

import java.math.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ramon on 01-02-16.
 */
public class Bigdecimal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int arraySize = Integer.parseInt(userInput.nextLine());
        String [] s = new String[arraySize];
        for (int i = 0; i < arraySize; i++) {
            s[i] = userInput.nextLine();
        }


        //Write your code here
        //Sorting (Selection)
        for (int i = 0; i < (s.length - 1); i++) {
            for (int k = (i + 1); k < s.length; k++) {
                if (new BigDecimal(s[i]).compareTo(new BigDecimal(s[k])) < 0) {
                    String tempValue = s[i];
                    s[i] = s[k];
                    s[k] = tempValue;
                }
            }
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
