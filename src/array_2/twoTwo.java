package array_2;
/*
 * Given an array of ints, return true if every 2 that appears in the array is 
 * next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
 */

public class twoTwo {



public boolean twoTwo(int[] nums) {
	
	//4223
	//224
	//2242
	//2 2 3 2 4  
	//2 2 
	
	// 2 2 3  
	// 2 2 1 2 2 
	
	
	  if (nums.length == 1 && nums[0] ==2) return false;
	if (nums.length == 2) {
		if (nums[0] != nums[1]) return false;
	}
	
	
	
	for (int i = 1; i < nums.length; i++) {
		
		if (nums[i] ==2) {
			
			if (i-1 >=0) {
				if (nums[i-1] !=2) {
					
					if (i+1 < nums.length) {
						if (nums[i+1] != 2) {
							return false; 
						}
					} else {
						return false;
					}
					
				}
			}
			
			
		}
	}
	
	
	return true;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
