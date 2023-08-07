//Q18. Write a Java program to calculate profit and loss on a transaction. 

import java.util.*;
public class Q18 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost price and selling price:");
        float costPrice, sellingPrice, profitOrLoss;
        costPrice=sc.nextFloat();
        sellingPrice=sc.nextFloat();

        profitOrLoss = sellingPrice - costPrice;
    
        if (profitOrLoss > 0) 
        {
            System.out.println("Profit Amount: "+ profitOrLoss);
            System.out.println("Profit Percentage: "+ (profitOrLoss / costPrice) * 100+"%%");
        } 
        else if (profitOrLoss < 0) 
        {
            System.out.println("Loss Amount: "+ -profitOrLoss);
            System.out.println("Loss Percentage: "+(-profitOrLoss / costPrice) * 100+"%%");
        } 
        else 
        {
            System.out.println("No profit or loss.");
        }
        sc.close();
    }
}
