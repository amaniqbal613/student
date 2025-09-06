//wap to print all numbers between 10 to 90 those are not divisible by 2 and 5.
package ForLoop;

public class NumberBetweenTenAndNinetyThoseAreNotDivisibleByTwoAndFive {
    public static void main(String[] args) {
        System.out.println(" numbers between 10 to 90 those are not divisible by 2 and 5.");
        for (int i=10;i<=90;i++){
            if (i%2==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
