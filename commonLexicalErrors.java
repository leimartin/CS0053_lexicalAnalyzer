package lexicalAnalyzer;

/**
 *
 * @authors 
 *      INACAY, VASSILI L.
 *      MARTIN, KATRYNA LEI V.
 *      3rd Year BSCS - AN31
 */

public class commonLexicalErrors {

    public static void main(String args[]) {
        // The semicolon is missing.
        int a = 5 

        // The integer data type should be declared as 'int'.
        integer b = 10; 
        
        // Misspelled method name 'prtln' instead of the System.out.println()
        System.prtln("The sum is: " + (a + b)); 
        
        // Incorrect variable declaration. Whitespace is not allowed in variable names.
        int c d = 15; 
        
        // No closing quotation mark.
        String text = "This is a string with inconsistent quotation marks;
        System.out.println(text);
        
        int x = 5;
        // Variable y is not declared
        int result = x + y; 
        System.out.println(result);
    }
}
