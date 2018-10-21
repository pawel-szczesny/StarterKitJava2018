package examples.debugging;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class EasyLoop {
	public static void main(String[] args) {
		Random rand = new Random(); 
		ArrayList<Integer> someList = new ArrayList<>();
		HashMap<Integer, Integer> someHashMap = new HashMap<>();
		
		for (int i=0;i<10;i++) {
			int n = rand.nextInt(1000);
			someList.add(n);
			someHashMap.put(i, n);
		}
		System.out.println(someHashMap);
		System.out.println(someList);
	}
}
