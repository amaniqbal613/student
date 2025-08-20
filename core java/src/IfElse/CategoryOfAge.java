//Wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18
package IfElse;

import java.util.Scanner;

public class CategoryOfAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age= sc.nextInt();
        if (age<13){
            System.out.println("kid");
        }
        if (age<18 && age>13 ){
            System.out.println("teenage");
        }
        if (age>18)
            System.out.println("adult");
    }
}
