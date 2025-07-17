//int i = 19/5;

package ScannerType;
import java.util.Scanner;
public class DivisionOnExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the numerator");
        int numerator= scanner.nextInt();
        System.out.println("enter the denominator");
        int denominator= scanner.nextInt();
        int result =numerator/denominator;
        System.out.println("Result ");
        scanner.close();
    }
}
