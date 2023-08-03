import java.util.Scanner;
public class VolumeOfCone
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius,height,pi=3.14f,result;
        System.out.println("enter the radius");
        radius=sc.nextFloat();
        System.out.println("enter the height");
        height=sc.nextFloat();
        result=1.0f/3.0f*pi*radius*radius*height;
        System.out.println("The volume of cone is "+result);
        sc.close();
    }
}