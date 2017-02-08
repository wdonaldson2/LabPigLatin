import java.util.Scanner;

/**
 * Created by williamdonaldson on 2/7/17.
 */
public class Practice {
    public static void main(String[] args) {
        //output a count from 1 to 1000
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }

        //output a count from 200 to 0 by fours (200, 196, 192... 0)

        for (int i = 200; i <= 0; i -= 4) {
            System.out.println(i);
        }

        //take an int from the user
        //keep prompting them for an int until its between 1 and 10
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        while (number < 1 | number > 10) ;
        System.out.println("Please enter an interger between 1 and 10: ");
        {
            number = scan.nextInt();
        }

        System.out.println("Thank you; your number is " + number);

        String sentence = "Hello World";
        //output the contents of sentence until the first space
        //1.Find a space
        int firstSpace = sentence.indexOf(' ');
        //2.Get the substring up until the first space
        // note: this will not include the space in substring
        String firstWord = sentence.substring(0, firstSpace);
        //output
        System.out.println(firstWord);

        String w = firstWord("Here is a sentence ");
        System.out.println(w);

        {

        }
    }
    //write a method that takes a String arg and returns the first word

        public static String firstWord(String s) {
            //1.Find a space
            int firstSpace= s.indexOf(' ');
            //2.Get the substring up until the first space
            // note: this will not include the space in substring
            String firstWord = s.substring(0, firstSpace);
            //output
            return firstWord;
        }
}