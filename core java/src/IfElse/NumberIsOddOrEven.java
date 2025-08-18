//Wap to print odd if number is odd and even if number is even
package IfElse;

import java.util.Scanner;

public class NumberIsOddOrEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= scanner.nextInt();
        if (num1%2==0){
            System.out.println("enter number is even ");
        }
        else
            System.out.println("enter number is odd");
    }
}
