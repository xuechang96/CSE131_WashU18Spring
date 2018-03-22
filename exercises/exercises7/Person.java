package exercises7;

/**
 * 
 * Identify the parts of this object:
 *      Constructor
 *      Instance variables
 *      Methods
 *         Accessors: return value of instance variables
 *         Mutators: change by fia  the value of instance variables
 *         Other
 *
 */
public class Person {
	
	/**
	 * instance variables
	 */
	private int height, age;//instance variables
	/**
	 * constructor
	 * @param height
	 */
	public Person(int height) {
		this.height = height;
		this.age    = 0;
	}
	/**
	 * mutator
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * other--ages by one year
	 */
	public void happyBirthday() {
		this.age = this.age + 1;
	}
	
	/**
	 * Accessors
	 * @return
	 */
	public int getHeight() {//method
		return this.height;
	}
	/**
	 * Accessors
	 * @return
	 */
	public int getAge() {//method
		return this.age;
	}
	

}
