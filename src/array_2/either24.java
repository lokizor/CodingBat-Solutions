package array_2;

/*
 * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
 */

public class either24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(either24(new int[] {1,2,2}));
		System.out.println(either24(new int[] {4,4,1}));
		System.out.println(either24(new int[] {4,4,1,2,2}));

	}
	
	public static boolean either24(int[] nums) {
		
		if (nums.length <2) return false;
		
		boolean contains2 = false;
		boolean contains4 = false;
		
		for (int i = 0; i <nums.length-1; i++) {
			
			
			if (nums[i] == 2 && nums[i+1] ==2) contains2 = true;
			if (nums[i] == 4 && nums[i+1] ==4) contains4 = true;
			
			if (contains2 && contains4) return false;
			
		}
		
		return contains2 || contains4;
	 
	}
	
	

}
