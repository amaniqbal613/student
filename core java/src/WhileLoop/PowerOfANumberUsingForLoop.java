//	64.	Wap to find power of a number using for loop.
package WhileLoop;

import java.util.Scanner;

public class PowerOfANumberUsingForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base");
        int base= sc.nextInt();
        System.out.println("enter the exponent");
        int exponent= sc.nextInt();
        int result=1;
        int i=1;
        while(i<=exponent){
            result*=base;
            i++;
        }
        System.out.println(base + " raised to the power " + exponent + " is: " + result);

    }
}
