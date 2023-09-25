//Q10. Write a Java program to find the maximum and minimum value of an array.

public class Q10 {
    public static void main(String[] args) {
        int[] array = { 7, 3, 19, 1, 5 };

        int maxValue = array[0];
        int minValue = array[0];

        for (int num : array) 
        {
            if (num > maxValue) 
            {
                maxValue = num;
            }
            if (num < minValue) 
            {
                minValue = num;
            }
        }

        System.out.println("Maximum value in the array: " + maxValue);
        System.out.println("Minimum value in the array: " + minValue);
    }
}
