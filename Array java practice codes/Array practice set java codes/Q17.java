//Q17. Write a Java program to find the second largest element in an array.

public class Q17 {
    public static void main(String[] args) {
    
        int[] array = { 3, 5, 2, 7, 8, 1 };

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) 
        {
            if (num > largest) 
            {
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num != largest) 
            {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) 
        {
            System.out.println("No second largest element found");
        } 
        else 
        {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}