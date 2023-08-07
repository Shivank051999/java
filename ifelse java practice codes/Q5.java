//Q5. Write a Java program to read the age of a candidate and determine whether it is eligible for casting his/her own vote.
import java.util.*;
public class Q5 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible to vote.");
        }
        else
        {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}
