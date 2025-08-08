//Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z ).
//		Hint: u can use ascii value to solve this issue
package ScannerType;

import java.util.Scanner;

public class CheckWhetherGivenAlphabetIsLowercaseOrUppercase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a character");
        char ch=scanner.next().charAt(0);
        if (ch>=65 && ch<=90){
            System.out.println("enter character is in uppercase.");
        }
         else
            System.out.println("enter character is in lowercase");



    }
}
