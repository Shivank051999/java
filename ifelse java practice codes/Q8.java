//Q8. Write a Java program to find the largest of three numbers. 
import java.util.*;
public class Q8 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1, Num2, Num3 (Separated by space:)");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        if(n1>n2&&n1>n3)
        {
            System.out.println("The greatest number is "+n1);
        }
        else if(n2>n1&&n2>n3)
        {
            System.out.println("The greatest number is "+n2);
        }
        else
        {
            System.out.println("The greatest number is "+n3);
        }
        sc.close();
    }
}
