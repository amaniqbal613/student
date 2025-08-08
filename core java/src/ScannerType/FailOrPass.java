//int marks = 80;
//		if( marks > 70 )
//		    System.out.println("Distinction");
//		if( marks > 35 )
//		    System.out.println("Pass");
//		else
//		    System.out.println("Fail");
//		    System.out.println("Better luck next time");
package ScannerType;



public class FailOrPass {
    public static void main(String[] args) {

        int marks=80;
        if( marks >= 70 )
            System.out.println("Distinction");
        else if ( marks >= 35 )
            System.out.println("Pass");
        else
            System.out.println("Fail");

    }
}
