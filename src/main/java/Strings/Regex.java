package Strings;

import java.util.Scanner;

/**
 * Created by ramon on 01-02-16.
 */
public class Regex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}


class myRegex{
    String pattern = "(\\d{1,3}.?\\d{1,3}.?\\d{1,3})$";
}
