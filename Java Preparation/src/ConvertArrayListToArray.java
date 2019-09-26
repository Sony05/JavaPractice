//Convert ArrayList to STring Array

import java.util.*;
public class ConvertArrayListToArray {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("banana");
		al.add("mango");
		al.add("orange");
		al.add("pineapple");
		
		String fruits[] = al.toArray(new String[al.size()]);
		
		for(String k: fruits)
		{
			System.out.println(k);
		}
			
		

	}

}
