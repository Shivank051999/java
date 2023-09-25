//Q10. make a fibbonacci series from the sum of odd numbers and even numbers in a digit and the number of term = digit length 
import java.util.*;
public class Q10 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num, sumOdd = 0, sumEven = 0, len=0,rem, original,value;

        System.out.println("Enter a number: ");
        num=sc.nextInt();
        original = num;
        while (num != 0) 
        {
            len++;
            num /= 10;
        }

        if (len == 0) 
        {
            len = 1;
        }
        System.out.println("length is "+ len);
        
        while (original != 0) 
        {
            rem = original % 10;
            if (rem%2==0)
            {
                sumEven+=rem;
            }
            else
            {
                sumOdd+=rem;
            }
            original /= 10;
        }

        System.out.println("Odd digits sum: "+ sumOdd);
        System.out.println("Even digits sum: "+sumEven);

        System.out.println("Fibonacci Series is:  "+sumOdd+"\n"+sumEven);
        while (len-2>0) 
        {
            value = sumOdd + sumEven;
            System.out.println(value);
            sumOdd = sumEven;
            sumEven = value;
            len--;
        }
        sc.close();
    }
}
