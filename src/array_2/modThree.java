package array_2;
/*
 * Given an array of ints, return true
 *  if the array contains either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
 */
public class modThree {
	
	public static void main(String[] args) {
		
		int[] a = {2,1,3,5};
		int[] b = {2,1,2,5};
		int[] c = {2,4,2,5};
		System.out.println(modThree(a));
		System.out.println(modThree(b));
		System.out.println(modThree(c));
	}
	
	
	
	
	
	
	
	public static boolean modThree(int[] nums) {
		
		  if (nums.length < 3) {
				return false; 
			}
			
			boolean contains3od = false;
			boolean contains3ev = false;
			
			for (int i = 0; i <= nums.length -3; i++) {
				//2 1 3 4 
				int a = nums[i];
				int b = nums[i+1];
				int c = nums[i+2];
				
				if (a % 2 == 0 && a%2 == b%2 && a%2 == c%2) contains3ev = true;
				if (a%2 != 0 && a%2 == b%2 && a%2 == c%2) contains3od = true;
							
			}
			//2135
			//2125
			//2425

			System.out.println("Before both check");
			if (contains3od && contains3ev) return false;
			
			System.out.println("Before noly od  check");
			System.out.println("Contains 3 ev " + contains3ev);
			System.out.println("Contains 3 od " + contains3od);
		

		
			if (contains3od && !(contains3ev)) {
				return true;
			}

			System.out.println("Before only ev  check");
			if (!(contains3od) && contains3ev) {
				return true;
			}
			

			System.out.println("Before last false ret ");
			
			return false;
	}
}
		