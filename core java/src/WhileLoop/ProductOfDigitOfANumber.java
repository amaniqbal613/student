//	60.	Wap to calculate product of digits of a number.
package WhileLoop;

import java.util.Scanner;

public class ProductOfDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int product=1;
        int originalnum=num;
        if (num==0){
            product=0;
        }else{
            while (num!=0){
                int digit=num%10;
                product*=digit;
                num/=10;
            }
        }
        System.out.println("Product of digits of " + originalnum + " = " + product);

    }
}
