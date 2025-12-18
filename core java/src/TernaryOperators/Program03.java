//	3.	wap to print negative number among two given numbers( with if and without if).
package TernaryOperators;

import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= sc.nextInt();
        System.out.println("enter the econd number");
        int num2= sc.nextInt();
        if (num1<0){
            System.out.println(num1+" is negative");
        }
        else
            System.out.println(num2 + " is negative");
        //ternary operator
        int negative=num1<0? num1:num2;
        System.out.println(negative +" is negative");
    }
}
