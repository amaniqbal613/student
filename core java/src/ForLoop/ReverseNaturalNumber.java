//Wap to print all natural numbers in reverse (from n to 1).
package ForLoop;

import java.util.Scanner;

public class ReverseNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int num= sc.nextInt();
        System.out.println("natural number from 1"+num+":");
        for (int i=num;i>=1;i--){
            System.out.println(i+"");

        }
    }
}
