//wap to find smallest number among 2 numbers
package ScannerType;

import java.util.Scanner;

public class WhichNumberIsSmaller {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number ");
        int num2= scanner.nextInt();
        if (num1<num2){
            System.out.println("first number is smaller="+num1);
        }
        else
            System.out.println("second number is smaller="+num2);

    }
}
