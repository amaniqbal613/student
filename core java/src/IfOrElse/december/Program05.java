//	5.	wap to find whether a number is divisible by a given number completely.
package IfOrElse.december;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= sc.nextInt();
        System.out.println("enter the number to divide");
        int num2= sc.nextInt();
        if (num1%num2==0){
            System.out.println(num1+" is  divisible by a given number completely ");
        }
        else
            System.out.println(num1+" is not  divisible by a given number completely");
    }
}
