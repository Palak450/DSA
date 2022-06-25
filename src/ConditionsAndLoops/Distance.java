package ConditionsAndLoops;
import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value for x for truck A");
        int xa=sc.nextInt();
        System.out.println("enter value for y for truck A");
        int ya=sc.nextInt();
        System.out.println("enter value for x for truck B");
        int xb=sc.nextInt();
        System.out.println("enter value for Y for truck B");
        int yb=sc.nextInt();


        int Da= xa*xa+ya*ya;
        int Dy= xb*xb+yb*yb;

        if(Da< Dy){
            System.out.println(Da);
        }
        else{
            System.out.println(Dy);
        }



    }
}
