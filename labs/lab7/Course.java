package lab7;

public class Course {

	// has a 
	//name of the course String
	//credits  int
	//number of seats  int
	//roster of students  String
	
	private String Name;
	private int credits;
	private int seats;
	private String[] roster;
	private double sumGPA;
	private int numb;
	public Course(String name, int credits, int seats) {
		this.Name = name;
		this.credits = credits;
		this.seats = seats;		
		this.roster=new String[this.seats];
		this.sumGPA=0;
		this.numb=0;
	}
	
	public String getName() {
		return this.Name;
	}

	public int getRemainingSeats() {
		return this.seats;
	}
	/**
	 * Check to make sure that the student has not already enrolled, and update the number of seats remaining. Return true if s has been enrolled as a result of this call. Return false otherwise.
	 * @param s
	 * @return
	 */
	public boolean addStudent(Student s) {
		boolean add=true;
		if(this.seats<=0) {
			add=false;
		}
		else {
			for (int i=0;i<this.roster.length-this.seats;i++) {
				if(this.roster[i]==s.getName()) {
					add=false;
				}
				else {
					add=true;
				}
			}
		}	
		/**
		 * returns a String that represents a roster with all of the Students in the course. The roster should contain the Students' names. Make sure to omit empty seats!

		 */
		if(add) {
		this.roster[this.roster.length-this.seats]=s.getName();
		this.sumGPA=this.sumGPA+s.getGPA();
		this.numb=this.numb+1;
		this.seats=this.seats-1;
		}
		return add;
	}
/**
 * returns the average GPA of all students enrolled in the course. Make sure to omit seats! from this calculation
 * @return
 */
	public double averageGPA() {
		return this.sumGPA/this.numb;
	}
	
		/**
		 * the returned String should contain the course number and credits
		 */
	public String toString() {
		return this.Name+this.credits;
	}
	
}
