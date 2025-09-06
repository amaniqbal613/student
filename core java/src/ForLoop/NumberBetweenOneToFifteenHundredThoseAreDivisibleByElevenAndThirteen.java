//wap to print wap to print all numbers between 1 to 1500 those are divisible by 11 and 13.
package ForLoop;

public class NumberBetweenOneToFifteenHundredThoseAreDivisibleByElevenAndThirteen {
    public static void main(String[] args) {
        System.out.println("all numbers between 1 to 1500 those are divisible by 11 and 13.");
        for (int i=1;i<=1500;i++){
            if (i%11==0 && i%13==0){
                System.out.println(i);
            }
        }
    }
}
