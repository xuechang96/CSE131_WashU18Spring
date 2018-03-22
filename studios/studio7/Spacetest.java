package studio7;

public class Spacetest {

	public static void main(String[] args) {
		Space seats1=new Space(400);
		UnivCourse course1=new UnivCourse(131,"CSE",500);
		boolean isenough=seats1.enough(course1);
		System.out.println("Is the room enough? "+isenough);
	}

}
