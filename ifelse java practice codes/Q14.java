//Q14. Write a Java program to check whether a triangle is Equilateral, Isosceles or Scalene.
import java.util.*;
public class Q14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side1 side2 side3 (separated by each other)");
        float side1=sc.nextFloat();
        float side2=sc.nextFloat();
        float side3=sc.nextFloat();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) 
        {
            if (side1 == side2 && side2 == side3) 
            {
                System.out.println("It's an Equilateral triangle.");
            } 
            else if (side1 == side2 || side1 == side3 || side2 == side3) 
            {
                System.out.println("It's an Isosceles triangle.");
            } else 
            {
                System.out.println("It's a Scalene triangle.");
            }
        } 
        else 
        {
            System.out.println("The given sides do not form a valid triangle.");
        }
        sc.close();
    }
}
