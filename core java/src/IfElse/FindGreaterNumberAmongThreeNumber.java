//wap to find which number is greater among three numbers
package IfElse;

import java.util.Scanner;

public class FindGreaterNumberAmongThreeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");
        int num2= scanner.nextInt();
        System.out.println("enter the third number");
        int num3= scanner.nextInt();
        if (num1>num2&&num1>num3)
            System.out.println("greater the number is="+num1);
            else if (num2>num1&&num2>num3)
        System.out.println("greater number is "+num2);
        else
        System.out.println("greater number is "+num3);

        }
    }

