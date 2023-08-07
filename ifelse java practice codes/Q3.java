//Q3. Write a Java program to check whether a given number is positive , negative or zero.
import java.util.*;
public class Q3 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("The entered number is positive.");
        }
        else if(num==0)
        {
            System.out.println("The entered number is zero.");
        }
        else
        {
            System.out.println("The entered number is negative.");
        }
        sc.close();
    }
}
