package lexicalAnalyzer;

/**
 *
 * @authors 
 *      INACAY, VASSILI L.
 *      MARTIN, KATRYNA LEI V.
 *      3rd Year BSCS - AN31
 */

public class stringManipulator {
    // if text contains the String "Computer Science" the expected output should be:
    
    // COMPUTER SCIENCE
    public String convertToUppercase(String text) {
        return text.toUpperCase();
    }
    
    // Computer Studies
    public String replaceSubstring(String text, String target, String replacement) {
        return text.replace(target, replacement);
    }
    
    // ecneicS retupmoC
    public String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        stringManipulator reformatText = new stringManipulator();
        String text = "Computer Science";
        
        String uppercaseText = reformatText.convertToUppercase(text);
        System.out.println("Uppercase Text: " + uppercaseText);
        
        String replacedText = reformatText.replaceSubstring(text, "Science", "Studies");
        System.out.println("Replaced Text: " + replacedText);
 
        String reversedText = reformatText.reverseString(text);
        System.out.println("Reversed Text: " + reversedText);  
    }
}
