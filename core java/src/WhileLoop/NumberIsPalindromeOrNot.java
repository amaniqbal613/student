//62.	Wap to check whether a number is palindrome or not.
package WhileLoop;

import java.util.Scanner;

public class NumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int originalnumber=num;
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if (originalnumber==reverse){
            System.out.println(originalnumber+" is palindrome");
        }else {
            System.out.println(originalnumber+" is not palindrome");
        }
    }
}
