//Q5. Write a program in java to display the cube of the number upto given an integer.
import java.util.Scanner;

public class Q5 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        System.out.println("Cubes of numbers up to " + n + ":");
        for (int i = 1; i <= n; i++) 
        {
            int cube = i * i * i;
            System.out.println("Cube of " + i + " = " + cube);
        }
        sc.close();
    }
}

