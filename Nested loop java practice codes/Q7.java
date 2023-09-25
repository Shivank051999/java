/*Q7.
12345
1234
123
12
1 
*/

public class Q7 
{
    public static void main(String[] args) 
    {
        for (int i = 5; i >= 1; i--) 
        {
            for (int j = i; j >= 1; j--) 
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
