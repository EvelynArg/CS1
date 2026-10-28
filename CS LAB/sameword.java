import java.util.Scanner;
public class sameword {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter a word: ");

    String word=inp.nextLine();
    String reversedWord="";
    int wordLength = word.length();
    
        while (wordLength > 0) {
            reversedWord += word.charAt(wordLength - 1);
            wordLength--;
        }

        if (word.equals(reversedWord)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

        reversedWord = ""; // Reset reversedWord before using the for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        if (word.equals(reversedWord)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}
