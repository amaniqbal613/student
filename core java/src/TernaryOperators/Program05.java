//	5.	wap to print even number among two given numbers( with if and without if).
package TernaryOperators;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= sc.nextInt();
        System.out.println("enter the second number");
        int num2= sc.nextInt();
        if (num1%2==0){
            System.out.println(num1+" is even");
        }
        else
            System.out.println(num2+" is even");
        //ternary operator
        int even=num1%2==0? num1:num2;
        System.out.println(even+" is even");
    }
}
