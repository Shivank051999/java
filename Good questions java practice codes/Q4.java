//Q4. take a number from user and count how many odd digits are in that number.
import java.util.*;
public class Q4 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num, digit, count = 0;

        System.out.println("Enter a number: ");
        num=sc.nextInt();
        
        if (num < 0) 
        {
            num = -num;
        }

        while (num != 0) 
        {
            digit = num % 10;

            if (digit % 2 != 0) 
            {
                count++;
            }
            num /= 10;
        }
        if (count == 0) 
        {
            count = 1;
        }

        System.out.println("Odd digits in the entered number are: " +count);
        sc.close();
    }
}
