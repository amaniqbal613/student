//wap to print all numbers between 130 to 90 those are not divisible by 10.
package ForLoop;

public class NumbersBetweenHundredAndThirtyToNintyThoseAreNotDivisibleByTen {
    public static void main(String[] args) {
        System.out.println("number between 130 to 90 those are not divisible by 10");
        for (int i=130;i>=100;i--){
            if (i%10!=0){
                System.out.println(i);
            }
        }
    }
}
