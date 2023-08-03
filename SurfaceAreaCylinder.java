import java.util.Scanner;
public class SurfaceAreaCylinder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius,height,pi=3.14f,result;
        System.out.println("enter the radius");
        radius=sc.nextFloat();
        System.out.println("enter the height");
        height=sc.nextFloat();
        result=2.0f*pi*radius*radius+2.0f*pi*radius*height;
        System.out.println("The Surface Area of Cylinder is "+result);
        sc.close();
    }
}