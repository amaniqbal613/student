//int a=1, b=2, c=-3;
//		int s = a++ + b-- * c++ ;
//		sop(a);
//		sop(b);
//		sop(c);
//		sop(s);
//
package RelationalOperator;

public class RelationalOperatorsSum11 {
    public static void main(String[] args) {
        int num1=1,num2=2,num3=-3;
        int num4=num1++ +num2-- * num3++;
        System.out.println("value of num1:"+num1);
        System.out.println("value of num2:"+num2);
        System.out.println("value of num3:"+num3);
        System.out.println("value of num4:"+num4);
    }
}
