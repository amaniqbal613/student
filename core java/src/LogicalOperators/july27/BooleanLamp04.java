//boolean lampX = false, result;
//		boolean lampY = true;
//		result = lampY && lampX;
//		System.out.println("Lamp switch-on " + result);
//		result = lampY || result;
//		System.out.println("Lamp switch-on " + result);
package LogicalOperators.july27;

public class BooleanLamp04 {
    public static void main(String[] args) {
        boolean lampX = false, result;
        boolean lampY = true;
        result = lampY && lampX;
        System.out.println("Lamp switch-on " + result);
        result = lampY || result;
        System.out.println("Lamp switch-on " + result);
    }
}
