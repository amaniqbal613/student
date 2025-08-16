//Wap to find a given number is negative or not?
package IfElse;

import java.util.Scanner;

public class NumberIsNegativeOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");
        int num2= scanner.nextInt();
        if (num1<=0){
            System.out.println("given number is negative"+num1);
        }
        else
            System.out.println("given num is positive"+num2);
    }
}
