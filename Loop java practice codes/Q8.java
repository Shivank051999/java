//Q8. Write a program in java to display the n terms of odd natural number and their sum .  
//Test Data
//Input number of terms : 10
import java.util.*;
public class Q8 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        System.out.println("The first " + n + " odd natural numbers are:");
        int num = 1;
        while (count < n) 
        {
            System.out.print(num + " ");
            sum += num;
            num += 2;
            count++;
        }
        System.out.println("\nThe sum of the first " + n + " odd natural numbers is: " + sum);
        sc.close();
    }
}
