package string_2;


/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"

*/

public class wordEnds {
	
	public static void main(String[] args) {
		
		System.out.println(wordEnds("abcXY123XYijk", "XY"));
		System.out.println(wordEnds("XY123XY", "XY"));
		System.out.println(wordEnds("XY1XY", "XY"));
		System.out.println(wordEnds("XYXY", "XY") ); //should be XY 
		System.out.println(wordEnds("abc1xyz11", "1") ); //should be cxz11...
		
	
	}
	
	
public static String wordEnds(String str, String word) {
	

	     String s = "";
		  char[] arr = str.toCharArray(); 
		  //XY123XY 13
		  for (int i = 0; i < arr.length; i++) {
		
			  if (i+word.length() <= arr.length ) {
		
			  String temp = str.substring(i, i+word.length());

			  if (temp.equals(word)) {
				  
					  if (i-1 >=0) {
						  s+= "" + arr[i-1];
					  }
				  
			  if (i+word.length() < arr.length) {
				s+= "" + arr[i+word.length()];
		  	}
			
		}
			  
			  }	//end for }   return s;
	}
	return s;
	}


	
	
	
	
//This is a solution for advanced requirements -> it checks that no char will be added to the left or to the right of the word if it is another word to the left/right
//e.g. wordEnds("XYXY", "XY") → "XY" will result in ordEnds("XYXY", "XY") -> "" etc. 

	

public static String wordEndsAdvancedSolution(String str, String word) {
	  
	  String s = "";
	  char[] arr = str.toCharArray(); 
	  //XY123XY 13
	  for (int i = 0; i < arr.length; i++) {
		  
	  //find word 
		  
		  //Make sure no array index out of bound exceptino here.  (i
		  if (i+word.length() <= arr.length ) {
		  
		  
		  
		  
		  //TODO: CHECK indexoutofboundexception 
			  
			  
		  String temp = str.substring(i, i+word.length());
		  
		  //TODO: if temp equals word, add chars to the left of the word, and to the right 
		  //TODO:BUT: make sure to the left and to the right is not a word, but a chararcter; 
		  if (temp.equals(word)) {
			  
			  
			  
			  //TODO:check if to the left is the word; 
			  //TODO: BUT: make sure to check indexoutofboundexception
			  
			  //make sure -1 is ok 
			  //BUT!!!! TODO:  in case IT IS NOT A WORD byw NOT WORD OSIBLE 
			  
			  
			  
			  if (i-word.length() >=0) {
			  
			  String tempLeft = str.substring(i-word.length(), i);
			  
			  if (!(tempLeft.equals(word))){
				  //TODO: CHECK that i-1 no indexoutofbound examptions; 
				  s+= "" + arr[i-1];
				  
			  }
			  // ELSE IF IT IS NOT WORD POSSIBLE TO THE LEFT, STILL CHECK -1 POSISBLE AND ED -1 
			  } else  {
				  
				  if (i-1 >=arr.length) {
					  s+= "" + arr[i-1];
				  }
			  }
			  
			  
			  
			  //TODO:check if to the right is the word; +
			  //TODO: BUT: make sure to check indexoutofboundexception+
			  //if no word to the right and i+word.length possible, add i+word.length+
			  //TODO: what if to the right there is no "word" possible+
			  
			  
			  
			  
			  //IF TO THE RIGHT THE WORD IS POSSIBLE 
			  
	if (i+word.length() +word.length() -1 <arr.length) {
			  
			  
			  
			  String tempRight = str.substring(i+word.length(), i+word.length() + word.length());
			  
			  if (!(tempRight.equals(word))) {
				  
				 //TODO CHECK IF possible i+word.length()
				  if (i+word.length() < arr.length) {
					  s+= "" + arr[i+word.length()];
				  }
				  
				  
			  }
	} else { //if to the right the word is not possible! 
		
		if (i+word.length() < arr.length) {
			s+= "" + arr[i+word.length()];
		}
		
	}
	    
	
	
	
	
	
	
	
	  	}
		  
	}
		//end for 
	  }
	  
	  
	  return s;
}
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//---
}



