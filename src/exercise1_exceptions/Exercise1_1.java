package exercise1_exceptions;

public class Exercise1_1 {
	public static void main(String[] args) {
		Exercise1_1 exOne = new Exercise1_1();
		
		exOne.firstException();
		
		exOne.secondException();
	}
	
	public void firstException() {
		try {
			int wrongNumber = 3/0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void secondException() {
		Integer[] integerArray = new Integer[]{1,2,3};
		try {
			int number = integerArray[-1];
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("dzialam dalej");
	}
}
