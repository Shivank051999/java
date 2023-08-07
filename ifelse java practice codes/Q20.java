//Q20. Write a program in Java to accept a grade and declare the equivalent description : 

//Grade	Description
//E	Excellent
//V	Very Good
//G	Good
//A	Average
//F	Fail
import java.util.*;
public class Q20 
{
    public static void main(String[] args) 
    {
        char grade;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade: ");
        grade=sc.next().charAt(0);

        switch (grade) 
        {
            case 'E':
            case 'e':
            System.out.println("Excellent");
            break;
            case 'V':
            case 'v':
            System.out.println("Very Good");
            break;
            case 'G':
            case 'g':
            System.out.println("Good");
            break;
            case 'A':
            case 'a':
            System.out.println("Average");
            break;
            case 'F':
            case 'f':
            System.out.println("Fail");
            break;
            default:
            System.out.println("Invalid grade entered.");
            break;
        }
        sc.close();
    }
}
