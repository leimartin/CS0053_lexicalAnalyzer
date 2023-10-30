package lexicalAnalyzer;

/**
 *
 * @authors 
 *      INACAY, VASSILI L.
 *      MARTIN, KATRYNA LEI V.
 *      3rd Year BSCS - AN31
 */

public class inconsistentIndentation {

    public static void main(String args[]) {

int a = 10;
	if (a < 10) {
System.out.println("a is less than 10.");
}
else {
	System.out.println("a is greater than or equal to 10.");
}
    }
}
