//43.	wap to reverse a number e.g ip=12345, op=54321 avoid zero
package ForLoop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        for (; num != 0; num = num / 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("Reversed number: " + reverse);
    }
}


