//7.int x = -1;
//		int y = 2;
//		int z = --x * y++;
//		sop(x);
//		sop(y);
//		sop(z);
package PrePostDecrement;

public class Program5 {
    public static void main(String[] args) {
        int x = -1;
        int y = 2;
        int z = --x * y++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
