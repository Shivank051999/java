//Q10. Write a Java program to find the eligibility of admission for a professional course based on the following criteria: 
import java.util.*;
public class Q10 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of Maths Physics Chemistry (Separated by each other))");
        float Maths=sc.nextFloat();
        float Physics=sc.nextFloat();
        float Chemistry=sc.nextFloat();
        float Total;
        Total = Physics + Maths + Chemistry;
    if(Total >=200 && Total <=300)
    {
        System.out.println("The candidate is eligible for admission.");
    }
    else
    {
        System.out.println("The candidate is not eligible for admission.");
    }
    sc.close();
    }
}
