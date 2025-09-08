//wap to print all upper case alphabets except vowels.
package ForLoop;

public class PrintAllUpperCaseAlphabetExceptVowels {
    public static void main(String[] args) {
        for (char c='A';c<='Z';c++){
            if (c!='A' && c!='E' && c!='I' && c!='O' && c!='U'){
                System.out.println(c);
            }
        }
    }
}
