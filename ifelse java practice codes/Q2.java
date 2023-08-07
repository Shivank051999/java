//Q2. Write a Java program to check whether a given number is even or odd. 
import java.util.*;
public class Q2 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number:");
       int num = sc.nextInt();
       if(num%2==0)
       {
        System.out.println("The entered number is even.");
       }
       else
       {
        System.out.println("The entered number is odd.");
       }
       sc.close();
    }
}
