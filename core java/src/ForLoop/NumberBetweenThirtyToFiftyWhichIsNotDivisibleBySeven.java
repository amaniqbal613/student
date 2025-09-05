//wap to print all numbers between 30 to 50 those are not divisible by 7.
package ForLoop;

public class NumberBetweenThirtyToFiftyWhichIsNotDivisibleBySeven {
    public static void main(String[] args) {
        System.out.println("number between 30 to 50 which are not divisible by 7");
        for (int i=30;i<=50;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
