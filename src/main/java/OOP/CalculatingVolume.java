package OOP;

import java.io.IOException;
import java.math.BigDecimal;
import java.security.Permission;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by ramon on 05-02-16.
 */
public class CalculatingVolume {
    public static void main(String[] args) {
        Do_Not_Terminate.forbidExit();
        try{
            Calculate cal=new Calculate();
            int T=cal.getINTVal();
            while(T-->0){
                double volume = 0.0d;
                int ch=cal.getINTVal();
                if(ch==1){

                    int a=cal.getINTVal();
                    volume=Calculate.get_Vol().main(a);


                }
                else if(ch==2){

                    int l=cal.getINTVal();
                    int b=cal.getINTVal();
                    int h=cal.getINTVal();
                    volume=Calculate.get_Vol().main(l,b,h);

                }
                else if(ch==3){

                    double r=cal.getDoubleVal();
                    volume=Calculate.get_Vol().main(r);

                }
                else if(ch==4){

                    double r=cal.getDoubleVal();
                    double h=cal.getDoubleVal();
                    volume=Calculate.get_Vol().main(r,h);

                }
                cal.output.display(volume);
            }

        }
        catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}


class Calculate{
    Display output=new Display();
    Scanner sc = new Scanner(System.in);
    public int getINTVal() throws IOException{
        return sc.nextInt();
    }
    public static Volume get_Vol(){
        return new Volume();
    }

    public double getDoubleVal() throws IOException{
        return sc.nextDouble();
    }
}
class Volume{

    public double main(double r, double h) {
        if(r<=0 || h<=0){
            throw new NumberFormatException("All the values must be positive");
        }else{
            return Math.PI*Math.pow(r,2)*h;
        }
    }
    public double main(double b, double h, double l) {
        if(b<=0 || h<=0 || l<=0){
            throw new NumberFormatException("All the values must be positive");
        }else{
            return l*b*h;
        }
    }
    public int main(int a) {
        if(a<=0){
            throw new NumberFormatException("All the values must be positive");
        }else{
            return (int)Math.pow(a,3);
        }
    }
    public Double main(Double r) {
        if(r<=0){
            throw new NumberFormatException("All the values must be positive");
        }else{
            return (2*Math.PI*Math.pow(r,3))/3;
        }
    }
}

class Display{
    public void display(Double d){
        System.out.println(String.format("%.3f", d));
    }
}
class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end o