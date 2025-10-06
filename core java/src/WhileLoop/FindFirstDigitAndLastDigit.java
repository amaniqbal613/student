//56.	Wap to find first and last digit of a number.
package WhileLoop;

import java.util.Scanner;

public class FindFirstDigitAndLastDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
            int num= sc.nextInt();
            int ognum=Math.abs(num);
            int lastdigit=ognum%10;
            int firstdigit=ognum;
            while (firstdigit>=10){
                firstdigit/=10;
            }
        System.out.println("firstdigit="+firstdigit);
        System.out.println("lastdigit="+lastdigit);
    }
}
