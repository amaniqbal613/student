//Wap to print all these on basis of give character value
//		'A' -> Capital
//		'a' -> small
package IfElse;

import java.util.Scanner;

public class CapitalAOrSmallA {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the character");
        char char1=scanner.next().charAt(0);
        if (Character.isLowerCase(char1)){
            System.out.println("small");
        }
        if (Character.isUpperCase(char1)){
            System.out.println("Capital");
        }
    }
}
