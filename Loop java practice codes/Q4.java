//Q4. Write a program in java to read 10 numbers from keyboard and find their sum and average. 
import java.util.Scanner;
public class Q4 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n = 10;
        int sum=0;
        float average=0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 1; i <= n; i++) 
        {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }
        average=(float)(sum/n);
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+average);
        sc.close();
    }
}
