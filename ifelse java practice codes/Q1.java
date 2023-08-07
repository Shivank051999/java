//Q1. Write a Java program to accept two integers and check whether they are equal or not. 
import java.util.*;
public class Q1{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter Num1:");
        n1=sc.nextInt();
        System.out.println("Enter Num2:");
        n2=sc.nextInt();
        if (n1==n2) 
        {
            System.out.println("Entered integers are equal.");
        } 
        else 
        {    
            System.out.println("Entered integers are not equal.");
        }
        sc.close();
    }
}