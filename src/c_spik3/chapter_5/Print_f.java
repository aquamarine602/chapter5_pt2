package c_spik3.chapter_5;

import static java.lang.System.out;

public class Print_f {

	public static void main(String[] args) {
		double amount = 12618.98;
		double interest_rate = 0.0013;
		double interest = amount * interest_rate;
		out.printf(("Interest is $%.2f\n"), interest);
		
		int count = 5;
		double amount2 = 45.56;
		out.printf("Count: %d\nAmount: %.2f\n", count, amount2);
		
		/**
		 * %d for ints
		 * %f for floats (and doubles)
		 * %s for strings
		 */
		
		String word = "Hello World";
		out.printf("%100s\n", word);
		
		// always goes in order
		out.printf("%3d\n#%2s#\n%4.2f\n", 1234, "Java", 51.6653);
		
		// spaces out args
		out.printf("%8d%8s%8.1f\n", 1234, "Java", 51.6653);
		out.printf("%-8d%-8s%-8.1f", 1234, "Java", 51.6653);
	}

}
