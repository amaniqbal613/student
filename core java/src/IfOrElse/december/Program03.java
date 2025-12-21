//	3.	wap to find a number is odd or even
package IfOrElse.december;

import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even");
        }
        if (num1 % 2 != 0) {
            System.out.println(num1 + " is odd");
        }
        if (num2 % 2 == 0) {
            System.out.println(num2 + " is even");
        }
        if (num2 % 2 != 0) {
            System.out.println(num2 + " is odd");
        }
    }
}