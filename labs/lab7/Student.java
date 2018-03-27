package lab7;

public class Student {

	//has a name(first and last)  String
	//student id int
	//credits double
	//GPA double 
	
	public String FirstName;
	public String LastName;
	public int StudentID;
	public int Credits;
	public double GPA;
	
	public Student(String FirstName, String LastName, int StudentID) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.StudentID = StudentID;	
		this.Credits=0;
		this.GPA=0.0;
	}

	public int getCredits() {
		return this.Credits;
	}

	public double getGPA() {
		return this.GPA;
	}

	public String toString() {
		return this.FirstName+this.LastName+this.StudentID;
	}
	
	public String getName() {
		return this.FirstName+" "+this.LastName ;
	}
	
	public int getStudentID() {
		return this.StudentID;
	}

	public void submitGrade(double grade, int credits) {		
		this.GPA=(this.GPA*this.Credits+grade*credits)/(this.Credits+credits);
		this.Credits=this.Credits+credits;
		this.GPA=Math.round(this.GPA*1000)/1000.0;
	}

	public String getClassStanding() {
		if (this.Credits<30) {
			return "FirstYear";
		}
		else if(this.Credits>=30&&this.Credits<60) {
			return "Sophomore";
		}
		else if(this.Credits>=60&&this.Credits<90) {
			return "Junior";
		}
		else {
			return "Senior";
		}
	}
	
	public Student createLegacy(Student otherParent) {
		Student child=new Student(this.getName(),otherParent.getName(),this.StudentID+otherParent.StudentID);
		child.GPA=(this.GPA+otherParent.GPA)/2;
		child.Credits=Math.max(this.Credits, otherParent.Credits);
		return child;
	}
}
