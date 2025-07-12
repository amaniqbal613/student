//5.wap to pre increment a number n multiply with a number and assign product to a variable, print both variables

package PostPreIncrement;

public class Program03 {
    public static void main(String[] args) {
        System.out.println("(PRE INCREMENT)");
        int a=45;
        int b=++a;
        System.out.println("value of b="+b);
        b=++a*4;
        System.out.println("product for a="+b);
        //6.wap to post increment a number n multiply with a number and assign product to a variable,
        // print both variables
        System.out.println("(POST INCREMENT)");
        int e=45;
        int f=e++;
        System.out.println("value of f="+f);
        f=e++*4;
        System.out.println("product of e="+f);


    }
}
