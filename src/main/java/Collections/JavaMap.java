package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ramon on 02-02-16.
 */
public class JavaMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        List<String> queries = new ArrayList<String>();
        int N = in.nextInt();
        in.nextLine();
        for (int i = 0; i < N; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }

        while (N > 0) {
            String s = in.nextLine();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
            N--;
        }
    }
}
