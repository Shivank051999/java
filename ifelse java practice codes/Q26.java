//Q26. Write a program in Java which is a Menu-Driven Program to perform a simple calculation.
import java.util.*;
public class Q26 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        float num1, num2, result;

        do 
        {
            System.out.println("Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter your choice (1-5): ");
            choice=sc.nextInt();

            switch (choice) 
            {
                case 1:
                System.out.println("Enter the first number: ");
                    num1=sc.nextFloat();
                    System.out.println("Enter the second number: ");
                    num2=sc.nextFloat();
                    result = (float)(num1 + num2);
                    System.out.println("Result: "+ result);
                    break;
                case 2:
                    System.out.println("Enter the first number: ");
                    num1=sc.nextFloat();
                    System.out.println("Enter the second number: ");
                    num2=sc.nextFloat();
                    result = (float)(num1 - num2);
                    System.out.println("Result: "+ result);
                    break;
                case 3:
                System.out.println("Enter the first number: ");
                    num1=sc.nextFloat();
                    System.out.println("Enter the second number: ");
                    num2=sc.nextFloat();
                    result = (float)(num1 * num2);
                    System.out.println("Result: "+ result);
                    break;
                case 4:
                System.out.println("Enter the numerator: ");
                    num1=sc.nextFloat();
                    System.out.println("Enter the denominator: ");
                    num2=sc.nextFloat();
                    if (num2 != 0) 
                    {
                        result = (float)(num1 / num2);
                        System.out.println("Result: "+ result);
                    } 
                    else 
                    {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 5);
        sc.close();;
    }
}
