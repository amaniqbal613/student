//54.	Wap to print multiplication table of any number.
package ForLoop;

import java.util.Scanner;

public class MultiplicationTableOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number to print its multiplication table ");
        int n= sc.nextInt();
        System.out.println("multiplication table of " +n+":");
        for (int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));

        }
    }
}
