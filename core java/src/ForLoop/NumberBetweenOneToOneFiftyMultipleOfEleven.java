//wap to print all numbers between 1 to 150 multiple of 11.
package ForLoop;

public class NumberBetweenOneToOneFiftyMultipleOfEleven {
    public static void main(String[] args) {
        System.out.println("all numbers between 1 to 150 multiple of 11.");
        for (int i=1;i<=150;i++){
            if (i%11==0){
                System.out.println(i);
            }
        }
    }
}
