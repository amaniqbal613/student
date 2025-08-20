//Wap to print 'up' if any given character is upper case
package IfElse;

import java.util.Scanner;

public class PrintUpForUpperCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the character");
        char char1=scanner.next().charAt(0);
        if (Character.isUpperCase(char1)){
            System.out.println("UP");
        }
        else
            System.out.println("not UP");
    }
}
