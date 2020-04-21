/**
 * 
 */
package string_3;

/**
 * Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 *
 */
public class maxBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(maxBlock("hoopla"));
		System.out.println(maxBlock("abbCCCddBBBxx") );
		System.out.println(maxBlock(""));
		

	}
	
	public static int maxBlock(String str) {
		
		if (str.isEmpty()) return 0;
		
		int length = 1;
		
		int temp = 1;
		
		char[] arr = str.toCharArray();
		
		for (int i = 1; i < arr.length; i++) {
			
		//	System.out.println("Arra i-1 & i " + arr[i-1] + " "  + arr[i]);
			if (arr[i-1] == arr[i]) {
		//		System.out.println("Temp is " + temp);
				temp++; 
				if (temp>length) {
					length = temp;
				}
					
					
			} else {
				
				
					temp = 1;
			}
			
				
				
			}
			
			
		
		return length;
		
		
	}

}
