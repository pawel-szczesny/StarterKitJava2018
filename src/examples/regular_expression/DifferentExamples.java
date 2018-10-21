package examples.regular_expression;

import java.util.regex.Pattern;

public class DifferentExamples {
	public static void main(String[] args) {
		// Using Full Form
		System.out.println(isMatchesFullFormExample("abc.", "abcD"));
		
		//Using shorter form 
		System.out.println(isMatchesShorterFormExample("abc.", "abcD"));
		System.out.println(Pattern.matches("regex", "ciąg do sprawdzenia"));
		
		// Using String.matches()
		String someWord = "abcD";
		boolean isMatchesToRegex = someWord.matches("abc.");
		System.out.println(isMatchesToRegex);
	}
	
	public static boolean isMatchesFullFormExample(String regex, String stringToCheck) {
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(stringToCheck).matches();
	}
	
	public static boolean isMatchesShorterFormExample(String regex, String stringToCheck) {
		return Pattern.matches(regex, stringToCheck);
	}
}
