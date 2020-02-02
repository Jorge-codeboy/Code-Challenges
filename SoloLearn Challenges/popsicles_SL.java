import java.util.Scanner;

public class popsicles_SL {
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
        
        
        scanner.close();


    
    }
}