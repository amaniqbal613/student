//wap to find which number is greater among two numbers
package IfElse;

import java.util.Scanner;

public class FindGreaterNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");
        int num2= scanner.nextInt();
        if(num1>num2){
            System.out.println("greater number is="+num1);
        }
        else
            System.out.println("greater number is="+num2);
    }
}
