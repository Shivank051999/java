//Q11. Write a Java program to reverse an array of integer values.

public class Q11 {
    public static void main(String[] args) {
    
        int[] array = { 1, 2, 3, 4, 5 };
        int length = array.length;

        System.out.println("Original array:");
        for (int num : array) 
        {
            System.out.print(num + " ");
        }
        
        for (int i = 0; i < length / 2; i++) 
        {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }

        System.out.println("\nReversed array:");
        for (int num : array) 
        {
            System.out.print(num + " ");
        }
    }
}
