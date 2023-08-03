import java.util.Scanner;
public class CelsiusToFahrenheitConversion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float celsius,fahrenheit;
        System.out.println("enter the celsius");
        celsius=sc.nextFloat();
        fahrenheit= (celsius * 9.0f/5.0f) + 32;
        System.out.println("The Temperature in Fahrenheit is "+fahrenheit);
        sc.close();
    }
}