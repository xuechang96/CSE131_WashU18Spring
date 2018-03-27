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
/**
 * returns the students full name and student ID
 */
	public String toString() {
		return this.FirstName+this.LastName+this.StudentID;
	}
	
	public String getName() {
		return this.FirstName+" "+this.LastName ;
	}
	
	public int getStudentID() {
		return this.StudentID;
	}

	/**
	 * This method takes in a course grade (as a value between 0 and 4) and the number of credits for a course, and updates the students GPA.
	 * @param grade
	 * @param credits
	 */
	public void submitGrade(double grade, int credits) {		
		this.GPA=(this.GPA*this.Credits+grade*credits)/(this.Credits+credits);
		this.Credits=this.Credits+credits;
		this.GPA=Math.round(this.GPA*1000)/1000.0;
	}
	/**
	 * 
	 * @return  the students class standing based on how many credits they have
	 */
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
	/**
	 * Here is what this method must do:
Use one parent's full name as the baby's first name, the other parent's full name as the baby's last name
Assign the baby a student ID that is the sum of its parents' IDs.
The legacy's initial GPA will be returned as the average of its parents' GPA.
The legacy's initial number of credits will be the maximum of its parents' credits
	 * @param otherParent
	 * @return
	 */
	public Student createLegacy(Student otherParent) {
		Student child=new Student(this.getName(),otherParent.getName(),this.StudentID+otherParent.StudentID);
		child.GPA=(this.GPA+otherParent.GPA)/2;
		child.Credits=Math.max(this.Credits, otherParent.Credits);
		return child;
	}
}
