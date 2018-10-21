package exercise1_exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise1_3 {
//Wyjatek typu checked exceptions
	
	public static void main(String[] args) {
		File file = new File("c://temp//testFile1.txt");
		  
		//Create the file
		if (file.createNewFile()){
		System.out.println("File is created!");
		}else{
		System.out.println("File already exists.");
		}
		
		 
		//Write Content
		FileWriter writer = new FileWriter(file);
		writer.write("Test data");
		writer.close();	
	}
	
	
}
