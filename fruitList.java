package lexicalAnalyzer;

/**
 *
 * @authors 
 *      INACAY, VASSILI L.
 *      MARTIN, KATRYNA LEI V.
 *      3rd Year BSCS - AN31
 */

import java.util.ArrayList;
import java.util.List;

public class fruitList {

    public void addFruit(List<String> list, String element) {
        list.add(element);
    }
    
    public void removeFruit(List<String> list, String element) {
        list.remove(element);
    }

    public void clearFruitList(List<String> list) {
        list.clear();
    }
    
    public static void main(String[] args) {
        fruitList listManipulator = new fruitList();
        List<String> listOfFruit = new ArrayList<>();
        listOfFruit.add("Banana");
        listOfFruit.add("Apple");
        listOfFruit.add("Pear");
        listOfFruit.add("Strawberry");
        
        System.out.println("Original List: " + listOfFruit);
 
        listManipulator.addFruit(listOfFruit, "Orange");
        System.out.println("After adding a fruit: " + listOfFruit);

        listManipulator.removeFruit(listOfFruit, "Banana");
        System.out.println("After removing a fruit: " + listOfFruit);

        listManipulator.clearFruitList(listOfFruit);
        System.out.println("After clearing the listOfFruit: " + listOfFruit);
    }
}
