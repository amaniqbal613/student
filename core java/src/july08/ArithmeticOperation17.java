//int a = 31, b = 40;
//		int c = b - a;
//		b = c % a;
//		b = b / a;
//		a = ++c;
//		b = (a - --b) * c;

package july08;

public class ArithmeticOperation17 {
    public static void main(String[] args) {
        int a=31,b=40;
        int c=b-a;
        b=c%a;
        b=b/a;
        a=++c;
        b=(a- --b)*c;
        System.out.println( "result=" +b);
    }
}
