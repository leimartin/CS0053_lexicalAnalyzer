package lexicalAnalyzer;

import java.util.Scanner;

/**
 *
 * @authors 
 *      INACAY, VASSILI L.
 *      MARTIN, KATRYNA LEI V.
 *      3rd Year BSCS - AN31
 */

// In this program, the user will be asked to input a letter. 
// The goal is to convert this letter into uppercase.
public class misspelledVariable {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter an Alphabet: ");
            char letter = scan.next().charAt(0);
            char uppercase; 
            
            if(Character.isAlphabetic(letter)) {
                uppercase = Character.toUpperCase(letter);
                // System.out.printf("The uppercase of %c is %c.%n", letter, uppercase);
                // System.out.printf("The uppercase of %c is %c.%n", letter, upperCase);
                System.exit(0);
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
        
        
    }
}
