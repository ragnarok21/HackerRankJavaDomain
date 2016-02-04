package Advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ramon on 04-02-16.
 */
public class JavaVarargs {
    /*
    static void vaTest(int ... no) {
        System.out.print("vaTest(int ...): "
                + "Number of args: " + no.length +" Contents: ");
        for(int n : no)
            System.out.print(n + " ");
        System.out.println();
    }
    static void vaTest(boolean ... bl) {
        System.out.print("vaTest(boolean ...) " +
                "Number of args: " + bl.length + " Contents: ");
        for(boolean b : bl)
            System.out.print(b + " ");
        System.out.println();
    }
    static void vaTest(String msg, int ... no) {
        System.out.print("vaTest(String, int ...): " +
                msg +"no. of arguments: "+ no.length +" Contents: ");
        for(int  n : no)
            System.out.print(n + " ");
        System.out.println();
    }*/
    public static void main(String args[]){
        //vaTest(1, 2, 3);
        //vaTest("Testing: ", 10, 20);
        //vaTest(true, false, false);

        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
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
            e.printStackTrace();
        }
    }

    static class Add {
        int sum=0;
        public void add(int ... no) {
            int cont = 1;
            for(int n : no) {
                if(cont<no.length){
                    System.out.print(n + "+");
                    cont++;
                }else{
                    System.out.print(n);
                }
                sum+=n;
            }
            System.out.print("="+sum);
            sum=0;
            System.out.println();

        }

    }
}
