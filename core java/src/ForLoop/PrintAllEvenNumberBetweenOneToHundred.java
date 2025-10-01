//49.	Wap to print all even numbers between 1 to 100.
package ForLoop;

public class PrintAllEvenNumberBetweenOneToHundred {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
