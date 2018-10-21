package examples.clean_code;

public class ExamplesCleanCode {

	public static void main(String[] args) {
		// WRONG Approches
		
		// 1. Commented lines of code
		// example:
		
		// driver.click()
	}
	
	public void someMethod(String firstArgument, String second, String nextArgument, int someInt) {
		// To many arguments - try to minimalize it
	}
	
	public void methodDoingThatAndSomeOtherThing() {
		// When you need to use 'and' word in name of method, please re-think it, maybe it will be better to split it into two methods.
	}
	
	public boolean returnBooleanValueWrong() {
		if ("a".equals("a")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean returnBooleanValueGood() {
		return "a".equals("a");
	}
	
	public void someMethod() {
		// It's good to have variable on the first lines in this scope
		int as = 1;
		int sdf = 13;
	}
}
