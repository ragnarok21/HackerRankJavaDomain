package Advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.in;
/**
 * Created by ramon on 05-02-16.
 */
public class PrimeChecker {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<String>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    static class Prime{

        public void checkPrime(int ... no) {
            for (int n : no) {
                if(isPrime(n)){
                    System.out.print(n + " ");
                }

            }
            System.out.println();
        }

        private boolean isPrime(int n) {
            boolean result = true;
            if(n == 1 || n == 0)
                result = false;
            if(n == 2)
                return true;
            if(n == 3)
                return true;
            int sqrt = (int) Math.sqrt(n) + 1;
            for(int j = 2; j < sqrt;j++){
                if(n % j == 0)
                    result = false;
            }


            return result;
        }


    }
}
