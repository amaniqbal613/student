//6.wap to define a short variable and assign its value to an int type variable and print both variables.using scanner

package ScannerType;
import java.util.Scanner;
public class ShortToInt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of short");
        short shortValue= scanner.nextShort();
        int intValue=shortValue;
        System.out.println("enter the value of short value:"+shortValue);
        System.out.println("enter the value of int value:"+intValue);
        scanner.close();
    }
}
