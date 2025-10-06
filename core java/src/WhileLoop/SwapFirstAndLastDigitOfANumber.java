//58.	Wap to swap first and last digits of a number.
package WhileLoop;

import java.util.Scanner;

public class SwapFirstAndLastDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        if (num<10 && num<-10){
            System.out.println("swapped number:"+num);
        }
        int number=Math.abs(num);
        int lastdigit=number%10;
        int digit=0;
        int temp=num;
        while (temp!=0){
            temp/=10;
            digit++;
        }
        int firstdigit=num/(int)Math.pow(10,digit-1);
        int middlePart = num % (int) Math.pow(10, digit - 1);
        middlePart = middlePart / 10;
        int swappedNum = lastdigit * (int) Math.pow(10, digit - 1)
                + middlePart * 10
                + firstdigit;
        if (number < 0) {
            swappedNum *= -1;
        }

        System.out.println("Number after swapping first and last digits: " + swappedNum);
    }
}



