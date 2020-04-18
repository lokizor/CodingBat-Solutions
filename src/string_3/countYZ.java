package string_3;

public class countYZ {
	
	
	
	public static void main(String[] args) {
		
		System.out.println(countYZ("fez day"));
		System.out.println(countYZ("day fez"));
		System.out.println(countYZ("day fyyyz"));
		System.out.println(countYZ("a"));
		System.out.println(countYZ("a   y"));
		System.out.println(countYZ("z"));
		System.out.println(countYZ("!!day--yaz!!"));
		System.out.println(countYZ("DAY abc XYZ"));
		
		
	}
	
	
	public static int countYZ(String str) {
		
		int endings = 0;
		
		
		char[] charArr = str.toCharArray();
	
		for (int i = 0; i < charArr.length; i++) {
			
			if (!(Character.isLetter(charArr[i]) ) ) {
				
			
				
				if (i-1 >= 0) {
					char c = Character.toLowerCase(charArr[i-1]);
					
					if ((c == 'y' || c == 'z')) {
						endings++;
					}
				}
					
					
			} else if (i+1 == charArr.length) {
				
				
				if (i-1>=0) {
				char c = Character.toLowerCase(charArr[i]);
				if (c == 'y' || c == 'z') {
					endings++;
				}
				}
				
			}
			
			
			
		}
		return endings; 
		
	}
	
}
