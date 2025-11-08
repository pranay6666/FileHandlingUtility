package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile 
{
	private String fileName;

    /**
     * Constructor to initialize the filename.
     * 
     * @param fileName the name or path of the file to be read
     */
    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Reads the file and prints its contents line by line.
     * Displays a message if the file is not found.
     */
    public void read() {
        File file = new File(fileName);

        try {
            Scanner scan = new Scanner(file);

            System.out.println("------ File Content ------");
            // Loop through each line of the file and display it
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
            System.out.println("--------------------------");

            // Close the scanner to free resources
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println(" File not found! Please make sure the file exists or write something first.");
        }
    }

}
