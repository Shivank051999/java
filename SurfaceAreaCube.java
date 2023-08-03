import java.util.Scanner;
public class SurfaceAreaCube{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius,result;
        System.out.println("enter the radius");
        radius=sc.nextFloat();
        result=6.0f*radius*radius;
        System.out.println("The Surface Area of Cube is "+result);
        sc.close();
    }
}