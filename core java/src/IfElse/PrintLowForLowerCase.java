//Wap to print 'low' if any given character is lower case
package IfElse;

import java.util.Scanner;

public class PrintLowForLowerCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the character");
        char char1=scanner.next().charAt(0);
        if (Character.isLowerCase(char1)){
            System.out.println("LOW");
        }
        else
            System.out.println("not LOW");
    }
}
