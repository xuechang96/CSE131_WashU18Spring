package exercises8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UsingSet {


	public static void main(String[] args) {
		//
		// Your code goes here:
		//    (most of what you want can be 
		//      copied and pasted from 
		//      your solution to UsingList)
		//

		Set<String> eating= new HashSet<String>();
		
		eating.add("open mouth");
		eating.add("insert food");
		System.out.println("First add "+eating.add("chew"));
		System.out.println("Second add "+eating.add("chew"));
		eating.add("chew");
		eating.add("swallow");
		
		System.out.println(eating);
		
		
		eating.remove("digest");
		System.out.println("After deleting"+eating);
		
	}

}
