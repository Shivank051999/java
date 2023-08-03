import java.util.Scanner;
public class SurfaceAreaSphere{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius,pi=3.14f,result;
        System.out.println("enter the radius");
        radius=sc.nextFloat();
        result=4.0f*pi*radius*radius;
        System.out.println("The Surface Area of Sphere is "+result);
        sc.close();
    }
}