//wap to print all numbers between 10 to 50 those are divisible by 2 and 5.
package ForLoop;

public class NumberBetweenTenToFiftyThoseAreDivisibleByTwoAndFive {
    public static void main(String[] args) {
        System.out.println("number between 10 to 50 those are divisible by 2 and 5 ");
        for (int i=10;i<=50;i++){
            if (i%2==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
