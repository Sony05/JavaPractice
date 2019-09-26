//Traversing an ArrayList

import java.util.*;

public class TraverseArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer>  al = new ArrayList<Integer> ();
		al.add(1);
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(7);
		
		System.out.println("Traversing the elements of ArrayList");
		
		for(int num : al)
		{
			System.out.println(num);
		}

	}

}
