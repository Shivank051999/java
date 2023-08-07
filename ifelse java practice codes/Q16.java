//Q16. Write a Java program to check whether a character is an alphabet, digit or special character. 
import java.util.*;
public class Q16 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);

        if (ch>=65 && ch<=90)
        {
            System.out.println(ch+" is Capital Alphabet.");
        }
        else if(ch>=97 && ch<=122)
        {
            System.out.println(ch+" is a Small Alphabet.");
        }
        else if(ch>=48 && ch<=57)
        {
            System.out.println(ch+" is a Digit. ");
        }
        else 
        {
            System.out.println(ch+" is a Special character.");
        }
        sc.close();
    }
}
