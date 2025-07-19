//wap to compare two numbers and print the result, >, >=, <, <=, ==, !=
package RelationalOperator;
import java.util.Scanner;
public class CompareTwoNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number");
        int a= scanner.nextInt();
        System.out.println("enter second number");
        int b= scanner.nextInt();
        System.out.println("\nComparison Result:");
        System.out.println(a+">"+b+":"+(a>b));
        System.out.println(a+">="+b+":"+(a>=b));
        System.out.println(a+"<"+b+":"+(a<b));
        System.out.println(a+"<="+b+":"+(a<=b));
        System.out.println(a+"=="+b+":"+(a==b));
        System.out.println(a+"!="+b+":"+(a!=b));

    }
}
