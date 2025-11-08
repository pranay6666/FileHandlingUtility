package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile 
{
	 // Stores the file path or name where text will be written
    private String fileName;

    /**
     * Constructor to initialize the file name.
     * 
     * @param fileName the name or path of the file to write to
     */
    public WriteFile(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Writes user input text into the specified file.
     * 
     * @param scan Scanner object used to take input from the user
     */
    public void write(Scanner scan) {
        try {
            // Create a BufferedWriter to write data efficiently to the file
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

            System.out.println("✏️ Enter text to write into file:");
            String text = scan.nextLine(); // Read a single line of user input

            // Write the user text to the file
            bufferedWriter.write(text);

            // Close the writer to ensure data is saved and resources are freed
            bufferedWriter.close();

            System.out.println(" File written successfully!");

        } catch (IOException e) {
            System.out.println(" Error writing to file: " + e.getMessage());
        }
    }

}
