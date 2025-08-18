//	Wap to check whether number is between -100 to 50
package IfElse;

import java.util.Scanner;

public class EnterNumberIsbetweenMinus100Or50 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= scanner.nextInt();
        if (num1>=-100&&num1<=50){
            System.out.println("enter number is between -100 to 50");

        }
        else
            System.out.println("enter number is not in between -100 to 50");
    }
}
