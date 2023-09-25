//Q1. take a number from user and find factorial of that
import java.util.*;
public class Q1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num;
        int factorial = 1;

        System.out.println("Enter a positive integer: ");
        num=sc.nextInt();

        if (num < 0) 
        {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else if(num==0)
        {
            System.out.println("Factorial of 0 is 1.");
        }
        else 
        {
            for (int i = 1; i<=num; i++) 
            {
                factorial *= i;
            }
            System.out.println("Factorial of "+num+" is = " +factorial);
        }
        sc.close();
    }
}