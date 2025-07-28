//boolean lampX = false, result;
//		boolean lampY = true;
//		result = lampY || lampX;
//		System.out.println("Lamp switch-on " + result);
//		result = result && lampX;
//		System.out.println("Lamp switch-on " + result);

package LogicalOperators.july27;

public class BooleanLamp05 {
    public static void main(String[] args) {
        boolean lampX = false, result;
        boolean lampY = true;
        result = lampY || lampX;
        System.out.println("Lamp switch-on " + result);
        result = result && lampX;
        System.out.println("Lamp switch-on " + result);
    }
}
