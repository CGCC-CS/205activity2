// Fraction class
// For use in Activity 2 - Exceptions
public class Fraction {	
	
	private int numerator;
	private int denominator;

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	Fraction() {
		numerator = 0;
		denominator= 0;
	}

	Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator= denominator;
	}
	
	public String toMixedNumber ()
	{
		String ret = "";
		int remainder = numerator %  denominator;
		
		ret += numerator /  denominator;
		ret += " ";
		if (remainder != 0) {
			ret += numerator %  denominator;
			ret += "/";
			ret += denominator;
		}
		
		return ret;
	}
	
	public String toString() {
		String ret = Integer.toString(numerator) + "/" + denominator;
		return ret;
	}
}


