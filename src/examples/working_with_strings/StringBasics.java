package examples.working_with_strings;

public class StringBasics {
	private final static String SOME_EXAMPLE_STRING = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
													+ "Cras vel leo elit. Etiam rhoncus blandit vehicula. Morbi eget dui ante. "
													+ "Aenean auctor est sit amet leo pulvinar gravida";
			
	
	public static void main(String[] args) {
		// Adding char to String
		String someWord = "Hello World";
		System.out.println(addSomeCharToString('!', someWord));
		
		// Syntax of +=
		String someNumberAsString = "1";
		someNumberAsString += "2";
		someNumberAsString += 3;
		// someNumberAsString += 4;
		System.out.println(someNumberAsString);
		
		// Syntax od concat
		String someWordToConcat = "Java";
		someWordToConcat = someWordToConcat.concat("8 The Best!");
		someWordToConcat.concat("8 The Worst!");
		System.out.println(someWordToConcat);
		
		// Some methods available to String
		System.out.println(SOME_EXAMPLE_STRING.length());
		System.out.println(SOME_EXAMPLE_STRING.startsWith("Lorem"));
		System.out.println(SOME_EXAMPLE_STRING.endsWith("Lorem ipsum"));
		
	}
	
	public static String addSomeCharToString(char someChar, String someString) {
		return someString + someChar;
	}
}
