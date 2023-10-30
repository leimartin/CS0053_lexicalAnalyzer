package lexicalAnalyzer;

/**
 *
 * @authors 
 *      INACAY, VASSILI L.
 *      MARTIN, KATRYNA LEI V.
 *      3rd Year BSCS - AN31
 */

public class areaCalculator {
    
    public static double squareArea(double side) {
        return side * side;
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        System.out.printf("The area of the square is %.2f.%n", areaCalculator.squareArea(5));
        System.out.printf("The area of the rectangle is %.2f.%n", areaCalculator.rectangleArea(4, 6));
        System.out.printf("The area of the circle is %.2f.%n", areaCalculator.circleArea(3));
    }
}
