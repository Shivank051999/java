//Q21. Write a program in Java to read any day number in integer and display day name of week in word .
import java.util.*;
public class Q21 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int dayNumber;
        System.out.println("Enter the Day Number:");
        dayNumber=sc.nextInt();

        switch (dayNumber)
        {
            case 1: System.out.println("Sunday ");
            break;

            case 2: System.out.println("Monday ");
            break;

            case 3: System.out.println("Tuesday ");
            break;

            case 4: System.out.println("Wednesday ");
            break;

            case 5: System.out.println("Thursday ");
            break;

            case 6: System.out.println("Friday ");
            break;

            case 7: System.out.println("Saturday ");
            break;

            default: System.out.println("Enter the number between 1 to 7 ");
            break;
        }
        sc.close();
    }
}
