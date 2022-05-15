import java.util.Scanner;

public class Assignments {
    public  static void main( String[] args){


        Scanner sca=new Scanner(System.in);
        double x;
        System.out.print("what is your radius ");
        x=sca.nextDouble();
        double c=3.15 * (x*x);
        System.out.println("Your area is "+(int)c);
        sca.close();


    }
    
}
