package examples.working_with_strings;

public class StringBuilderVsStringBuffer {
	public static void main(String[] args) {
		// Same example from StringBasics (concat) using StirngBuilder
		StringBuilder someWordToConcat = new StringBuilder("Java");
		someWordToConcat = someWordToConcat.append("8 The Best!");
		someWordToConcat.append("8 The Worst!");
		System.out.println(someWordToConcat);
		
		// Simple Benchmark Test - StringBuffer vs StringBuilder
		compareStringBufferToStirngBuilder();
	}

	private static void compareStringBufferToStirngBuilder() {
		int n = 77777777;
        long t;
        
        StringBuffer sbuff = new StringBuffer();
        t = System.currentTimeMillis();
        for (int i = n; i --> 0 ;) {
        	sbuff.append("");
        }
        System.out.println("StringBuffer:");
        System.out.println(System.currentTimeMillis() - t);
        
        StringBuilder sb = new StringBuilder();
        t = System.currentTimeMillis();
        for (int i = n; i > 0 ; i--) {
            sb.append("");
        }
        System.out.println("StringBuilder:");
        System.out.println(System.currentTimeMillis() - t);
    
	}
}
