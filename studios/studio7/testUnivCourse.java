package studio7;

public class testUnivCourse {

	public static void main(String[] args) {

		UnivCourse course1=new UnivCourse(131,"CSE",500);
		UnivCourse course2=new UnivCourse(200,"ESE",100);
		
		System.out.println("Course 1 initially has "+course1.getStdnumber()+" students.");
		System.out.println("Course 2 initially has "+course2.getStdnumber()+" students.");
		
		course1.afterStdnumber(60, 50);
		course2.afterStdnumber(15, 25);
		
		System.out.println("Course 1 later has "+course1.getStdnumber()+" students.");
		System.out.println("Course 2 later has "+course2.getStdnumber()+" students.");

		
	}

}
