//Wap to print 'number' if the given character is number else 'non number'
package IfElse;

import java.util.Scanner;

public class NumberOrNotNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        if (Character.isDigit(ch)){
            System.out.println("number");
        }
        else
            System.out.println("not number");
    }
}
