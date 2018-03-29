package exercises8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsingList {

	public static void main(String[] args) {
		//
		// Your code goes here:
		//

		
		List<String> eating= new LinkedList<String>();
		
		eating.add("open mouth");
		eating.add("insert food");
		eating.add("chew");
		eating.add("chew");
		eating.add("swallow");
		
		System.out.println(eating);
		
		eating.add("digest");
		System.out.println(eating);
		
		eating.add(0, "salivate");
		System.out.println(eating);

		eating.remove("chew");
		System.out.println(eating);
		
		List<String>eating1=new ArrayList<String>();
		
		eating1.add("open mouth");
		eating1.add("insert food");
		eating1.add("chew");
		eating1.add("chew");
		eating1.add("swallow");
		
		System.out.println(eating1);
		
		eating1.add("digest");
		System.out.println(eating1);
		
		eating1.add(0, "salivate");
		System.out.println(eating1);

		eating1.remove("chew");
		System.out.println(eating1);
		
		// the results are the same 

	}

}
