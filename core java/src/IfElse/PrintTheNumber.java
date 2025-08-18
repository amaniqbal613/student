//Wap to print zero if number zero, 1 if positive and -1 if number is negative
package IfElse;

import java.util.Scanner;

public class PrintTheNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        double num1= scanner.nextDouble();
        if (num1>0) {
            System.out.println(1);
        }
            if (num1<0){
                System.out.println(-1);
            }
            else
                System.out.println(0);
        }

    }

