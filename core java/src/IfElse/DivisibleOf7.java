//Wap to check whether number divisible by 7
package IfElse;

import java.util.Scanner;

public class DivisibleOf7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= scanner.nextInt();
        if (num1%7==0){
            System.out.println("enter number is divisible by 7");
        }
        else
            System.out.println("enter number is not divisible of 7");
    }
}
