package array_2;

/*
 * Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
 */


public class sum13 {
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(sum13(new int[]{1, 2, 2, 1}));
		System.out.println(sum13(new int[] {1,1}));
		System.out.println(sum13(new int[] {1, 2, 2,1, 13}));
		
		
	}
	
	public static int sum13(int[] nums) {
		
		//is check || num == null important too? can I say num[i] = null? ofc not; 
		if (nums.length == 0) return 0;
		
		//number 13 does not count; immediately after 13 also does not count; ok; 
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			sum+=nums[i];
			
			if (nums[i]==13) {
				sum-=13;
				if (i+1<nums.length && nums[i+1] != 13) {
					sum-=nums[i+1];
				}			
			}
		}
		return sum;
		
	}
	
	
	
	
	
	
	
	
	
	

}

