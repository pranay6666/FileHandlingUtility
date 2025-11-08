package com;

import java.util.Scanner;

public class FileHandlingUtilityMainClass 
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter File Name (with extension , eg : file.txt)");
		String fileName=scan.next();
		// Create objects for all file operations
		WriteFile writeFile=new WriteFile(fileName);
		ReadFile readFile=new ReadFile(fileName);
		AppendFile appendFile=new AppendFile(fileName);
		ModifyFile modifyFile=new ModifyFile(fileName);
		//menu loop
		while(true)
		{
			System.out.println("*****  File Handling Utility  *****");
			System.out.println("1. Write to File");
			System.out.println("2. Read from File");
			System.out.println("3. Append to file");
			System.out.println("4. Modify file");
			System.out.println("5. EXIT");
			System.out.println("Choose the option : ");
			int choice =scan.nextInt();
			scan.nextLine();
			switch (choice) {
			case 1:writeFile.write(scan);
				break;
			case 2:readFile.read();
			break;
			case 3:appendFile.append(scan);
			break;
			case 4:modifyFile.modify(scan);
			break;
			case 5:
				System.out.println("Exiting program Thank you * ");
				scan.close();
				return;
			default: System.out.println("Invalid choice! Try Again ");
				break;
			}
		}
		
	}
}
