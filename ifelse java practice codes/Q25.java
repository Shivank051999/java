//Q25. Write a program in Java which is a Menu-Driven Program to compute the area of the various geometrical shape. 
import java.util.*;
public class Q25 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        float radius, length, width, base, height;
        float PI = 3.14159f;

        System.out.println("Menu:");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Triangle");
        System.out.println("4. Exit");

        System.out.println("Enter your choice (1-4): ");
        choice=sc.nextInt();
        if (choice == 1) 
        {
            System.out.println("Enter the radius of the circle: ");
            radius=sc.nextFloat();
            if (radius < 0) 
            {
                System.out.println("Invalid input! Radius cannot be negative.");
            } 
            else 
            {
                float area = (float)(PI * radius * radius);
                System.out.println("Area of the circle: "+ area +" square units");
            }
        } 
        else if (choice == 2) 
        {
            System.out.println("Enter the length and width of the rectangle (separated by space): ");
            length=sc.nextFloat();
            width=sc.nextFloat();
            if (length < 0 || width < 0) 
            {
                System.out.println("Invalid input! Length and width cannot be negative.");
            } 
            else 
            {
                float area = (float)(length * width);
                System.out.println("Area of the rectangle: "+ area +" square units");
            }
        } 
        else if (choice == 3) 
        {
            System.out.println("Enter the base and height of the triangle (separated by space): ");
            base=sc.nextFloat();
            height=sc.nextFloat();
            if (base < 0 || height < 0) 
            {
                System.out.println("Invalid input! Base and height cannot be negative.");
            } 
            else 
            {
                float area = (float)(0.5 * base * height);
                System.out.println("Area of the triangle: "+ area +" square units");
            }
        } 
        else if (choice == 4) 
        {
            System.out.println("Exiting the program. Goodbye!");
        } 
        else 
        {
            System.out.println("Invalid choice! Please enter a valid option.");
        }
        sc.close();;
    }
}
