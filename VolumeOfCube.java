import java.util.Scanner;
public class VolumeOfCube{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius,result;
        System.out.println("enter the radius");
        radius=sc.nextFloat();
        result=radius*radius*radius;
        System.out.println("The volume of cube is "+result);
        sc.close();
    }
}