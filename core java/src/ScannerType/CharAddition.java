//3.wap to declare tow char variable and assign a value then add these two variables and print the sum
//using scanner.

package ScannerType;
import java.util.Scanner;
public class CharAddition {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first character");
        char char1=scanner.next().charAt(0);
        System.out.println("enter the second number");
        char char2=scanner.next().charAt(0);
        int sum=char1+char2;
        System.out.println(sum);
        scanner.close();

    }
}
