//wap to print greatest number among two given numbers( with if and without if).
package Ternary;

import java.util.Scanner;

public class FindTheGreaterNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");

        int num1= scanner.nextInt();

        System.out.println("enter the second number");
        int num2= scanner.nextInt();

        if (num1>num2){
            System.out.println("Is greater "+num1);

        }
        else
            System.out.println("Is greater "+num2);

        //using ternary operator
        int greater=num1>num2? num1:num2;
        System.out.println("greater number is "+greater);
    }
}
