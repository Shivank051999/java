//Q15. Write a Java program to find the common elements between two arrays of integers.

public class Q15 {
    public static void main(String[] args) {
        int[] array1 = { 3, 5, 2, 7, 8 };
        int[] array2 = { 5, 2, 9, 8, 1 };

        System.out.println("Common elements:");

        for (int num1 : array1) 
        {
            for (int num2 : array2) 
            {
                if (num1 == num2) 
                {
                    System.out.println(num1);
                    break; 
                }
            }
        }
    }
}
