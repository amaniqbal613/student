//wap to find a number is multiple of 10 or not
package IfOrElse.july28;

import java.util.Scanner;

public class MultipleOf10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number");
        int num1 = scanner.nextInt();


        if (num1 % 10 == 0) {
            System.out.println("given number is multiple of 10" + num1);

        } else
            System.out.println("given number is not multiple of 10" + num1);
    }
}
