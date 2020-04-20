package string_3;
/*
 * Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. 
 * For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */

public class sameEnds {
	
	public static void main(String[] args) {
		
		System.out.println(sameEnds("abXYab"));
		System.out.println(sameEnds("xx"));
		System.out.println(sameEnds("xxx"));
		
	}
	
	public static String sameEnds(String string) {
	
		char[] arr = string.toCharArray(); 
	
		for (int i = 0; i < arr.length / 2; i++) {
			
			
			int middleIndex = (arr.length / 2) - i;
			String start = string.substring(0, middleIndex);
			
			// x -> arr.length;
			
			int middleIndexForEnd = (arr.length/2) + i;
			
			if (arr.length % 2 != 0) {
				middleIndexForEnd = (arr.length/2) + 1 + i;
			}
			
			String end = string.substring(middleIndexForEnd, arr.length);
			
			if (start.equals(end)) {
				return start;
			}
			
		}
		
		
		return "";
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
	
		
		
		
		
		
		/*
		
	   for (int i = 0; i < arr.length; i++) {
		   
		   //abcabc xyyx 
		   if (arr.length % 2 ==0) {
			   
			  // 1 part 
			  int startIndex = i; 
			  int middleIndex = i + string.length() / 2;
			  
			  
			  String start = string.substring(startIndex, middleIndex);
			  
			  
			  int endStartIndex = startIndex + middleIndex;
			  int endMiddleIndex = endStartIndex + string.length() / 2;
			  //2 part 
			  String end = string.substring(endStartIndex, endMiddleIndex);
			  
			  
			   
			   
		   }
			*/
	
