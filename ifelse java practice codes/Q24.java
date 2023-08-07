//Q24. Write a program in Java to read any Month Number in integer and display the number of days for this month. 
import java.util.*;
public class Q24 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int monthNumber;
        System.out.println("Enter the Month Number: ");
        monthNumber=sc.nextInt();

        switch (monthNumber)
        {
            case 1: System.out.println("Month have 31 days ");
            break;

            case 2: System.out.println("Month have 28 days ");
            break;

            case 3: System.out.println("Month have 31 days ");
            break;

            case 4: System.out.println("Month have 30 days ");
            break;

            case 5: System.out.println("Month have 31 days ");
            break;

            case 6: System.out.println("Month have 30 days ");
            break;

            case 7: System.out.println("Month have 31 days ");
            break;

            case 8: System.out.println("Month have 31 days ");
            break;

            case 9: System.out.println("Month have 30 days ");
            break;

            case 10: System.out.println("Month have 31 days ");
            break;

            case 11: System.out.println("Month have 30 days ");
            break;

            case 12: System.out.println("Month have 31 days ");
            break;

            default:
            System.out.println("Enter the Valid Month Number. ");
        }
        sc.close();
    }
}
