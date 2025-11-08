package com;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * The AppendFile class adds new text at the end of an existing file
 * without deleting its previous content.
 */
public class AppendFile 
{
	// Stores the name or path of the target file
    private String fileName;

    // Constructor to initialize file name
    public AppendFile(String fileName) {
        this.fileName = fileName;
    }

    // Method to append new content to an existing file
    public void append(Scanner scan) {
        System.out.println(" Enter text to append into file:");
        String text = scan.nextLine();

        try {
            // FileWriter in append mode (true)
            FileWriter fileWriter = new FileWriter(fileName, true);

            // Write the new text on a new line
            fileWriter.write("\n" + text);

            // Close the writer
            fileWriter.close();

            System.out.println("Text appended successfully!");

        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }

}
