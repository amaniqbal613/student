//wap to find a number is negative or positive or zero
package IfOrElse.july28;

import java.util.Scanner;

public class NumberIsPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("enter the second number");
        int num2 = scanner.nextInt();
        if (num1<0) {
            System.out.println("given number is negative "+num1);
        } else if (num1==0){
            System.out.println("given number value is zero "+num1);
        }
        else
            System.out.println("given number is positive "+num2);


    }
}