import java.util.Scanner;
public class VolumeOfCylinder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius,height,pi=3.14f,result;
        System.out.println("enter the radius");
        radius=sc.nextFloat();
        System.out.println("enter the height");
        height=sc.nextFloat();
        result=pi*radius*radius*height;
        System.out.println("The volume of cylinder is "+result);
        sc.close();
    }
}