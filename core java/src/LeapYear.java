//wap to check the year is leap year or not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
        System.out.println("enter the year");
        int year= scanner.nextInt();
        if ((year%4==0 &&year%100!=0)|| (year%400==0)){
            System.out.println(year+ " it is a leap year");
        }
else{
            System.out.println(year+ " it is not a leap year");
        }


    }
}

