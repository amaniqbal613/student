//2.wap to create an int variable but assign a char value and print that variable?
//using scanner.

package ScannerType;
import java.util.Scanner;
public class CharToInt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a character:");
        char charValue=scanner.next().charAt(0);
        int intValue=charValue;
        System.out.println("The integer (Unicode) value is:"+intValue);
        scanner.close();

    }
}
