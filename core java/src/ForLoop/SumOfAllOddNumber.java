//53.	Wap to find sum of all odd numbers between 1 to n.
package ForLoop;

import java.util.Scanner;

public class SumOfAllOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
            System.out.println("sum of all odd number between 1 to"+n+"is:"+sum);
    }
}
