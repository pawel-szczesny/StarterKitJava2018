package exercise2_code_debugging;

import java.util.Random;

public class Exercise2_1 {

	public static void main(String[] args) {
		Random rand = new Random(); 
		for (int i=0;i<10;i++) {
			System.out.println(i);
			int n = rand.nextInt(1000);
			System.out.println(i+n);
		}
	}

}
