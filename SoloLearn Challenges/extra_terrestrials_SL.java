import java.util.Scanner;

public class extra_terrestrials_SL {

    public static void main (String [] args) {


        Scanner input = new Scanner(System.in);
        // Method call and input!
        System.out.println("Input:");
        System.out.println("");
        String reverseWord = reverseStr(input.nextLine());
        System.out.println("");
        // Output!
        System.out.println("Output:");
        System.out.println("");
        System.out.println(reverseWord);
        
        input.close();
    }

    static String reverseStr (String word) {

        // array where our String will be stored
        char[] array = new char[word.length()];
        
        String reversedWord = "";

        // Second argument is exclusive!!!, this pass our String -> char[]
        word.getChars(0, word.length(), array, 0);

        // Reverse algorithm!
        for (int i = word.length() - 1; i != -1; --i) {
        
            // Save the reversed word
            reversedWord += array[i];
        }

        return reversedWord;

    }
}