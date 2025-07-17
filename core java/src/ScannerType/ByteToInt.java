//	8.	wap to define a byte variable and assign its value to an int type variable and print both variables.using scanner.

package ScannerType;
import java.util.Scanner;
public class ByteToInt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value");
        byte byteValue= scanner.nextByte();
        int intValue=byteValue;
        System.out.println("enter the value of byte:"+byteValue);
        System.out.println("value of int:"+intValue);
        scanner.close();
    }
}
