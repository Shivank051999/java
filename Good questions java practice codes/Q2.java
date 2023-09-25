//Q2. print fibonnaci series let n=10
import java.util.*;
public class Q2 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number N:");
       int n=sc.nextInt();
       System.out.println("Fibonacci series of "+n+" terms:");
       int num1=0,num2=1;
       for(int i = 1;i<=n;i++)
       {
           System.out.println(num1+"");
           int num3=num1+num2;
           num1=num2;
           num2=num3;
       }
       sc.close();
    }
}
