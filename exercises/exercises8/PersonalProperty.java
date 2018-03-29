package exercises8;

public class PersonalProperty implements Valuable{
	
	private final int initialValue;
	private int yearsOld;
		
	public PersonalProperty(int initialValue) {
		super();
		this.initialValue = initialValue;
	}
	public int depreciateValue() {
		//intial value*0.80 raised to the yearsOld power
		return (int)(this.initialValue*Math.pow(0.80, yearsOld));
	}

	public void yearOlder() {
		this.yearsOld=this.yearsOld+1;
	}
	public String toString() {
		return "Initial value:" +this.initialValue+" current value"+ this.depreciateValue();
	}
	@Override
		public int getLiquidValue() {
			// TODO Auto-generated method stub
			return this.depreciateValue();
		}

	}

