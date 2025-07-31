//wap to find a number is odd or even
package IfOrElse.july28;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");
        int num2= scanner.nextInt();
        if (num1%2==0){
            System.out.println("Given number is even "+num1);
        }
        else
            System.out.println("given number is odd "+num2);
    }
}
