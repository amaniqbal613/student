package july5;

import java.util.Scanner;

public class ScannerType {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first value");
        int a= sc.nextInt();
        System.out.println(a);
        sc.close();
    }
}

