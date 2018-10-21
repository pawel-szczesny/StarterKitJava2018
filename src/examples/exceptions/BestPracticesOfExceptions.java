package examples.exceptions;

import java.util.Random;

import examples.exceptions.our_exceptions.OurException;

public class BestPracticesOfExceptions {
	public static void main(String[] args) {
		lookForTheMostSpecificException();
		
		// if we know what was the reason of exception is good to pack it with our own exception
		
		// Example 1: Caught exception and thrown own
		ifPossibleUseOwnExceptions();
		ifPossibleUseOwnExceptionsWithOwnMessage();
		
		// Example 2: If some logic is not expect - thrown own Exception
		ifPossibleUseOwnExceptions_2();
		
	}
	
	public static void ifPossibleUseOwnExceptions() {
		try {
			throw new RuntimeException("Something went wrong!");
		} catch (RuntimeException e) {
			// Do something
			throw new OurException();
		}
	}
	
	public static void ifPossibleUseOwnExceptionsWithOwnMessage() {
		try {
			throw new RuntimeException("Something went wrong!");
		} catch (RuntimeException e) {
			// Do something
			throw new OurException("With our meaningfull message. " + " Original Exception: " + e.getMessage());
		}
	}
	
	public static void ifPossibleUseOwnExceptions_2() {
		if(someLogic()) {
			throw new OurException("With our meaningfull message!");
		}
	}
	
	private static boolean someLogic() {
		return new Random().nextBoolean();
	}
	
	public static void lookForTheMostSpecificException() {
		// If is it possible catch only 'expected' exceptions, not ALL Exception
	}
}
