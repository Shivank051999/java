//Q7.check whether a matrix is identity matrix or not.
import java.util.Scanner;

public class Q7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        
        boolean isIdentity = true;
        if(rows!=columns)
        {
            System.out.println("You hadn't entered the equivalent values of rows and columns. Sorry, the program is getting terminated. ");
        }
        else if(rows==columns)
        {
            System.out.println("You can enter the values of rows and columns: ");
        
            int[][] matrix = new int[rows][columns];
            System.out.println("Enter the matrix elements:");
            for (int i = 0; i < rows; i++) 
            {
                for (int j = 0; j < columns; j++) 
                {
                    matrix[i][j] = sc.nextInt();
                }
            }
        
        
            for (int i = 0; i < rows; i++) 
            {
                for (int j = 0; j < columns; j++) 
                {
                    if (i == j && matrix[i][j] != 1) 
                    {
                        isIdentity = false;
                        break;
                    }
                    if (i != j && matrix[i][j] != 0) 
                    {
                        isIdentity = false;
                        break;
                    }
                }
                if (!isIdentity) 
                {
                    break;
                }
            }
        
            if (isIdentity) 
            {
                System.out.println("The matrix is an identity matrix.");
            } 
            else 
            {
                System.out.println("The matrix is not an identity matrix.");
            }
        }
        sc.close();
    }
}
