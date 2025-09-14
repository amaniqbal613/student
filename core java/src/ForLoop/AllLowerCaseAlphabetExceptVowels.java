//wap to print all lower case alphabets except vowels.
package ForLoop;

public class AllLowerCaseAlphabetExceptVowels {
    public static void main(String[] args) {
        for (char c='a';c<='z';c++){
            if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                System.out.println(c);
            }
        }

    }
}
