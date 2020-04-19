package string_3;

public class equalIsNot {
	
	
	public static void main(String[] args) {
		
		System.out.println(equalIsNot("This is not") );
		System.out.println(equalIsNot("This is notnot") );
		System.out.println(equalIsNot("noisxxnotyynotxisi"));
		
		
		
	}
	
	
	public static boolean equalIsNot(String str) {
		
		int amountOfIs = 0;
		int amountOfNot = 0; 
	
		
		char[] arr = str.toCharArray(); 
		for (int i = 0; i < arr.length; i++) {
			
			
			if (i+2 <= str.length()) {
			
				String possibleIs = str.substring(i, i+2);
				if (possibleIs.equals("is")) {
					amountOfIs++;
				}
			}
			
			
			if (i+3 <= str.length()) {
				String possibleNot = str.substring(i, i+3);
				if (possibleNot.equals("not")) {
					amountOfNot++;
				}
				
			}
		  }
		  return amountOfIs == amountOfNot;
		
	}

	
	
}
