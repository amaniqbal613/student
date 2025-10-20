//	66.	Wap to check whether a number is Prime number or not.
package WhileLoop;

import java.util.Scanner;

public class NumberIsPrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        boolean isPrime=true;
        if (num<=1){
        isPrime=false;
        }else{
            int i=2;
            while(i<=num /2){
                if (num%i==0){
                    isPrime=false;
                    break;
                }
                i++;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

    }
}
