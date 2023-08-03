import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float si,p,r,t;
        System.out.println("enter the principal");
        p=sc.nextFloat();
        System.out.println("enter the rate");
        r=sc.nextFloat();
        System.out.println("enter the time");
        t=sc.nextFloat();
        si=(p*r*t)/100;
        System.out.println("Simple Interest is "+si);
        sc.close();
    }
}