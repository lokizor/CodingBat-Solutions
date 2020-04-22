package string_3;

/**
 * 
 * Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". 
 * The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. 
 * (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
 *
 */


public class notReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(notReplace("is test"));
		System.out.println(notReplace("is-is"));
		System.out.println(notReplace("This is right") );

	}
	
	public static String notReplace(String str) {
		
		String newStr = "";
		
		char[] arr = str.toCharArray();
		
	
		for (int i = 0; i < arr.length; i++) {
			
			char c = arr[i];
			
			boolean addNotIs = true; 
	
			
			if (c == 'i' && arr[i+1] == 's') {
				
			
				if (i-1 >=0) {
					if (Character.isLetter(arr[i-1])){
						addNotIs = false;
						
					}
 				}
				
				if (i+2 < arr.length) {
					if (Character.isLetter(arr[i+2])) {
						addNotIs = false;
					}
				}	
			
			
				if (addNotIs) {
					newStr+="is not";
					i++;
				} else {
					newStr += "" +c;
				}
				
			
			
			} else {
				newStr+=""+c;
			}
				
			}
		
		return newStr;
		
	}
	
	
	
	
	
	

}
