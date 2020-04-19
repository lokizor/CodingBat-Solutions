package string_3;
/*
 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. 
 * Return true if all the g's in the given string are happy.

	gHappy("xxggxx") → true
	gHappy("xxgxx") → false
	gHappy("xxggyygxx") → false
 */
public class gHappy {
	
	public static void main(String[] args) {
		
		System.out.println(gHappy("xxggxx"));
		System.out.println(gHappy("xxgxx"));
		System.out.println(gHappy("xxggyygxx"));
		
		
	}
	
	
	public static boolean gHappy(String str) {
		
		if (str.length() == 1 && str.equals("g")) {
			return false;
		}
		
		char[] arr = str.toCharArray();
		
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] == 'g') {

				if (i+1 == arr.length) {
					if (!(arr[i-1] =='g')) {
						return false;
					}
				} else {
									}
				
				
				if (arr[i-1] != 'g' && arr[i+1] != 'g') {
					return false; 
				}
				
			}
			
			
			
		}
		
		return true;
	}

}
