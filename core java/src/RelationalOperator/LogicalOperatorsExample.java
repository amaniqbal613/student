//int a = -1;
//		int b = 1;
//		boolean x = ++a<=0 && ++b>1;
//		boolean y = --a > -2 || b-- < 1;
//		sop(a);
//		sop(b);
//		sop(x);
//		sop(y);

package RelationalOperator;

public class LogicalOperatorsExample {
    public static void main(String[] args) {
        int a=-1;
        int b=1;
        boolean x=++a<=0 && ++b>1;
        boolean y=--a>-2 ||b--<1;
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);
        System.out.println("Value of x:"+x);
        System.out.println("Value of y:"+y);
    }
}
