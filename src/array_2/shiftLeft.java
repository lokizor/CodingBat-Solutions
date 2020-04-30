package array_2;


/*
 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
 *  You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
 */
public class shiftLeft {
	
	public static void main(String[] args) {
		
		int[] arr = shiftLeft(new int[] {1,2,3,4,5});
		
		for (int i : arr) {
			System.out.print(i);
		}
	}

	public static int[] shiftLeft(int[] nums) {
		
		//hiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]	[2, 5, 3, 3]	X
		
		
		if (nums.length <2)  return nums;

		int[] copyOrigin = new int[nums.length];
		
		
		
		
		//new Arr is deepcopy
		for (int i = 0; i < nums.length; i++) {
			
			copyOrigin[i] = nums[i];
		}
		
		
		for (int i = 0; i < nums.length; i++) {
			
			//e.g. length = 4;
			
			if (i+1 < nums.length) {
			copyOrigin[i] = nums[i+1];

			} else {
				copyOrigin[i] = nums[0];
			}
		}
		return copyOrigin;
			
		
	}


}
		
	
		

	

	
	
	

