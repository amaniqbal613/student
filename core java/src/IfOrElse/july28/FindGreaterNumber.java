//wap to find which number is greater among two numbers
package IfOrElse.july28;

import java.util.Scanner;

public class FindGreaterNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");
        int num2= scanner.nextInt();
        if (num1>num2){
            System.out.println("num1 is greater  "+num1);
        }
        else
            System.out.println("num2 is greater  "+num2);
    }
}
