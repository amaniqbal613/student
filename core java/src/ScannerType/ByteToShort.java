//4.wap to define a byte variable and assign its value to a short type variable and print both values using scanner.

package ScannerType;
import java.util.Scanner;
public class ByteToShort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the byte value");
        byte byteValue = scanner.nextByte();
        short shortValue = byteValue;

        System.out.println("byte value:" + byteValue);
        System.out.println("short value:" + shortValue);
        scanner.close();
    }

}