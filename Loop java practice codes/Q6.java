//Q6. Write a program in java to display the multiplication table of a given integer. 
import java.util.Scanner;
public class Q6 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter an integer: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) 
        {
            int table = n*i;
            System.out.println( table);
        }
        sc.close();
    }
}
