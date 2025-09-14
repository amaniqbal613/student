//wap to print all lower case vowels.
package ForLoop;

public class PrintAllLowerCaseVowels {
    public static void main(String[] args) {
        for (char c='a';c<='z';c++){
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                System.out.println(c);
            }
        }
    }
}
