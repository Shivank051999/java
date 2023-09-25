/*Q8.
A
AB
ABC
ABCD
ABCDE 
*/

public class Q8 {
    public static void main(String[] args) {
        char currentChar = 'A';

        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(currentChar);
                currentChar++; 
            }
            currentChar = 'A'; 
            System.out.println(); 
        }
    }
}
