package examples.exceptions;

import java.util.ArrayList;

public class PrintInformationFromExceptions {
	
	private static ArrayList<String> arrayList;
	
	public static void main(String[] args) {
		messageFromOurException();
		messageFromJavaClasses();
	}
	
	public static void messageFromOurException() {
		try {  
			throw new Exception("Our best messsage!");
		} catch (Exception e) {  
		   	System.out.println("What happened: " + e.getMessage());
			System.out.println("Details: ");
			e.printStackTrace();
		} finally {
			System.out.println("Finally do something!");
		}
	}
	
	public static void messageFromJavaClasses() {
		arrayList = new ArrayList<String>();
		arrayList.add("1");
		
		try {
			arrayList.get(9);
		} catch (NullPointerException e) {
			System.out.println("What happened: " + e.getMessage());
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("What happened: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
}
