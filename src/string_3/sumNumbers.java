package string_3;

/**
 * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
 * 
 *
 */

public class sumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumNumbers("abc123xyz") );
		System.out.println(sumNumbers("aa11b33"));
		System.out.println(sumNumbers("7 11"));
	}
	
	public static int sumNumbers(String str) {
		
		
		int result = 0;
		
		String[] numbers = new String[str.length()];

		
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = "";
		}
		
		
		
		char[] arr = str.toCharArray();
		
			
			
			
			
			int j = 0;
			for (int i = 0; i < arr.length; i++) {
				char c = arr[i];
				if (Character.isDigit(c)) {
					if (j < numbers.length) {
					numbers[j] += ""+c;
					}
				
				} else {
					j++;
					
				}
			}
		
		
		for (String s : numbers) {
			if (!(s.isEmpty())) {
			result += Integer.parseInt(s);
			}
		}
		
		
		return result;
		
		
	}

}
