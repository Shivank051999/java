//Q7. Write a Java program to accept the height of a person in centimeter and categorize the person according to their height.
import java.util.*;
public class Q7 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height(in cm):");
        int height=sc.nextInt();
        if (height < 150) 
        {
            System.out.println("The person's height category is short.");
        }
         else if (height >= 150 && height < 170) 
        {
            System.out.println("The person's height category is average.");
        }
         else if (height >= 170 && height < 190) 
        {
            System.out.println("The person's height category is tall.");
        } 
        else 
        {
            System.out.println("The person's height category is very tall.");
        }
        sc.close();
    }
}
