//Wap to print hi if number is zero and by if number is 100
package IfElse;

import java.util.Scanner;

public class PrintHiOrIf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= scanner.nextInt();
        if (num1==0){
            System.out.println("HI");
        }
        if (num1==100){
            System.out.println("BYE");
        }
    }
}
