//Wap to print 'hello world' if number is divisible by 3 and 5, print 'hello' if divisible by 3 only,
// print 'world' if number is divisible by 5.

package IfElse;

import java.util.Scanner;

public class HelloWorldChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number= sc.nextInt();
        if (number%3==0 && number%5==0){
            System.out.println("hello world");
        }
        if (number%3==0){
            System.out.println("hello");
        }
        if (number%5==0){
            System.out.println("world");
        }
    }
}
