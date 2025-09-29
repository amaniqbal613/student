//44.	wap to find sum of a number e.g ip=1234,  op=10
package ForLoop;

import java.util.Scanner;

public class SumOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        for (; num != 0; num = num / 10) {
            int digit = num % 10;
            sum += digit;
        }
        System.out.println("Sum of digits: " + sum);
    }
}


