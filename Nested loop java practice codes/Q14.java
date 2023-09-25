/*Q14.
    1
   121
  12321
 1234321
123454321 
*/

public class Q14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <= 5 - i; j++) 
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) 
            {
                if (j <= i) 
                {
                    System.out.print(j);
                } 
                else 
                {
                    System.out.print(2 * i - j);
                }
            }
            System.out.println();
        }
    }
}
