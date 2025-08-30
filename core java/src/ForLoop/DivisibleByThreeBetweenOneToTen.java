//wap to print numbers which is completely divisible by 3 between 1 to 10.
package ForLoop;

public class DivisibleByThreeBetweenOneToTen {
    public static void main(String[] args) {
        System.out.println("divisible of 3");
        for (int i=1;i<=10;i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
