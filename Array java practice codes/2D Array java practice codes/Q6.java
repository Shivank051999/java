//Q6.count non-zero elements in a matrix.
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int nonZeroCount = countNonZeroElements(matrix);

        System.out.println("Number of non-zero elements in the matrix: " + nonZeroCount);

        scanner.close();
    }

    public static int countNonZeroElements(int[][] matrix) {
        int nonZeroCount = 0;

        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                if (matrix[i][j] != 0) 
                {
                    nonZeroCount++;
                }
            }
        }
        return nonZeroCount;
    }
}
