//7.int a = 3
//		int b = ++a
//		what will be the value of a and b on printing

package PostPreIncrement;

public class Program04 {
    public static void main(String[] args) {
        System.out.println("(PRE INCREMENT)");
        int a=3;
        int b=++a;
        System.out.println("value a="+a);
        System.out.println("value b="+b);

        //POST INCREMENT
        //8.int c = -3;
        //		int d = c++;
        //		what will be the value of c and d on printing
        System.out.println("(POST INCREMENT)");
        int c=3;
        int d=c++;
        System.out.println("value of c"+c);
        System.out.println("value of d="+d);

    }

}
