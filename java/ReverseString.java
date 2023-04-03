package codingtask;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Codoid";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
			
		}
		System.out.println(rev);
	    

	}

}

output: diodoC
