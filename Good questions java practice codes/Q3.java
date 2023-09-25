//Q3. take a number from user and count how many digits are in that number eg.4589 -> 4
import java.util.*;
public class Q3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num,count = 0;
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        
        if (num < 0) 
        {
            num = -num;
        }
        
        while (num != 0) 
        {
            count++;
            num /= 10;
        }

        if (count == 0) 
        {
            count = 1;
        }

        System.out.println("Number of digits in the entered number: "+count);
        sc.close();
    }
}
