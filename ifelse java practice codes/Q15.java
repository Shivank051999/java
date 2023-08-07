//Q15. Write a Java program to check whether a triangle can be formed by the given value for the angles.
import java.util.*;
public class Q15 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of angle1 angle2 angle3:");
        float angle1=sc.nextFloat();
        float angle2=sc.nextFloat();
        float angle3=sc.nextFloat();

        if (angle1 + angle2 + angle3 == 180) 
        {
            System.out.println("The given angles can form a valid triangle.");
        } 
        else 
        {
            System.out.println("The given angles cannot form a valid triangle.");
        }
        sc.close();
    }
}
