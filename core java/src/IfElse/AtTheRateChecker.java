//Wap to print 'at the rate' if the given character is @ else print 'no rate'
package IfElse;

import java.util.Scanner;

public class AtTheRateChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        if (ch=='@'){
            System.out.println("at the rate");
        }
        else
            System.out.println("not at the rate");
    }
}
