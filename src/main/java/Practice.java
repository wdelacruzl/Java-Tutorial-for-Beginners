import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.String.*;

public class Practice {
    public static void main(String[] args) {
        // 1) Count the number of words in a sentence.

        // Scanner scanner = new Scanner(System.in);
        // var sentence = scanner.nextLine();
        //var stringTokenizer = new StringTokenizer(sentence);
        // int numWords = stringTokenizer.countTokens();
        // System.out.print("Number of words: " + numWords);


        // Count the number of times the word "the" is in a sentence

//        Scanner scanner = new Scanner(System.in);
//        var sentence = scanner.nextLine();
//        var stringTokenizer = new StringTokenizer(sentence);
//        int numThes = 0;
//        while(stringTokenizer.hasMoreTokens()) {
//            if (stringTokenizer.nextToken().equalsIgnoreCase("the" )) {
//                numThes++;

        // 3) Return the number of letters in the last word of the sentence
//         String lastWord = "1";
//        Scanner scanner = new Scanner(System.in);
//        var sentence = scanner.nextLine();
//        var stringTokenizer = new StringTokenizer(sentence);
//        while (stringTokenizer.hasMoreTokens()) {
//            lastWord = stringTokenizer.nextToken();
//        }
//
//    System.out.print("Number of letters in the last word: " + lastWord.toString().length());

        // Putting it all together!
        String lastWord = "";
        System.out.print("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        var sentence = scanner.nextLine();
        var stringTokenizer = new StringTokenizer(sentence);
        int numWords = stringTokenizer.countTokens();
        int numThes = 0;

        while (stringTokenizer.hasMoreTokens()) {
            lastWord = stringTokenizer.nextToken();
            if (stringTokenizer.nextToken().equalsIgnoreCase("the")) {
                numThes++;
            }
            System.out.println("Number of The(s) in the sentence: " + numThes);
            System.out.println("Number of words: " + numWords);
            System.out.print("Number of letters in the last word: " + lastWord.length());
        }
    }
}