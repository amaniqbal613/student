//7.	int a = 10;
//		int b = 3;
//		boolean x = a++==10 && ++b==4;
//		boolean y = --a==10 || b--<4;
//		sop(a);
//		sop(b);
//		sop(x);
//		sop(y);
package RelationalOperators2;

public class Program5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        boolean x = a++==10 && ++b==4;
        boolean y = --a==10 || b--<4;
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
