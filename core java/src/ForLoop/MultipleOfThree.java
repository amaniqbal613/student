//wap to print numbers which is multiple of 3 between 1 to 22.
package ForLoop;

public class MultipleOfThree {
    public static void main(String[] args) {
        System.out.println("below number is multiple of 3");
        for (int i=1;i<=22;i++ ){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
