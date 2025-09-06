//wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.
package ForLoop;

public class NumberBetweenTenAndSeventyThoseAreDivisibleByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Number between 10 to 70 those are divisible by 3 and 5");
        for (int i=10;i<=70;i++){
            if (i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
