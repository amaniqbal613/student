//Wap to print 'star' if the given character is * else print 'no star'
package IfElse;

import java.util.Scanner;

public class StarOrNoStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        if (ch=='*'){
            System.out.println("star");
        }
        else
            System.out.println("no star");
    }
}
