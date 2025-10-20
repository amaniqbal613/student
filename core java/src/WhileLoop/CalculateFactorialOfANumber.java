//	65.	Wap to calculate factorial of a number.
package WhileLoop;

import java.util.Scanner;

public class CalculateFactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial does not exist for negative numbers.");
        } else {
            int factorial = 1;
            int i = 1;

            while (i <= num) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }
}