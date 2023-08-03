import java.util.Scanner;
public class MilesToKilometerConversion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float miles,kilometer;
        System.out.println("enter the miles");
        miles=sc.nextFloat();
        kilometer=1.609f*miles;
        System.out.println("The Output in kilometer is "+kilometer);
        sc.close();
    }
}