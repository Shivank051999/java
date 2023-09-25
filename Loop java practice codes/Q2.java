//Q2. Write a java program to find the sum of first 10 natural numbers. 
import java.util.*;
public class Q2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum+=i;
        }
        System.out.println("The sum of 10 natural numbers is: "+sum);
        sc.close();
    }
}
