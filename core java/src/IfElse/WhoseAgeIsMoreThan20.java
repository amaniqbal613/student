//boolean male = false;
//		int age = 30;
//		if( male )
//		    if( age < 20 )
//			System.out.println("Boy");
//		    else
//			System.out.println("Man");
//		else
//		    if( age < 20 )
//			System.out.println("Girl");
//		    else
//			System.out.println("Woman");
package IfElse;

public class WhoseAgeIsMoreThan20 {
    public static void main(String[] args) {
        boolean male = false;
        int age = 30;
        if( male )
            if( age < 20 )
                System.out.println("Boy");
            else
                System.out.println("Man");
        else
        if( age < 20 )
            System.out.println("Girl");
        else
            System.out.println("Woman");
    }
}
