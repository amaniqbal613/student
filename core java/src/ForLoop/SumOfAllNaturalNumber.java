//51.	Wap to find sum of all natural numbers between 1 to n.
package ForLoop;

import java.util.Scanner;

public class SumOfAllNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("sum of all natural number from 1 to"+n+"is:"+sum);

    }
    
}
