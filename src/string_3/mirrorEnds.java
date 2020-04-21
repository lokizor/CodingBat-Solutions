package string_3;
/*
 * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */


public class mirrorEnds {
	
	public static void main(String[] args) {
		System.out.println(mirrorEnds("abXYZba"));
		System.out.println(mirrorEnds("abca"));
		System.out.println(mirrorEnds("aba"));
	}
	
	
	public static String mirrorEnds(String string) {
		
		char[] stringArr = string.toCharArray();
		String revString = "";
		for (int i = stringArr.length-1; i>=0; i--) {
			revString+=""+stringArr[i];
		}
	
		if (revString.equals(string)) {
			return string;
		}
		
		
		
		
		for (int i = 0; i < string.length() /2; i++) {
			
			int middleIndex = string.length()/2 -i;
			String start = string.substring(0, middleIndex);
			
			
			int endMiddleIndex = string.length()/2 + i; 
			if (string.length()%2 != 0) {
				endMiddleIndex = string.length()/2 + i + 1;
			}
			
			
			String end = string.substring(endMiddleIndex, string.length());
			
			
			String reversedEnd = "";
			char[] arr = end.toCharArray();
			
			for (int j = arr.length-1; j>=0; j--) {
				reversedEnd += ""+arr[j];
			}
			
			if (reversedEnd.equals(start)) {
				return start;
			}
			
			
			
		}
		return "";
		
		
		
		
		
		
		
		
	}

}
