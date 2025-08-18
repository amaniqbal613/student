//Wap to find least number among two numbers
package IfElse;

import java.util.Scanner;

public class LeastNumberAmongTwoNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");
        int num2= scanner.nextInt();
        if (num1<num2){
            System.out.println(num1+" is least");
        }
        else
            System.out.println(num2+" is least");

    }
}
