//wap to print all odd numbers between 120 to 100.
package ForLoop;

public class PrintAllOddNumberFromHundredAndTwentyToHundred {
    public static void main(String[] args) {
        System.out.println(" odd number between 120 to 100 ");
        for (int i = 120; i >= 100; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
