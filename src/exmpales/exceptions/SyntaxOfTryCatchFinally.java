package exmpales.exceptions;

public class SyntaxOfTryCatchFinally {
	
	public static void main(String[] args) {
		try {  
			// Kod który potencjalnie może wyrzucić wyjątek
		} catch (Exception e) {  
			// Kod, który zostanie wykonany, jeśli wystąpi wyjątek
		} finally {  
			// Ten blok wykona się zawsze,   
			// niezależnie od tego czy wystąpi wyjątek czy nie
		}
	}
	
}
