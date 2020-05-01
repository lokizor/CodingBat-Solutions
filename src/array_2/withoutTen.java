package array_2;

public class withoutTen {
	/*
	 * Return a version of the given array where all the 10's have been removed. 
	 * The remaining elements should shift left towards the start of the array as neede
	 * d, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} 
	 * yields {1, 2, 0, 0}. You may modify and return the given array or make a new 
	 * array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
	 */
	
	public static void main(String[] args) {
		
		
	}
	
	
	public static int[] withoutTen(int[] nums) {
		//[1, 10, 10, 2] - 1 2 00 
		
		int amountOfTens = 0;
		for (int i : nums) {
			if (i==10) amountOfTens++; //2
		}
		int amountOfNonTens = nums.length - amountOfTens; //2 
		
		
		int[] nonTenIndexes = new int[amountOfNonTens];
		
		int y = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 10) {
				nonTenIndexes[y] = i;
				y++;
			}
		}
		
		int[] arr = new int[nums.length];
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if (i < nonTenIndexes.length) {
			int index = nonTenIndexes[i];
			arr[i] = nums[index];
			}
			
			
		}
		return arr; 
		
		
		
		
		  
	}

	
	
	

}
