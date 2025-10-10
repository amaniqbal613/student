//63.	Wap to print all ASCII character with their values.
package WhileLoop;

import java.util.Scanner;

public class AsciiCharacterWithTheirValues {
    public static void main(String[] args) {
        int i=0;
        System.out.println("enter the number");
        System.out.println("---------------------");
    while (i<=127){
        System.out.println(i+"-->"+(char)i);
        i++;
    }
    }
}
