//1.	wap to do pre increment a number and assign its value to other number and print both number
package PostPreIncrement;

public class Progam01 {
    public static void main(String[] args) {
        System.out.println("(PRE INCREMENT)");
        int a=12;
        int b=++a;
        System.out.println("value of pre increment="+a);
        System.out.println("value of pre increment="+b);

        //2.wap to do post increment a number and assign its value to other number and print both number
        System.out.println("(POST INCREMENT)");
        int c=12;
        int d=c++;
        System.out.println("value of post increment="+c);
        System.out.println("value of post increment="+d);


    }

}
