//Q16
/*
* * * * *
*       *
* * * * *
*/
public class Q16 {
    public static void main(String[] args) {
        int rows = 3;

        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
                if (i == 2 && (j == 2 || j == 3 || j == 4)) 
                {
                    System.out.print("  ");
                } 
                else 
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

