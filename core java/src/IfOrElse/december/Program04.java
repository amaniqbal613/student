//	4.	wap to find a number is negative or positive or zero
package IfOrElse.december;

import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num1= sc.nextInt();
        if (num1<0){
            System.out.println(num1+" is negative");
        }
        else
            System.out.println(num1+" is positive");
    }
}
