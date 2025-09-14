//wap to print all numbers from 1 to 10 except 3 and 7.
package ForLoop;

public class PrintAllNumberOneToTenExceptThreeAndSeven {
    public static void main(String[] args) {
        for (int num=1;num<=10;num++){
            if (num!=3 && num!=7){
                System.out.println(num);
            }
        }
    }
}
