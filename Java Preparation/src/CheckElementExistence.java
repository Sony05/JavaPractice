//check if an element exists in Array List

import java.util.*;
public class CheckElementExistence {

	public static void main(String[] args) {
		
ArrayList<Integer> al = new ArrayList<Integer>();

al.add(2);
al.add(10);
al.add(8);
al.add(5);
al.add(4);
	

	
		if(al.contains(7))
				System.out.println("7 is present in the list");
		
		else
			System.out.println("7 is not present in the list");
			
	
	}

}
