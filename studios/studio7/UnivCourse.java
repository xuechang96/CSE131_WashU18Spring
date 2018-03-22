package studio7;

public class UnivCourse {

	//has a 
	//number int
	//department string
	//certain number of students currently enrolled int
	
	
	public int number;
	public String department;
	public int stdnumber;
	
	public UnivCourse(int number, String department, int stdnumber) {
		this.number = number;
		this.department = department;
		this.stdnumber = stdnumber;
	}

	public String getDepartment() {
		return this.department;
	}

	public int getNumber() {
		return this.number;
	}

	public void afterStdnumber(int add, int drop) {
		this.stdnumber= this.stdnumber+add-drop;
	}

	public int getStdnumber() {
		return this.stdnumber;
	}
	
	

	

}
