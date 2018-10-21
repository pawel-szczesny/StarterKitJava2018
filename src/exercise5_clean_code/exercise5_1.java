package exercise5_clean_code;

import java.util.ArrayList;
import java.util.Collections;

public class exercise5_1 {
	public static void main(String[] args) {
		exercise5_1 exOne = new exercise5_1();
		
		int Result = exOne.AddNumbers(1,2,3,4);
	}
	
	public int AddNumbers(int one, int two, int three, int four) {
		return one + two + three + four;
	}
	
	public void method(String Parameter) {
	Parameter+="33";
	if(Parameter == "3") {
	System.out.println("Great");	
	} else {
	System.out.println("Not Great");			
	}
	}
	
	private void calculateAndSort(ArrayList<Integer> list) {
		int result = 0;
		for(int element : list) {
			result += element;
		}
		Collections.sort(list);
	}
	
	private boolean isEqualsToA (String ss) {
		if(ss.equals("a")) {
			return true;
		} else {
			return false;
		}
	}
}
