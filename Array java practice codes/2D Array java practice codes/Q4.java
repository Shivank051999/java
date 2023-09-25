//Q4.count all even elements in an matrix.
import java.util.Scanner;

public class Q4 {
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
                matrix[i][j] = sc.nextInt();
            }
        }

        int evenCount = countEvenElements(matrix);

        System.out.println("Number of even elements in the matrix: " + evenCount);

        sc.close();
    }

    public static int countEvenElements(int[][] matrix) {
        int evenCount = 0;

        for (int[] row : matrix) 
        {
            for (int num : row) 
            {
                if (num % 2 == 0) 
                {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }
}
