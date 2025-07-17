//9.wap to define a double and assing it to a float variable and print both variables using scanner

package ScannerType;
import java.util.Scanner;
public class DoubleToFloat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value");
        double doubleValue= scanner.nextDouble();
        float floatValue=(float)doubleValue;
        System.out.println("enter the value of double:"+doubleValue);
        System.out.println("value of float:"+floatValue);
        scanner.close();
    }
}
