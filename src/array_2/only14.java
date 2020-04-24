package array_2;

public class only14 {
	
	
	
	
	public static void main(String[] args) {
		
	}
	
	public static boolean only14(int[] nums) {
		
		for (int i : nums) {
			
			if (i != 4) {
				if (i  !=  1) {
					return false;
				}
			}
			
			if (i!=1 &&  i !=4) {
				return false;
			}
			
			
		}
		
		return true; 
		
		
		
		
	}

}
