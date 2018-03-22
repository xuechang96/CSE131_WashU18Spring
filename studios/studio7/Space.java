package studio7;

public class Space {

		//has a 
		//number of seats int
		//whether there are enough seats for students boolean
				
		public int seats;
		public boolean enough;
		public Space(int seats) {			
			this.seats = seats;		
		}		
		public int getSeats() {
			return  this.seats;
		}


		public boolean enough(UnivCourse course){
			if(seats>course.getStdnumber()) {
				return true;
			}
			else {
				return false;
			}
		}
	
	}

