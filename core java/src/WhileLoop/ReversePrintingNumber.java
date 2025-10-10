//	61.	Wap to enter a number and print its reverse.
package WhileLoop;

import java.util.Scanner;

public class ReversePrintingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int reverse=0;
        while (num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        System.out.println("reverse number="+reverse);

    }
}
