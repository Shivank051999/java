//Q9. take a number from user and check whether it is a prime number or not.
import java.util.*;
public class Q9 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the Number:");
        num=sc.nextInt();

        for (int i=2; i<(num/2);)
        {
            if(num%i==0)
            {
                System.out.println(num+" is not a prime number.");
                break;
            }
            else 
            {
                System.out.println(num+ " is a prime number.");
                break;
            }
        }
        sc.close();
    }
}