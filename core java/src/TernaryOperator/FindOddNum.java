//wap to print odd number among two given numbers( with if and without if).
package TernaryOperator;

import java.util.Scanner;

public class FindOddNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");
        int num2= scanner.nextInt();
        if (num1%2!=0){
            System.out.println("it is odd"+num1);
        }
        else
            System.out.println("it is not odd"+num2);
        System.out.println("ternary operator");
        int result=num1%2!=0? num1:num2;
        System.out.println("enter number is odd"+result);
    }
}
