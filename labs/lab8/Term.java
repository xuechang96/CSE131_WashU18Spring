package lab8;

/**
 * Represent an as-yet unevaluated term of a polynomial.
 * A term has-a
 *      coefficient, which is a double
 *      degree, which is an int
 *      
 * Examples:
 * Given the term  3.27 x squared
 *   its coefficient is 3.27
 *   its degree      is 2
 *   
 * Given the term 131
 *    its coefficient is 131.0
 *    its degree      is 0
 * 
 * @author yournamehere
 *
 */

public class Term {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(coeff);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + degree;
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
		Term other = (Term) obj;
		if (Double.doubleToLongBits(coeff) != Double.doubleToLongBits(other.coeff))
			return false;
		if (degree != other.degree)
			return false;
		return true;
	}
	final private double coeff;
	final private int degree;
	public Term(double coeff,int degree) {
		this.coeff=coeff;
		this.degree=degree;
		
	}
	
	public double evaluateTermAtX(double d) {
		return this.coeff*Math.pow(d, this.degree);
	}
	public double getCoefficient() {
		return this.coeff;
	}
	@Override
	public String toString() {
		return coeff + "x^"+ degree;
	}
	public int getDegree() {
		return degree;
	}
	
	
	
}