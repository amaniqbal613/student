//wap to print all upper case vowels.
package ForLoop;

public class AllUpperCaseVowels {
    public static void main(String[] args) {
        System.out.println("Uppercase vowels are:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch);
            }
        }
    }
}
