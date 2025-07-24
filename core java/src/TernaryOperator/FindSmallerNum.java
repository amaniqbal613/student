//wap to print smallest number among two given numbers( with if and without if).
package TernaryOperator;

import java.util.Scanner;

public class FindSmallerNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = scanner.nextInt();
        System.out.println("enter the second number");
        int num2 = scanner.nextInt();
        if (num1 < num2) {
            System.out.println("number is smaller" + num1);
        } else
            System.out.println("number is smaller" + num2);

        //using ternary operator

        int smaller = num1 < num2 ? num1 : num2;
        System.out.println("is smaller " + smaller);
    }

}