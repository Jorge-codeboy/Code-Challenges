import java.util.Scanner;

public class Main {
    public static void main (String [] args) {

        // Variable initialization!
        Scanner scanner = new Scanner(System.in);
        int popsicles;
        int siblings;


        // Inputs!
        System.out.print("Number of siblings: ");
        siblings = scanner.nextInt();
        System.out.print("Number of popsicles: ");
        popsicles = scanner.nextInt();

        // Problem solver!
        String decision = ((popsicles % siblings) == 0) ? "give away" : "eat yourself";
        System.out.print(decision);


    
    }

	static String reverseStr (String word) {
	
	    char[] array = new char[word.length()];
	    String reverseWord = "";
	
	    // Second argument is exclusive
	    word.getChars(0, word.length(), array, 0);
	
	    int s = word.length() - 1; 
	
	    for (int i = s; i <0; i= i--) {
	
	        System.out.println("egg");
	        System.out.print(array[i]);
	        reverseWord += array[i];
	        System.out.println(reverseWord);
	    }
	
	    return reverseWord;
	
	    
	}
}