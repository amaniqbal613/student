//	4.	wap to print positive number among two given numbers( with if and without if).
package TernaryOperators;

import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= sc.nextInt();
        System.out.println("enter the second number");
        int num2= sc.nextInt();
        if (num1>0){
            System.out.println(num1 +" is positive");
        }
        else
            System.out.println(num2+" is positive");
        //ternary operator
        int positive=num1>0? num1:num2;
        System.out.println(positive +" is positive");
    }
}
