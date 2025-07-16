//16.	int x = 10;
//		int y = -2;
//		int z = ++x / y++;
//		sop(x);
//		sop(y);
//		sop(z);
package PostPreIncrement;

public class program12 {
    public static void main(String[] args) {
        int x = 10;
		int y = -2;
		int z = ++x / y++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
