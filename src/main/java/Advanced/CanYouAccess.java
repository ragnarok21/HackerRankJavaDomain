package Advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ramon on 05-02-16.
 */
public class CanYouAccess {

    public static void main(String[] args) throws Exception {
        Do_Not_Terminate.forbidExit();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class CanYouAccess.Inner.Private
            Inner in = new Inner();
            o = in.new Private();
            String str=   ((CanYouAccess.Inner.Private) o).powerof2(num);
            System.out.println(num+" is "+str);
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");


        }catch (Do_Not_Terminate.ExitTrappedException e) {
        System.out.println("Unsuccessful Termination!!");
    }
}//end of main
static class Inner
{
    private class Private{
        private String powerof2(int num)
        {
            return ((num&num-1)==0)?"power of 2":"not a power of 2";
        }
    }
}//end of Inner

}//end of CanYouAccess




