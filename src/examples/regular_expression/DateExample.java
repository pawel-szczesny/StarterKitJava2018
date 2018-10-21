package examples.regular_expression;

import java.time.LocalDate;
import java.util.ArrayList;

public class DateExample {
	private static final ArrayList<String> REGEXES_TO_CHECK = new ArrayList<>();
	
	static {
		REGEXES_TO_CHECK.add("NotWorking");
		REGEXES_TO_CHECK.add("\\d{4}-\\d{2}-\\d{2}");
		REGEXES_TO_CHECK.add("\\d{4}-\\d{1}-\\d{2}");
		REGEXES_TO_CHECK.add("\\d{4}-\\d{2}-\\d{1}");
	}
	
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate.toString());
		
		for(String regex : REGEXES_TO_CHECK) {
			System.out.println(localDate.toString().matches(regex));	
		}
	}
}
