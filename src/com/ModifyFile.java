package com;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * The ModifyFile class allows the user to completely replace
 * the existing content of a specified file with new content.
 */
public class ModifyFile
{
	// Stores the file path or name that needs modification
    private String fileName;

    // Constructor to initialize the file name
    public ModifyFile(String fileName) {
        this.fileName = fileName;
    }

    // Method to modify (replace) the content of the file
    public void modify(Scanner scan) {
        System.out.println(" Enter new content (this will replace old content):");
        String text = scan.nextLine();

        try {
            // Create FileWriter (overwrites existing file content)
            FileWriter fileWriter = new FileWriter(fileName);

            // Write the new text into the file
            fileWriter.write(text);

            // Close the file writer
            fileWriter.close();

            System.out.println("File modified successfully!");

        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }
}
