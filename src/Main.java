
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Pig Latin Translator!");

        String answer = "";
        //loop to keep translating if the user enters "yes"
        do {
            System.out.println("Enter a word to translate: ");
            String word = scan.next().toLowerCase();

            //translate the word
            String translated = translate(word);

            //output it
            System.out.println(translated);

            System.out.println("Do you want to continue? yes/no ");
            //get the response, turn it lower case
            answer = scan.next().toLowerCase();

        } while (answer.equals("yes"));

        scan.close();
    }
    public static String translate (String word) {

        //if the first character is a vowel
        //int consonant = findConsonant(word);
        int vowel = findVowel(word);

        System.out.println(vowel);

        //if it's an invalid word

        if (vowel == -1) {

            return "Invalid:" + word;
        }
        //if a word starts with a vowel, just add "way" onto the ending
        if (vowel == 0) {

            return word + ("way");
        }
        //if a word starts with a consonant, move words starting with consonants to the end -add ay

        else { return word.substring (vowel, word.length()) + word.substring(0,vowel) + "ay";
        }
    }
    public static int findVowel (String word){
        //for loop i from pos 0 to 4 (or end of word)
        for (int i = 0; i < word.length(); ++i) {
            //use charAt() to get the letter
            char letter = word.charAt(i);

            //if it's 'a' or 'e' or 'i' or 'o' or 'u'
           if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
               return(i);
           }
        }
        return -1;
    }

    }