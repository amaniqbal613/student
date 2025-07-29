//int a = 10;
//		int b = 3;
//		boolean x = a++==10 && ++b==4;
//		boolean y = --a==10 || b--<4;
//		sop(a);
//		sop(b);
//		sop(x);
//		sop(y);
//
package RelationalOperators.july27;

public class Sum04 {
    public static void main(String[] args) {
        int a=10;
        int b=3;
        boolean x=a++==10 &&++b==4;
        boolean y=--a==10 ||b--<4;
        System.out.println("value of "+a);
        System.out.println("value of "+b);
        System.out.println(" Condition in x "+x);
        System.out.println(" Condition in  y "+y);
    }
}
