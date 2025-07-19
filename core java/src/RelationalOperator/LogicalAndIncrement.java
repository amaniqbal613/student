//10.	int a = -1;
//		boolean x = a!=-2 && ++a==0;
//		sop(a);
//		sop(x);

package RelationalOperator;

import com.sun.jdi.Value;

public class LogicalAndIncrement {
    public static void main(String[] args) {
        int a=-1;
        boolean x=a!=-2 && ++a==0;
        System.out.println("Value of a:"+a);
        System.out.println("Value of x: "+x);
    }
}
