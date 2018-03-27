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
		if(add) {
		this.roster[this.roster.length-this.seats]=s.getName();
		this.sumGPA=this.sumGPA+s.getGPA();
		this.numb=this.numb+1;
		this.seats=this.seats-1;
		}
		return add;
	}
	
	public double averageGPA() {
		return this.sumGPA/this.numb;
	}
	
		
	public String toString() {
		return this.Name+this.credits;
	}
	
}
