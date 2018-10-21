package examples.exceptions;

import examples.exceptions.our_exceptions.OurException;

public class BestPracticesOfExceptions {
	public static void main(String[] args) {
		lookForTheMostSpecificException();
		ifPossibleUseOwnExceptions();
		ifPossibleUseOwnExceptionsWithOwnMessage();
	}
	
	public static void ifPossibleUseOwnExceptions() {
		// if we know what was the reason of exception is good to pack it with our own exception
		try {
			throw new RuntimeException("Something went wrong!");
		} catch (RuntimeException e) {
			// Do something
			throw new OurException();
		}
	}
	
	public static void ifPossibleUseOwnExceptionsWithOwnMessage() {
		// if we know what was the reason of exception is good to pack it with our own exception
		try {
			throw new RuntimeException("Something went wrong!");
		} catch (RuntimeException e) {
			// Do something
			throw new OurException("With our meaningfull message. " + "Original Exception: " + e.getMessage());
		}
	}
	
	public static void lookForTheMostSpecificException() {
		//If is it possible catch only 'expected' exceptions, not ALL Exception
	}
}
