//wap to find which number is greater among three numbers
package IfOrElse.july28;

import java.util.Scanner;

public class FindGreaterNumberAmongThreeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");
        int num2= scanner.nextInt();
        System.out.println("enter the third number");
        int num3= scanner.nextInt();
        if (num1>=num2 && num1>=num3){
            System.out.println("num1 is greater "+num1);
        }
         else if (num2>=num1 && num2>=num3){
            System.out.println("num2 is greater "+num2);
        }
        else
            System.out.println("num3 is greater "+num3);
    }
}
