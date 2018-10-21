package exercise2_code_debugging;

import java.util.ArrayList;
import java.util.Random;

public class Exercise2_2 {

	public static void main(String[] args) {
		Exercise2_2 exc2 = new Exercise2_2(); 
		
		String withoutZeros = exc2.removeZerosFromBegin("000011");
		System.out.println(withoutZeros);
		String withoutZeros2 = exc2.removeZerosFromBegin("2323111");
		
	}
	
	public String removeZerosFromBegin(String polynomial){
		//Tworzymy 
		String result = "";
		
		if(polynomial.charAt(0) == '0'){
			for(int i=1;i<polynomial.length();i++){
				result += polynomial.charAt(i);
			}
			return removeZerosFromBegin(result);
		} else {
			return polynomial;
		}
	}
	
	
}
