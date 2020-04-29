package array_2;
/*
 * Given an array of ints, return true if the value 3 appears in
 *  the array exactly 3 times, and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 */

public class haveThree {



public static boolean haveThree(int[] nums) {
	
	
	int count = 0;
	
	for (int i = 0; i < nums.length; i++) {
		
		if (nums[i] == 3) count++;
		if (count>3) return false;
		
		if (i+1 < nums.length) {
			if (nums[i] == nums[i+1] && nums[i]==3) return false;
		}
		
		
		
	}
	if (count != 3) return false;
	return true;
	
	
	
	 
	
	
}
}