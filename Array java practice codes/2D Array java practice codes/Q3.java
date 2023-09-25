//Q3.take a matrix dimension from user and get value in that matrix and print them.
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix you entered:");

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
        sc.close();
    }
}