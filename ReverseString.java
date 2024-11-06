package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> string=new ArrayList();
		string.add("Apple");
		string.add("Banana");
		string.add("Grapes");
		string.add("Mango");
		
		System.out.println("Original list : "+string);
		
		Collections.reverse(string);
		
		System.out.println("Reverse list : "+string);
	}

}
//.Write a program to reverse a given List of strings.