package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
	 
	public static void main(String args[])
	{
		String s = "Your application has been accepted and your registration number is 093467 and your hall ticket number is BNG32016";
		System.out.println("IsAlphaNumeric: " + isAlphaNumeric(s));
	}
	
	public static boolean isAlphaNumeric(String str) {
		char[] charArray = str.toCharArray();
	    for(char c:charArray)
	    {
	    		boolean hasNonAlpha = str.matches("^.*[^a-zA-Z0-9 ].*$");
	    		return hasNonAlpha;
	    }
	    return true;	
	    }
}
