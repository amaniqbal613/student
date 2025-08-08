//wap to find smallest number among 3 numbers
package ScannerType;

import java.util.Scanner;

public class WhichNumberIsSmallerBetweenThreeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");
        int num2= scanner.nextInt();
        System.out.println("enter the third number");
        int num3= scanner.nextInt();
        if (num1<=num2 && num1<=num3){
            System.out.println("first number is smallest"+num1);
        }
         else if (num2<=num3 && num2<=num1) {
            System.out.println("second number is smallest"+num2);
        }
        else
            System.out.println("third number is smallest"+num3);
    }
}
