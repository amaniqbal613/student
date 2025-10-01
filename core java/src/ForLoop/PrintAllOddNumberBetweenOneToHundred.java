//50.	Wap to print all odd number between 1 to 100.
package ForLoop;

public class PrintAllOddNumberBetweenOneToHundred {
    public static void main(String[] args) {
        System.out.println("print all odd number between 1 to 100.");
        for (int i=1;i<=100;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
