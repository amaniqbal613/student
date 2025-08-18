//wap to create a char variable but assign an int value and print that variable?
package july10;
import java.util.Scanner;
public class TypeCastingWithScanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int intValue=34;
        System.out.print("Enter an integer value (e.g., 65 for 'A'): ");
        int value = scanner.nextInt();
        char ch = (char) value;
        System.out.println("The corresponding character is: " + ch);

        scanner.close();
    }
}