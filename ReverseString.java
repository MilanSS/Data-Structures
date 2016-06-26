/* Author: Milan Shingote
  Program: Reverse a given String */
import java.io.*;
public class ReverseString {

	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		System.out.println("Enter the String");  
		String str=br.readLine();
		String sss=str;
		System.out.println("Reverse of the string:"+reverseStringBuffer(sss));

	}

	private static String reverseStringBuffer(String s) {
		// TODO Auto-generated method stub
		return new StringBuffer(s).reverse().toString();
	}

}
