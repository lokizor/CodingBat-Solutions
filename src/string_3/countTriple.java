package string_3;
/*
 * We'll say that a "triple" in a string is a char appearing three times in a row. 
 * Return the number of triples in the given string. The triples may overlap.

countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
 * 
 * 
 * 
 * 
 */


public class countTriple {
	
	public static void main(String[] args) {
		
		System.out.println(countTriple("abcXXXabc"));
		System.out.println(countTriple("xxxabyyyycd"));
		System.out.println(countTriple("a"));
		
	}
	
	public static int countTriple(String str) {
		
		int count = 0; 
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
		
			if (i+3 <= arr.length) {
				String triples = str.substring(i, i+3);
				char[] triplesChar = triples.toCharArray(); 
				if (triplesChar[0] == triplesChar[1] && triplesChar[0] == triplesChar[2]) {
					count++;
				}
				
				
				
			}
			
		}
		return count;
		
	}
	

}
