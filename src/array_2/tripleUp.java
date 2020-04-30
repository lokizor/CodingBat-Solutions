package array_2;
/*
 * Return true if the array contains, somewhere, 
 * three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
 */

public class tripleUp {
	
	
	public boolean tripleUp(int[] nums) {
		if (nums.length < 3) return false;
		
	
		for (int i = 0; i < nums.length; i++) {
			
			
			
			if (i+2 < nums.length) {
				if (nums[i] == nums[i+1]-1 && nums[i] == nums[i+2] -2)return true;  
				
			}
		}
		return false; 
		
		  
	}

}
