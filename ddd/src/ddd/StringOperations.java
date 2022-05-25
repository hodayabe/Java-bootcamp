package ddd;

public class StringOperations {
	public String truncateAFirst2(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "")//Compilation error- ";" is missing

		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);

		return first2Chars.replaceAll("A", "") 
				+ stringMinusFirst2Chars;
	}

	public boolean areFirstAndLastTwoCharEquals(String str) {

		//Compilation error-Should appear: Length() missing "g"
		if (str.lenth() <= 1)
			return false;
		
		
		//1. "str.length()" is not a variable therefore we can not put a value 
		
		//2.And even if we could put a value there, then within the condition there is a placement and not a comparison 
		//and the condition will always exist and therefore he will not be consumed since he will always go in and do the writing
		
		//for the condition to work we will have to put: "=="
		
		if (str.length() = 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}
	
	public String customReverse(String str)
	{
		if(str.length() <=1)
		{
			return str;
		}
		char[] before = str.toCharArray();
		char[] after = new char[before.length];
		
		int counter = 0;
		for(int i=before.length-1; i >=0; i++)
		{
			
			after[counter] = before[i];
			counter++;
		}
		
		return new String(after)// Compilation error- ";" is missing
	}
	
	public int stringLength(String str) {
		
		int result=0;
		
		for(int i=0; i <= str.length()-1; i++)
		{
			result = i+1;
		}
		return str;//the function should return int and not String
	}
	
	public String concat(String a, String b) {
		return a-b;//There is no subtraction operator between strings so the returned value is invalid
	}
	
	
	//A letter that is written within a function and has no meaning  
	//therefore a compilation error is obtained because the compiler does not recognize such an action
	
	public String stringToUpper(String str) {a
		return str.toUpperCase();
	}


}
