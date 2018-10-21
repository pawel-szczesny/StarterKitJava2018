package examples.working_with_strings;

public class ComparingStrings {
	public static void main(String[] args) {
		String a = "a";
		String sameString = new String("a");
		
		System.out.println(a);
		System.out.println(sameString);
		
//		System.out.println(a.equals(sameString)); // comparing value
//		System.out.println(a == sameString); // comparing objects
	}
}
