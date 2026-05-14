import java.util.Scanner;

public class Q12 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a sentence: ");
            String sentence = input.nextLine();

            System.out.print("Enter word to replace: ");
            String oldWord = input.nextLine();

            System.out.print("Enter replacement word: ");
            String newWord = input.nextLine();

            String updatedSentence = sentence.replace(oldWord, newWord);

            System.out.println("Updated sentence:");
            System.out.println(updatedSentence);
        }
    }

