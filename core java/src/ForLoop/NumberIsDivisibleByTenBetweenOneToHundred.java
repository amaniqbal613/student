//wap to print numbers which is completely divisible by 10 between 1 to 100.
package ForLoop;

public class NumberIsDivisibleByTenBetweenOneToHundred {
    public static void main(String[] args) {
        System.out.println("below number is divisible by 10");
        for (int i=1;i<=100;i++){
            if (i%10==0){
                System.out.println(i);
            }
        }
    }
}
