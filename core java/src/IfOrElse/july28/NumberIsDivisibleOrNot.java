//wap to find whether a number is divisible by a given number completely.
package IfOrElse.july28;

import java.util.Scanner;

public class NumberIsDivisibleOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number which will be divided");
        int num1= scanner.nextInt();
        System.out.println("enter the number to divide");
        int num2= scanner.nextInt();
        if (num1%num2==0){
            System.out.println("given number is divisible by  "+num2);
        }
        else
            System.out.println("given number is not divisible by "+num1);

    }
}
