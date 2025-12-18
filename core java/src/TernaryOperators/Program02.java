//	2.	wap to print smallest number among two given numbers( with if and without if).
package TernaryOperators;

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= sc.nextInt();
        System.out.println("enter the second number");
        int num2= sc.nextInt();
        if (num1<num2){
            System.out.println(num1+ " is smaller");
        }
        else
            System.out.println(num2+ " is smaller");
        //ternary operator
        int smaller=num1<num2? num1:num2;
        System.out.println(smaller+" is smaller");
    }
}
