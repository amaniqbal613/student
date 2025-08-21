//Wap to print alphabet if the given character is 'alphabet' else print 'non alphabet'
package IfElse;

import java.util.Scanner;

public class AlphabetOrNotAlphabet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any alphabet or non alphabet");
       String input=scanner.nextLine();
       if (input.equals("alphabet")){
           System.out.println("Alphabet");
        }
       else
           System.out.println("not alphabet");
    }
}
