//Q12. Write a Java program to find the duplicate values of an array of integer values.

public class Q12 {
    public static void main(String[] args) {
    
        int[] array = { 3, 5, 2, 7, 3, 8, 7, 1, 2 };

        System.out.println("Duplicate values in the array:");

        for (int i = 0; i < array.length - 1; i++) 
        {
            for (int j = i + 1; j < array.length; j++) 
            {
                if (array[i] == array[j]) 
                {
                    System.out.println(array[i]);
                    break; 
                }
            }
        }
    }
}
