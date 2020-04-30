package array_2;
/*
 * Given a non-empty array of ints, return a new array
 *  containing the elements from the original array that come after
 *   the last 4 in the original array.
 *    The original array will contain at least one 4.   //AT LEAST 1 4; 
 *    Note that it is valid in java to create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */

public class post4 {
	
	public static int[] post4(int[] nums) {
		
		int stopIndex = -1; 
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 4) {
				stopIndex = i;
			}
			
		}
		if (stopIndex == -1) return new int[0];
		
		int startIndex = stopIndex + 1;
		int length = nums.length - startIndex;
		if (length <= 0) return new int[0];
		
		
		int[] arr = new int[length];
		
		for (int i = 0; i < length; i++) {
			arr[i] = nums[startIndex++];
		}
	
		
		return arr;
		
		  
	}

	
	
}
