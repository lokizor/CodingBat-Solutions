package array_2;

/**
 * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
 *  Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
 * 
 *
 */

public class bigDiff {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = bigDiffa({1,2}); //what are those errors? The solution is correct;
		
		System.out.println();
		System.out.println();
		

	}
	
	public static int bigDiffa(int[] nums) {
		
		int smallestValue = nums[0];
		int biggestValue = nums[0];
		
		for (int i: nums) {
			
			if (i > biggestValue) {
				biggestValue =i;
			}
			
			if (i < smallestValue) {
				smallestValue = i;
			}
		}
		
		return Math.abs(smallestValue-biggestValue);
		
	}
	
	

}
