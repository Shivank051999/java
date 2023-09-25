//Q8. take a ,n,d from user and print the A.P (arithematic progression)    
//let a=10  n=6 d=3
//a  a+d  a+2d a+3d a+4d  a+5d
import java.util.*;
public class Q8 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,d,n,sum=0;
        System.out.println("Enter the value of a, d, n (Seperated by space):");
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
            sum = a+i*d;
            System.out.println( sum);
        }
        sc.close();
    }
}
