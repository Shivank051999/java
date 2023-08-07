//Q12. Write a Java program to read roll no and marks of three subjects and calculate the total, percentage and division. 
import java.util.*;
public class Q12 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        float m1,m2,m3,total,percentage;
        int rollNo;
        System.out.println("Enter the marks of three subjects:");
       
        m1=sc.nextFloat();
        m2=sc.nextFloat();
        m3=sc.nextFloat();

        System.out.println("Enter Roll no:");
        rollNo=sc.nextInt();

        total=m1+m2+m3;
        percentage = (float)(total / 3.0);
        if (percentage >= 60 && percentage <= 100) 
    {
        System.out.println("First Division");
    } 
    else if (percentage >= 45) 
    {
        System.out.println("Second Division");
    } 
    else if (percentage >= 33) 
    {
        System.out.println("Third Division");
    } 
    else 
    {
        System.out.println( "Fail");
    }

    System.out.println("Roll Number: "+ rollNo);
    System.out.println("Marks in Subject 1: "+ m1);
    System.out.println("Marks in Subject 2: "+ m2);
    System.out.println("Marks in Subject 3: "+ m3);
    System.out.println("Total Marks: "+ total);
    System.out.println("Percentage: "+ percentage);
    sc.close();
    }
}
