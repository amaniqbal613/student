//wap to print all numbers between 10 to 300 those are divisible by 11 and 12.
package ForLoop;

public class NumberBetweenTenToThreeHundredThoseAreDivisibleByElevenAndTwelve {
    public static void main(String[] args) {
        System.out.println("all numbers between 10 to 300 those are divisible by 11 and 12.");
        for (int i=10;i<=300;i++){
            if (i%11==0 && i%12==0){
                System.out.println(i);
            }

        }
    }
}
