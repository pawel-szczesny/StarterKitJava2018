package examples.exceptions;

import java.io.IOException;

public class UncheckedAndCheckedExceptions {
	public static void main(String[] args) {
		checkedException();
		uncheckedException();
	}
	
	public static void checkedException() {
		// try, catch is needed to compile this class
		try {
			throw new IOException("Something went wrong with IO operations");
		} catch(IOException e) {
			System.out.println("Got you!");
		}
	}
	
	public static void uncheckedException() { 
		// No needed to have try, catch (to compile this class)
		throw new RuntimeException("Something went wrong");
	}
}
