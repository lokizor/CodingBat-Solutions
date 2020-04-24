package array_2;

public class sum67 {
	/**
	Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

	sum67([1, 2, 2]) → 5
	sum67([1, 2, 2, 6, 99, 99, 7]) → 5
	sum67([1, 1, 6, 7, 2]) → 4
	
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum67(new int[] {1, 2, 2}));
		System.out.println(sum67(new int[] {1, 2, 2, 6, 99, 99, 7}));
		System.out.println(sum67(new int[] {1,1,6,7,2}));
		
	}
	
	public static int sum67(int[] nums) {
		
		
		
		int sum = 0;
		
		//every 6  will be follwed by at laest one 7; hm.. 6 6 7
		
		boolean sixFound =false;
	
		for (int i =0; i < nums.length; i++) {
			
			
			
			
			if (nums[i] == 6) {
				sixFound = true;
			}
			
			if (!(sixFound)) {
				sum +=nums[i];
			}
			
			
			if (nums[i] ==7) {
				sixFound = false;
			}
			
			
		}
		return sum;
		
		
		
	}
	
	
	

}
