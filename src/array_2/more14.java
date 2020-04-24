package array_2;





public class more14 {
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	public static boolean more14(int[] nums) {
		
		int fours = 0;
		int ones = 0;
		
		for (int i : nums) {
			if (i == 4) {
				fours++;
			}
			if (i==1) {
				ones++;
			
			}
		}
		return ones > fours;
	}
	
	
	

}
