//wap to print all numbers between 30 to 80 those are divisible by 6 and 5.
package ForLoop;

public class NumberBetweenThirtyToEightyThoseAreDivisibleBySixAndFive {
    public static void main(String[] args) {
        System.out.println("number between 30 to 80 those are divisible by 6 and 5");
        for (int i=30;i<=80;i++){
            if (i%6==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
