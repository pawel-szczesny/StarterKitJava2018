package exercise2_code_debugging;

import java.util.ArrayList;

public class Exercise2_3 {
	public static void main(String[] args) {
		Exercise2_3 exc3 = new Exercise2_3(); 
		
		exc3.findPrimeNumbersUsingSieveOfErasthenes(100);
	}
	
	public ArrayList<Integer> findPrimeNumbersUsingSieveOfErasthenes(int maxNumber){
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		for(int i=1; i<=maxNumber; i++) 
			primeNumbers.add(i);
		int howMany = (int) Math.floor(Math.sqrt(maxNumber));
		int j;
		for(int i=2; i<=howMany; i++) {
			if(primeNumbers.get(i-1)!=0){
				j = i+i;
				while(j<=maxNumber) {
					primeNumbers.set(j-1,0);
					j += i;
				}
			}
		}
		System.out.println(primeNumbers);
		return primeNumbers;
	}
}
