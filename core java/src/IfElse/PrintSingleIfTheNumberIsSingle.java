//Wap to print single if number is single digit
package IfElse;

import java.util.Scanner;

public class PrintSingleIfTheNumberIsSingle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= scanner.nextInt();
        if (num1<10){
            System.out.println("SINGLE");
        }
        else
            System.out.println("NOT SINGLE");
    }
}
