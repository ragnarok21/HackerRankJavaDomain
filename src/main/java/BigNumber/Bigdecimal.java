package BigNumber;

import java.math.*;
import java.util.*;

/**
 * Created by ramon on 01-02-16.
 */
public class Bigdecimal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int test = userInput.nextInt();
        userInput.nextLine();
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        List<String> l1 = new ArrayList<String>();

        for (int i = 0; i < test; i++) {
            l1.add(userInput.nextLine());

        }

            Comparator<String> comparator = new Comparator<String>() {
                @Override
                public int compare(String b1, String b2) {
                    return new BigDecimal(b2).compareTo(new BigDecimal(b1));
                }
            };

        Collections.sort(l1,comparator);
        for (int i = 0; i <l1.size() ; i++) {
            System.out.println(l1.get(i));
        }

        }


    }
