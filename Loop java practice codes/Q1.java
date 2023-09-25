//1. Write a program in java to display the first 100 natural numbers.
import java.util.*;
public class Q1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n = 100;
        System.out.println("The first "+n+" natural numbers are: ");

        for (int i= 1; i<=n; i++) 
        {
            System.out.println( i );
        }

        System.out.println(" ");
        sc.close();;
    }
}