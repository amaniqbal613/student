//Wap to print 'num' if any given character is char numeric e.g. '1' or any such given number
package IfElse;

import java.util.Scanner;

public class PrintNumIfAnyGivenCharacterIsCharNumeric {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the character");
        char char1=scanner.next().charAt(0);
        if (Character.isDigit(char1)){
            System.out.println("NUM");
        }
        else
            System.out.println("not NUM");
    }
}
