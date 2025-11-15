//	5.	wap to pre increment a number n multiply with a number and assign product to a variable,
//	print both variables
package PrePostincrement;

public class program03 {
    public static void main(String[] args) {
        int a=23, b=++a;
        System.out.println("value of b="+b);
b=++a*4;
        System.out.println("value of a="+b);
        //	6.	wap to post increment a number n multiply with a number and assign product to a variable,
        //	print both variables
        System.out.println("post increment");
        int c=56, d=c++;
        System.out.println("value of c="+c);
        d=c++*4;
        System.out.println("value of c="+d);
    }
}
