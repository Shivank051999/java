//Q9. Write a Java program to accept a coordinate point in a XY coordinate system and determine in which quadrant the coordinate point lies. 
import java.util.*;
public class Q9 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the X and Y coordinates (separated by a space):");
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        if (x > 0 && y > 0) 
    {
        System.out.println("The coordinate point is in Quadrant I.");
    } 
    else if (x < 0 && y > 0) 
    {
        System.out.println("The coordinate point is in Quadrant II.");
    } 
    else if (x < 0 && y < 0) 
    {
        System.out.println("The coordinate point is in Quadrant III.");
    } 
    else if (x > 0 && y < 0) 
    {
        System.out.println("The coordinate point is in Quadrant IV.");
    } 
    else if (x == 0 && y == 0) 
    {
        System.out.println("The coordinate point is at the origin (0, 0).");
    } 
    else if (x == 0) 
    {
        System.out.println("The coordinate point is on the Y-axis.");
    } else 
    {
        System.out.println("The coordinate point is on the X-axis.");
    }
    sc.close();
    }
}
