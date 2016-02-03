package Collections;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ramon on 02-02-16.
 */
public class JavaHashset {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        int cont = 0;
        for (int i = 0; i <number ; i++) {
            String a = sc.nextLine();
            if(map.isEmpty()){
                map.put(a,1);
                cont++;
            }else{
                if(!map.containsKey(a)){
                    map.put(a,1);
                    cont++;
                }
            }
            System.out.println(cont);

        }

    }
}
