//Wap to find least number among three numbers
package IfElse;

import java.util.Scanner;

public class LeastNumberAmongThreeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");
        int  num2= scanner.nextInt();
        System.out.println("enter the third number");
        int num3= scanner.nextInt();
        if (num1<num2 && num1<num3){
            System.out.println(num1+" is least among three number");
        }
        if (num2<num1 && num2<num3){
            System.out.println(num2+" is least among three number");
        }
        if (num3<num1 && num3<num2){
            System.out.println(num3+" is least among three number");
        }
    }
}
