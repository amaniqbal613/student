//wap to print all numbers between 200 to 1 those are divisible by 13 and 2.
package ForLoop;

public class NumberBetweenTwoHundredToOneThoseAreDivisibleByThirteenAndTwo {
    public static void main(String[] args) {
        System.out.println("all numbers between 200 to 1 those are divisible by 13 and 2.");
        for (int i=200;i>=1;i--){
            if (i%13==0 && i%2==0){
                System.out.println(i);
            }
        }
    }
}
