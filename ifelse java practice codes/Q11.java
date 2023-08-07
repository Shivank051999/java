//Q11. Write a Java program to calculate the root of a Quadratic Equation.
import java.util.*;
public class Q11
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a , b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int posRoot,negRoot;
        
        posRoot=(int)((-b+Math.sqrt(b*b-4*a*c))/2*a);
        negRoot=(int)((-b-Math.sqrt(b*b-4*a*c))/2*a);

        System.out.println("Positive root value "+posRoot);
        System.out.println("Negative root value "+negRoot);
        sc.close();
    }
}