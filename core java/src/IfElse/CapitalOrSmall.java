//Wap to print 'capital' if given character is capital letter, else print 'small' if charater is in lower case
package IfElse;

import java.util.Scanner;

public class CapitalOrSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE character");
        char Char=sc.next().charAt(0);
        if (Character.isLowerCase(Char)){
            System.out.println("SMALL");

        }
        else
            System.out.println("CAPITAL");
    }
}
