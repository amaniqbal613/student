//Wap to print double if number is a double digit
package IfElse;

import java.util.Scanner;

public class PrintDoubleIfTheNumberIsDouble {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= scanner.nextInt();
        if ((num1>=10 && num1<=99) ||(num1<=-10 && num1>=-99)){
            System.out.println("DOUBLE");

        }
        else
            System.out.println("NOT DOUBLE");
    }
}
