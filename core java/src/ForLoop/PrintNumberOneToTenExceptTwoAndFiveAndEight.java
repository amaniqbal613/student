//wap to print all numbers from 1 to 10 except 2 and 5 and 8.
package ForLoop;

public class PrintNumberOneToTenExceptTwoAndFiveAndEight {
    public static void main(String[] args) {
        for (int num=1;num<=10;num++){
            if (num!=2 && num!=5 && num!=8){
                System.out.println(num);
            }
        }
    }
}
