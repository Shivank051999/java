/*Q15.
       *
      * * 
     * * *
    * * * *
     * * * 
    * * * *
   * * * * *
  * * * * * *
   * * * * * 
  * * * * * *
 * * * * * * *
* * * * * * * *
    * * * *
    * * * *
    * * * *
    * * * * 
*/

public class Q15 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i <= 4; i++)
        {
            for (int j = 10; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++)
            {
                System.out.print("* ");
            }
            System.out.println("");   
        }
        for (int i = 4; i < 8; i++)
        {
            for (int j = 11; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");   
        }
        for (int i = 8; i < 12; i++)
        {
            for (int j = 13; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 3; k < i; k++)
            {
                System.out.print("* ");
            }
            System.out.println("");   
        }
        for (int i = 0; i < 4 ; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < 4; k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        } 
    }
}