//7.wap to define an int variable and assign its value to a short type variable and print both variables.using scanner.

package ScannerType;
import java.util.Scanner;
public class IntToShort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of int");
        int intValue= scanner.nextInt();
        short shortValue=(short)intValue;
        System.out.println("enter the value of int:"+intValue);
        System.out.println(" value of short:"+shortValue);
    }
}
