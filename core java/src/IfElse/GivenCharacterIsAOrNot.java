//Wap to check whether a given character is capital 'A' or not
package IfElse;

import java.util.Scanner;

public class GivenCharacterIsAOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the character");
        char char1=scanner.next().charAt(0);
        if (char1=='A'){
            System.out.println("It is A");
        }
        else
            System.out.println("it is not A");
    }
}
