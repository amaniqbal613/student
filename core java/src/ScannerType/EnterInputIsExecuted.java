//boolean a, b, c;
//		a = b = c = true;
//		if( !a || ( b && c ) ) {
//		    System.out.println("If executed");
//		}
package ScannerType;

public class EnterInputIsExecuted {
    public static void main(String[] args) {
        boolean a,b,c;
        a=b=c=true;
        if (!a&&(b && c)){
            System.out.println("if executed");
        }
        else
            System.out.println("not executed");
    }
}
