package lexicalAnalyzer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @authors 
 *      INACAY, VASSILI L.
 *      MARTIN, KATRYNA LEI V.
 *      3rd Year BSCS - AN31
 */

public class toDoFile {
   
    public void writeNewTask(String filename, List<String> lines) {
        try {
            BufferedWriter toDoWriter = new BufferedWriter(new FileWriter(filename));
            for (String line : lines) {
                toDoWriter.write(line);
                toDoWriter.newLine();
            }
            toDoWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void appendNewTask(String filename, String line) {
        try {
            BufferedWriter appendWriter = new BufferedWriter(new FileWriter(filename, true));
            appendWriter.write(line);
            appendWriter.newLine();
            appendWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> readTasks(String filename) {
        List<String> toDoLines = new ArrayList<>();
        try {
            BufferedReader toDoReader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = toDoReader.readLine()) != null) {
                toDoLines.add(line);
            }
            toDoReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return toDoLines;
    }
    
     public static void main(String[] args) {
        toDoFile toDoFileHandler = new toDoFile();
        List<String> toDoLines = new ArrayList<>();
        toDoLines.add("[/] - CS0053: Formative Assessment 5");
        toDoLines.add("[X] - CS0045: Formative Assessment 4");
        toDoLines.add("[ ] - CS0025: Formative Assessment 6");

        toDoFileHandler.writeNewTask("myToDoList.txt", toDoLines);

        List<String> readToDoLines = toDoFileHandler.readTasks("myToDoList.txt");
        for (String line : readToDoLines) {
            System.out.println(line);
        }
        
        // append new task
        toDoFileHandler.appendNewTask("myToDoList.txt", "[ ] - CS0025: Title Defense (11/15)");

        List<String> appendedToDoLines = toDoFileHandler.readTasks("myToDoList.txt");
        
        System.out.print("""
                           =====================================
                                 << Updated To Do List >>
                           =====================================
                           """);
        for (String toDoline : appendedToDoLines) {
            System.out.println(toDoline);
        }
    }
}
