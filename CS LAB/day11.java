import java.util.Scanner;
public class day11 {
    public static void main(String[] args) {
        //PROBLEM 1 
        for (int i = 1; i <= 4; i++) { //Number 
            for (int j = 1; j <= 4; j++) { //Multiplier
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
        //PROBLEM 2
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
