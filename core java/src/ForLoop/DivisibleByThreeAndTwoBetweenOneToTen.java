//wap to print numbers which is completely divisible by 3 and 2 between 1 to 10.
package ForLoop;

public class DivisibleByThreeAndTwoBetweenOneToTen {
    public static void main(String[] args) {
        System.out.println("below number is divisible by 2 and 3");
        for (int i=1;i<=10;i++){
            if (i%2==0&&i%3==0){
                    System.out.println(i);
                }
            }
        }
    }

