package string_3;

public class withoutString {

		
	public static void main(String[] args) {
		
		System.out.println(withoutString("Hello there", "llo") );
		System.out.println(withoutString("Hello there", "e"));
		System.out.println(withoutString("Hello there", "x") );
		System.out.println(withoutString("xxx", "xx"));
		
	}
	
	
	public static String withoutString(String base, String remove) {
	//	TODO: withoutString("This is a FISH", "IS") → "Th a FH"	"This is a FH"
	//TODO: overpalling instances 
		
		
	 String newString = "";
	 char[] arr = base.toCharArray(); 
	
	 
	 for (int i =0; i < arr.length; i++) {
		 
		 //thiS is FH ; // word given: IS ;  
		 
		 
		 
		 if (i+remove.length() <= base.length()) {
		 String possibleCandidate = (base.substring(i, i+remove.length())).toLowerCase();
		 
		 if (possibleCandidate.equals(remove.toLowerCase())) {
			 i+=remove.length() -1;
			 continue;
		 }
		 }
		 
		 newString += "" + arr[i];
	
	 }

	  return newString;
	}

}
