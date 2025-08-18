//	Wap to print 100 if number is between 100 to 200
package IfElse;

import java.util.Scanner;

public class Print100IfTheNumberIsBetween100To200 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= scanner.nextInt();
        if (num1>=100 && num1<=200){
            System.out.println("100");
        }
        else
            System.out.println("NOT BETWEEN 100 TO 200");
    }
}
