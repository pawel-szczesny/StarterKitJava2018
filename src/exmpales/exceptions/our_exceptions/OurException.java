package exmpales.exceptions.our_exceptions;

public class OurException extends RuntimeException {
	private static final String DEFAULT_MESSAGE = "Default message of our exception";
	
	public OurException() {
		super(DEFAULT_MESSAGE);
	}
	
	public OurException(String message) {
		super(message);
	}
	
}
