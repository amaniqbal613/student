//1.wap to create a char variable but assign an int value and print that variable?
//using scanner.

package ScannerType;

import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
        System.out.println("enter any integers");
        int intValue= scanner.nextInt();
        char charValue=(char)intValue;
        System.out.println("the character representation is:"+charValue);
        scanner.close();
    }
}
