package exercises3;

public class CopyArrayAndPigLatin {

	public static void main(String[] args) {
		String[] names = { "latin","atinlay","banana", "ananabay","trash","ashtray","happy" , "appyhay","duck", "uckday","dopest","opestday","me", "emay","too" , "ootay","will" , "illway","moist" , "oistmay","wet","etway","real" , "ealray","simple" , "implesay","say" , "aysay","words" , "ordsway","cheers" , "eerschay","shesh" , "eshshay","smile" , "ilesmay","string" , "ingstray","thanks" , "anksthay","stupid" , "upidstay","glove" ,"oveglay","thanks" , "anksthay" };
		
		// first copy the above array into an array named copy
		//  Pretend the names array is large
		//  So we cannot just do the following (too much to type):
		//     String[] copy = { names[0], names[1], names[2] };
		//
		String[] copy= new String[names.length];
		for(int i=0;i<names.length;++i) {
			copy[i]=names[i]+" ";
			System.out.println("Original name is "+copy[i]);
		}
	
		// 
		// Follow the instructions on the web page to check
		// that your copy is correct.  Then cause the copy to store the
		// copied strings in "Pig Latin".  Do this by iteration without
		// assuming the length or contents of the names array.
		//
		
	}

}
