//Q4. Write a Java program to find whether a given year is a leap year or not. 
import java.util.*;
public class Q4 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        if((year%4==0&&year%100!=0)||year%400==0)
        {
            System.out.println("It is a leap year.");
        }
        else
        {
            System.out.println("It is not a leap year.");
        }
        sc.close();
    }
}
