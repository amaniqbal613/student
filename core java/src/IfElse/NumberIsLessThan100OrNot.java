//Wap to check whether number is less than 100 or not
package IfElse;

import java.util.Scanner;

public class NumberIsLessThan100OrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= scanner.nextInt();
        if (num1<100 ){
            System.out.println("enter number is less than 100");

        }
        if (num1>100){
            System.out.println("enter number is more than 100");
        }
        else
            System.out.println("enter number is equal to 100");
    }
}
