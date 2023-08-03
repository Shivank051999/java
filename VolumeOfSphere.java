import java.util.Scanner;

public class VolumeOfSphere {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        float radius,pi=3.14f,result;
        System.out.println("enter the radius");
        radius=sc.nextFloat();

        result=4.0f/3.0F*pi*radius*radius*radius;

        System.out.println("The volume of Sphere is "+result);
        sc.close();
    }
}