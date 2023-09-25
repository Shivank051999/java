//Q16. Write a Java program to remove duplicate elements from an array.

public class Q16 {
    public static void main(String[] args) {
     
        int[] array = { 3, 5, 2, 7, 3, 8, 7, 1, 2 };

        System.out.println("Array with duplicate elements:");

        for (int num : array) 
        {
            System.out.print(num + " ");
        }

        int uniqueCount = 0;
        int[] uniqueArray = new int[array.length];

        for (int num : array) 
        {
            boolean isDuplicate = false;
            for (int i = 0; i < uniqueCount; i++) 
            {
                if (num == uniqueArray[i]) 
                {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) 
            {
                uniqueArray[uniqueCount] = num;
                uniqueCount++;
            }
        }

        System.out.println("\nArray without duplicate elements:");

        for (int i = 0; i < uniqueCount; i++) 
        {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}