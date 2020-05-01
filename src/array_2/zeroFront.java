package array_2;
/*
 * Return an array that contains the exact same numbers as the given array,
 *  but rearranged so that all the zeros are grouped at the start of the array. 
 *  The order of the non-zero numbers does not matter. So {1, 0, 0, 1} 
 *  becomes {0 ,0, 1, 1}. 
 *  You may modify and return the given array or make a new array.

zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
 */



public class zeroFront {
	
	
	

	public static int[] zeroFront(int[] nums) {
		
		int amountOfZeros = 0;
		
		
		
		for (int i : nums) {
			if (i == 0) {
				amountOfZeros++;
			}
		
		}
		int amountOfNonZeros = nums.length - amountOfZeros;
		int[] nonZeroIndexesArr = new int[amountOfNonZeros];
		
		int y = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nonZeroIndexesArr[y] = nums[i];
				y++;
				
			}
		}
		
		y = 0;
		int[] arr = new int[nums.length];
		for (int i = 0; i < arr.length; i++) {
			if (i < amountOfZeros) {
				arr[i] = 0;
			} else {
				arr[i] = nonZeroIndexesArr[y];
				y++;
			}
	
			
			
		}
		return arr;
		
		
		
		
	
}
}
