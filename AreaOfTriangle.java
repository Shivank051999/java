import java.util.Scanner;
public class AreaOfTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float base,height,result;
        System.out.println("enter the base");
        base=sc.nextFloat();
        System.out.println("enter the height");
        height=sc.nextFloat();
        result=1.0f/2.0f*base*height;
        System.out.println("The area of triangle is "+result);
        sc.close();
    }
}