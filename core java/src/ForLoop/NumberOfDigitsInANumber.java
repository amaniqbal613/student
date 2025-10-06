//	Wap to count number of digits in a number.
package ForLoop;

import java.util.Scanner;

public class NumberOfDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        num=Math.abs(num);
        int count=0;
        if (num==0){
            count=1;
        }else{
            for (;num!=0;num/=10){
                count++;
            }
        }
        System.out.println("number of digits="+count);
    }
}
