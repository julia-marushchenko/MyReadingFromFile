// Java program to demonstrate reading from file

package com.inputoutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) throws IOException {

        // Creating File Reader
        FileReader fileReader = null;

        // Block trycatch to catch exceptions
        try {
            // Initializing File Reader
            fileReader = new FileReader("J:/Users/.../MyReadingFromFile/src/com/inputoutput/File.txt");

            // Reading from file
            int temporal;

            // Checking if file is not empty
            while ((temporal = fileReader.read()) != -1) {
                System.out.println((char)temporal);
            }

            // Print to console that program successfully executed
            System.out.print("Program successfully executed");

        } catch (FileNotFoundException e1){
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("IOException appeared");
             // Block finally that executes for sure
        } finally {

            // Closing stream that no longer in use
            if (fileReader != null){
                fileReader.close();
            }
        }
    }
}