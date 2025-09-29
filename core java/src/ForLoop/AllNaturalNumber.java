//46.	Wap to print all natural numbers from 1 to n.
package ForLoop;

import java.util.Scanner;

public class AllNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();
        System.out.println("natural number from 1"+n+":");
        for (int i=1;i<=n;i++){
            System.out.println(i+" ");
        }

    }
}
