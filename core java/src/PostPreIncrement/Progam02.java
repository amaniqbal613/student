//3.wap to do pre increment a number and assign its value to other number and print both numbers,
// do assignment increment in same line.

package PostPreIncrement;

public class Progam02 {
    public static void main(String[] args) {
        System.out.println("(PRE INCREMENT)");
        int a=32, b=++a;
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
        //4.wap to do post increment a number and assign its value to other number and print both numbers,
        // do assignment increment in same line.
        System.out.println("(POST INCREMENT)");
        int c=32,d=c++;
        System.out.println("value of c="+c);
        System.out.println("value of d="+d);
    }

}
