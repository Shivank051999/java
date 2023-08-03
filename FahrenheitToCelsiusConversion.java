import java.util.Scanner;
public class FahrenheitToCelsiusConversion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float celsius,fahrenheit;
        System.out.println("enter the fahrenheit");
        fahrenheit=sc.nextFloat();
        celsius= (fahrenheit-32)*5.0f/9.0f;
        System.out.println("The Temperature in Celsius is "+celsius);
        sc.close();
    }
}