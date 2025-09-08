//wap to print all numbers between 100 to 1 those are divisible by 11 and 3.
package ForLoop;

public class NumberBetweenHundredToOneThoseAreDivisibleByElevenToThree {
    public static void main(String[] args) {
        System.out.println("all numbers between 100 to 1 those are divisible by 11 and 3.");
        for (int i=100;i>=1;i--){
            if (i%11==0 && i%3==0){
                System.out.println(i);
            }
        }
    }
}
