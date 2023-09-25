//Q1. Write a Java program to sort a numeric array.

public class Q1 {
    public static void main(String[] args) {

        int[] numb = { 7, 3, 9, 2, 5 };
        int n = numb.length;
        int temp=0;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - 1 - i; j++) 
            {
                if (numb[j] > numb[j + 1]) 
                {
                    temp = numb[j];
                    numb[j] = numb[j + 1];
                    numb[j + 1] = temp;
                    
                }
            }
        }
        System.out.println("Sorted numeric array:" );
        for (int num : numb) 
        {
            System.out.print(num + " ");
        }
    }
}
