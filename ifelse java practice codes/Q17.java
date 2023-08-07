//Q17. Write a Java program to check whether an alphabet is a vowel or consonant. 
import java.util.*;
public class Q17 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the alphabet:");
        char ch=sc.next().charAt(0);
        ch=(char)(ch+32);

        if (ch >= 'a' && ch <= 'z') 
        {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
        {
            System.out.println("The character is a vowel.");
        } 
        else 
        {
            System.out.println("The character is a consonant.");
        }
        } 
        else 
        {
            System.out.println("Invalid input: Not an alphabet.");
        }
        sc.close();
    }
}
