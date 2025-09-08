//wap to give a condition that loop may be rotate upto 10 but break loop when it rotates uptop 7 times.
package ForLoop;

public class LoopBreakOnSeventhRotation {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Loop iteration: " + i);

            if (i == 7) {
                System.out.println("Loop has run 7 times. Breaking now...");
                break;
            }
        }
    }
}