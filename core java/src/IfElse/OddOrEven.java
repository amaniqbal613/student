//wap to find a number is odd or even
package IfElse;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= scanner.nextInt();

        if (num1%2==0) {
            System.out.println("enter number is even=" + num1);

        }
        else
            System.out.println("enter number is odd="+num1);
    }
}
