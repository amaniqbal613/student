//Wap to check whether a given number is positive and double digit or single digit number
package IfElse;

import java.util.Scanner;

public class NumberIsPositiveOrDoubleDigitOrSingleDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= sc.nextInt();
        if (num1>10 && num1<99){
            System.out.println("enter number is in double digit");
        }
        if (num1<10){
            System.out.println("enter number is single or negative");
        }
    }
}
