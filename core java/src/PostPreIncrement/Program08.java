//int x = 10;
//		int y = -2;
//		int z = ++x * y++;
//		sop(x);
//		sop(y);
//		sop(z);

package PostPreIncrement;

public class Program08 {
    public static void main(String[] args) {
        int x=10;
        int y=-2;
        int z=++x * y++;
        System.out.println("value of x="+x);
        System.out.println("value of y="+y);
        System.out.println("value of z="+z);

    }
}
