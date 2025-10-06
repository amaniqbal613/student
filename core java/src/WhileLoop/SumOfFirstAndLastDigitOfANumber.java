//57.	Wap to find sum of first and last digit of a number.
package WhileLoop;

import java.util.Scanner;

public class SumOfFirstAndLastDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int ognum=Math.abs(num);
        int lastnum=ognum%10;
        int firstnum=ognum;
        while (firstnum>=10) {
            firstnum /= 10;
        }
            int sum=firstnum+lastnum;
            System.out.println("first number="+firstnum);
            System.out.println("last number="+lastnum);
            System.out.println("sum of first number and last number="+sum);

    }
}
