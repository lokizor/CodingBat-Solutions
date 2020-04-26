package array_2;

public class no14 {

	public static void main(String[] args) {
		
		System.out.println(no14(new int[] {1,2,3,4}));
	}
	
	
	
	
	
	public static boolean no14(int[] nums) {
		
		if (nums.length == 0) return true;
		
		if (nums.length ==1) return true;
			
			
				
		boolean noFours = true;
		boolean noOnes = true;
		
		for (int i: nums) {
			if (i ==4) noFours = false;
			if (i == 1) noOnes = false; 
			
		}
		
		if (noFours && !(noOnes)) {
			return true;
		} else if (noOnes && !(noFours)) return true;
		
		
		
		
		return false; 
	}
	
	
	
	
}


