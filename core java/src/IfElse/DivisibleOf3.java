//Wap to print whether number is divisible by 3 or not
package IfElse;

import java.util.Scanner;

public class DivisibleOf3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= scanner.nextInt();
        if (num1%3==0){
            System.out.println("enter number is divisible of 3");
        }
        else
            System.out.println("enter number is not divisible of 3");
    }
}
