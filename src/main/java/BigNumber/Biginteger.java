package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ramon on 01-02-16.
 */
public class Biginteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        BigInteger c = a.add(b);
        BigInteger d = a.multiply(b);
        System.out.println(c);
        System.out.println(d);
    }
}
