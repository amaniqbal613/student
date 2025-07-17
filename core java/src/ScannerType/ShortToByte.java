//5.wap to define a short variable and assign its value to a byte type variable and print both variables.using scanner

package ScannerType;
import java.util.Scanner;
public class ShortToByte {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of short");
        short shortValue= scanner.nextShort();
        byte byteValue=(byte)shortValue;
        System.out.println("enter value of short:"+shortValue);
        System.out.println(" value in byte:"+byteValue);
        scanner.close();

    }
}
