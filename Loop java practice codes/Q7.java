//Q7. Write a program in java to display the multipliaction table vertically from 1 to 8.  
// Data :
//Input upto the table number starting from 1 : 8
import java.util.Scanner;

public class Q7 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input upto the table number starting from 1: ");
        int n = sc.nextInt();
        
        System.out.println("Multiplication table vertically from 1 to " + n + ":");
        
        for (int i = 1; i <= 8; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                int product = i * j;
                System.out.printf("%2d x %2d = %2d   ", j, i, product);
            }
            System.out.println();
        }
        sc.close();
    }
}

