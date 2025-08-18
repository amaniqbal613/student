//Wap to print ternary if number is 3 digit
package IfElse;

import java.util.Scanner;

public class PrintTernaryIfNumberIsThreeDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= scanner.nextInt();
        if (num1>99){
            System.out.println("TERNARY");
        }
        else
            System.out.println("NOT TERNARY");
    }
}
