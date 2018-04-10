package lab8;

import java.util.HashSet;
import java.util.Set;

import sedgewick.StdDraw;

/**
 * An immutable Polynomial class.  This means that once
 *   the constructor has finished, nothing about this
 *   Polynomial can change.  We check for this in
 *   our testing of your implementation.
 *   
 * Also this implementation is sparse, in the sense
 * that terms with 0 coefficients, supplied or implied,
 * can and should not be represented here.
 * 
 * For example, 5 + x^100 is a Polynomial with a 0-degree
 * term (5) and a 100-degree term (1).   The 99 terms in between are
 * not mentioned here and are implied to have a coefficient of 0.
 * Moreover, x^202 power would also have a coefficient of 0 for this
 * Polynomial.   By using a sparse representation, we retain only
 * the 0-degree and 100-degree terms in this case.
 * 
 * @author Neil Xu
 *
 */
public class SparsePolynomial implements Polynomial {

	//
	// TODO Declare instance variable(s)
	//
	private final Set<Term> field;

	@Override
	public String toString() {
		return "SparsePolynomial [field=" + field + "]";
	}

	/**
	 * Primary constructor
	 * @param array  collection of Terms for this Polynomial.  
	 * Some coefficients may be 0.0, but those Terms should not
	 * be retained in the Set.
	 */
	public SparsePolynomial(Term[] array) {
		// TODO complete this constructor
		this.field = new HashSet<Term>();
		// Create a term array with all degrees types (0-100);
		//Term[] arrayNew = new Term[101];
		// For each degree j, add all coefficients with degree j in array Term
		int max=0;
		for(int i=0;i<array.length;++i) {
			if(max<array[i].getDegree()) {
				max=array[i].getDegree();
			}
		}
		for(int j=0;j<=max;++j) {
			double d=0;
			for(int i=0;i<array.length;++i) {
				if(array[i].getDegree()==j) {
					d=d+array[i].getCoefficient();
				}
			}
			if(d!=0) {
				this.field.add(new Term(d,j));
			}
		}
		
		//Add term whose coefficient is not 0 in our new term array
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((field == null) ? 0 : field.hashCode());
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
		SparsePolynomial other = (SparsePolynomial) obj;
		if (field == null) {
			if (other.field != null)
				return false;
		} else if (!field.equals(other.field))
			return false;
		return true;
	}

	/**
	 * This is completed already for you.  Do not change this constructor.
	 * Convenience constructor to create an empty Polynomial.
	 * Calls the primary constructor passing an empty array of Terms.
	 */
	public SparsePolynomial() {
		this(new Term[0]);
	}


	/**
	 * This is provided for you.   
	 * Really, no need to thank me.
	 */
	@Override
	public void plot(double lowx, double highx, double incx) {
		//
		// Determine min and max for y values
		//
		double maxy = this.evaluate(lowx);
		double miny = this.evaluate(lowx);
		for (double x=lowx; x < highx; x = x + incx) {
			double y = this.evaluate(x);
			maxy = Math.max(maxy, y);
			miny = Math.min(miny, y);
		}
		StdDraw.setXscale(lowx, highx);
		StdDraw.setYscale(miny, maxy);
		for (double x=lowx; x < highx; x = x + incx) {
			double y = this.evaluate(x);
			StdDraw.point(x, y);
		}
	}

	@Override
	public int degree() {
		if(this.field.isEmpty()) {
			return 0;
		} 
		else {
			int b=0;
			for(Term t:this.field) {
				if(b < t.getDegree()) {
					b = t.getDegree();
				}
			}
			return b;
		}

	}

	@Override
	public double getCoefficientAtDegree(int degree) {
		double a=0;
		for(Term t:this.field) {
			if(t.getDegree()==degree) {
				a = t.getCoefficient();
			}
		}
		return a;
	}

	@Override
	public double evaluate(double x) {
		double sum=0;
		for(Term t:this.field) {
			sum = sum+t.evaluateTermAtX(x);
		}
		return sum;
	}

	@Override
	public Term[] toArray() {
		int max=0;
		for(Term t:this.field) {
			if(max<t.getDegree()) {
				max=t.getDegree();
			}
		}
		Term[] term=new Term[max+1];
		for(int i=0;i<term.length;++i) {
			term[i]=new Term(this.getCoefficientAtDegree(i),i);
		}
		return term;
	}

	@Override
	public Polynomial derivative() {
		Term[] term1 = this.toArray();
		Term[] der = new Term[term1.length];
		
		for(int i=0; i<term1.length; ++i) {
			der[i] = new Term(term1[i].getCoefficient()*term1[i].getDegree(), term1[i].getDegree()-1);
		}
		
		Polynomial a = new SparsePolynomial(der);
		return a;
	}

	@Override
	public Polynomial sum(Polynomial other) {
		Term[] term1 = this.toArray();
		Term[] term2 = other.toArray();
		
		Term[] termSum = new Term[term1.length+term2.length];
		for(int i=0;i<term1.length;++i) {
			termSum[i]=term1[i];
		}
		for(int i=term1.length;i<termSum.length;++i) {
			termSum[i]=term2[i-term1.length];
		}
		Polynomial a = new SparsePolynomial(termSum);
		return a;
	}

	@Override
	public Polynomial addTerm(Term t) {
		Term[] term1 = this.toArray();
		Term[] add = new Term[term1.length+1];
		
		for(int i=0; i<term1.length; ++i) {
			add[i] = term1[i];
		}
		add[term1.length]=t;
		
		Polynomial a = new SparsePolynomial(add);
		return a;//Finished all! Yeah!
	}



}
