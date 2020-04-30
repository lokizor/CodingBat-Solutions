package array_2;
/*
 * 
 * Given a non-empty array of ints,
 *  return a new array containing the elements from the original array that come
 *  before the first 4 in the original array. 
 *  The original array will contain at least one 4. 
 *  Note that it is valid in java to create an array of length 0.

pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
 */

public class pre4 {
	
	public static int[] pre4(int[] nums) {
		
		int stopIndex = 0; 
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] ==4) {
				stopIndex = i;
				break;
			}
		}
		
		if (stopIndex == 0) return new int[0];
		
		int[] arr = new int[stopIndex]; 
		for (int i = 0; i < stopIndex; i++) {
			arr[i] = nums[i];
		}
		return arr; 
		
		  
	}

	

}
