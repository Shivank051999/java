//Q6. take a number from user and sum of the even digits in that number. 
import java.util.*;
public class Q6 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num, digit, sum = 0;

        System.out.println("Enter a number: ");
        num=sc.nextInt();
        
        if (num < 0) 
        {
            num = -num;
        }

        while (num != 0) 
        {
            digit = num % 10;

            if (digit % 2 == 0) 
            {
                sum+=digit;
            }
            num /= 10;
        }

        System.out.println("Sum of Even digits in the entered number is: "+ sum);
        sc.close();
    }
}
