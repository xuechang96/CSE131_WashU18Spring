package studio8;

import java.util.LinkedList;
import java.util.List;

public class Time {
	// has-an hour (0 to 23) and a minute (0 to 59). It also has-a field that indicates
	//whether the (toString() of the) time should be in 12- or 24-hour format.
	private final int hour, minute ;
	private boolean style;
	
	
	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.style = false;
		
	}

	 public boolean amWorking() {
		 if(this.hour>9&&this.hour<17) {
			 return true;
		 }
		 else return false;
	 }
	public void setStyle(boolean style) {
		this.style = style;
	}


	public int getHour() {
		return hour;
	}


	public int getMinute() {
		return minute;
	}


	public boolean isStyle() {
		return style;
	}


	@Override
	public String toString() {
		if(this.style) {//12 true
			if(this.hour>12) { 
				
				return "Time [hour=" + (hour-12)+"pm" + ", minute=" + minute + "]";
			}
			else {
				return "Time [hour=" + hour+"am" + ", minute=" + minute + "]";
			}
			
		}
		else {
			return "Time [hour=" + hour + ", minute=" + minute + "]";
		}
		
	}
	public boolean isEarlierThan(Time other) {
		if (this.hour<other.hour) {
			return true;
		}
		else if(this.hour == other.hour&& this.minute<other.minute) {
			return true;
		}
		else return false;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		Time t0 = new Time(15,1);
		Time t1 = new Time(15,1);
		Time t2 = new Time(15,5);
		t0.style=true;
		System.out.println(t0.toString());
		t0.style=false;
		System.out.println(t0.toString());
	}
}

