import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {

		Fraction n = new Fraction(8,3);
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print ("Enter the numerator:  ");
		n.setNumerator(scan.nextInt());		
		System.out.print ("Enter the denominator:  ");
		n.setDenominator(scan.nextInt());	
		
		System.out.println ("The fraction " + n.getNumerator() + "/" +
				n.getDenominator() + " is equal to " + n.toMixedNumber());
		
		scan.close();

	}
}