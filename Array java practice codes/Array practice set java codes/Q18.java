//Q18. Write a Java program to find the second smallest element in an array.

public class Q18 {
    public static void main(String[] args) {
    
        int[] array = { 3, 5, 2, 7, 1, 8 };

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) 
        {
            if (num < smallest) 
            {
                secondSmallest = smallest;
                smallest = num;
            } 
            else if (num < secondSmallest && num != smallest) 
            {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) 
        {
            System.out.println("No second smallest element found");
        } 
        else 
        {
            System.out.println("Second smallest element: " + secondSmallest);
        }
    }
}