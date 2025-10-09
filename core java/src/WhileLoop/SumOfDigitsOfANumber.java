//59.	Wap to calculate sum of digits of a number.
package WhileLoop;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int sum=0;
        int originalnum=num;
        while (num!=0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
            System.out.println("sum of digit"+originalnum+"="+sum);
    }
}
