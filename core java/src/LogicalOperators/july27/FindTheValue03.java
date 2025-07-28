//int a = 1;
//		int b = 2;
//		if(a!=1 || b++==3){
//			sop("hello world");
//		}
//		what will be the value of a and b on printing

package LogicalOperators.july27;

public class FindTheValue03 {
        public static void main(String[] args) {
            int a=1;
            int b=2;
            if (a!=1||b++==3){  //one condition is not correct
                System.out.println("hello world");
                System.out.println("a="+a);
                System.out.println("b="+b);
            }
        }
    }


