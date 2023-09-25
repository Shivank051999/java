//Q3. Write a program in java to display n terms of natural number and their sum. 
import java.util.Scanner;
public class Q3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the terms:");
        int n=sc.nextInt();
        int sum=0;
        System.out.println(n+ " natural numbers are:");
        for (int i= 1; i<=n; i++) 
        {
            System.out.println( i +" ");

            sum+=i;
        }
        System.out.println("The sum of "+n+" natural numbers is: "+sum);
        sc.close();
    }
}
