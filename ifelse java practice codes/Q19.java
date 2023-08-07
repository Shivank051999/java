//Q9. Write a program in Java to calculate and print the Electricity bill of a given customer. The customer id, customer name and unit consumed by the user should be taken from the keyboard and display the total amount to pay to the customer. The charge are as follow : 

//Unit	Charge/unit
//upto 199	@3.20
//200 and above but less than 400	@5.50
//400 and above but less than 600	@8.80
//600 and above	@9.00
//If bill exceeds Rs. 400 then a surcharge of 15% will be charged and the minimum bill should be of Rs. 100/-

import java.util.*;
public class Q19 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int customerID, unitsConsumed;
        float totalAmount,surchargeAmount;

        System.out.println("Enter the customer ID: ");
        customerID=sc.nextInt();

        System.out.println("Enter the units consumed: ");
        unitsConsumed=sc.nextInt();

        if (unitsConsumed <= 199) 
        {
            totalAmount = (float)(unitsConsumed * 1.20);
        } 
        else if (unitsConsumed >= 200 && unitsConsumed < 400) 
        {
            totalAmount = (float)(unitsConsumed * 1.50);
        } 
        else if (unitsConsumed >= 400 && unitsConsumed < 600) 
        {
            totalAmount = (float)(unitsConsumed * 1.80);
        } 
        else 
        {
            totalAmount = (float)(unitsConsumed * 2.00);
        }

        if (totalAmount > 400) 
        {
            totalAmount += totalAmount * 0.15;
            surchargeAmount = totalAmount*15/100;
            System.out.println("Surcharge Amount = "+ surchargeAmount);
        }

        if (totalAmount < 100) 
        {
            totalAmount = 100;
        }

        System.out.println("Customer ID: "+ customerID);
        System.out.println("Units consumed: "+ unitsConsumed);
        System.out.println("Total Amount to Pay: Rs."+ totalAmount);
        sc.close();
    }
}
