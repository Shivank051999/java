//Q13. Write a Java program to read temperature in centigrade and display a suitable message according to temperature state below : 
//Temp < 0 then Freezing weather
//Temp 0-10 then Very Cold weather
//Temp 10-20 then Cold weather
//Temp 20-30 then Normal in Temp
//Temp 30-40 then Its Hot
//Temp >=40 then Its Very Hot

import java.util.*;
public class Q13 
{
    public static void main(String[] args) 
    {
        float temperature;

        System.out.println("Enter the temperature in centigrade: ");
        Scanner sc=new Scanner(System.in);
        temperature=sc.nextFloat();
        
        if (temperature < 0) 
        {
            System.out.println("Freezing weather.");
        } 
        else if (temperature >= 0 && temperature <= 10) 
        {
            System.out.println("Very Cold weather.");
        } 
        else if (temperature > 10 && temperature <= 20) 
        {
            System.out.println("Cold weather.");
        } 
        else if (temperature > 20 && temperature <= 30) 
        {
            System.out.println("Normal in Temp.");
        } 
        else if (temperature > 30 && temperature <= 40) 
        {
            System.out.println("Its Hot.");
        } 
        else 
        {
            System.out.println("Its Very Hot.");
        } 
        sc.close();
    }
}
