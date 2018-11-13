package c_spik3.chapter_5;

import java.util.Scanner;
import static java.lang.System.out;

public class Birthday_guessing {

	@SuppressWarnings({"unused", "resource" })
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// binary numbers
		final int A = 128;
		final int B = 64;
		final int C = 32;
		final int D = 16;
		final int E = 8;
		final int F = 4;
		final int G = 2;
		final int H = 1;
		
		// sets of numbers
		String set1 = "";
		String set2 = "";
		String set3 = "";
		String set4 = "";
		String set5 = "";
		
		// input number
		// int inputnum;
		int inputnum = 0;
		
		// conversion placeholder
		int whats_left;
		
		for(int i = 0; i < 31; i++) {
			String biannum = "";
			// out.println("Enter a number between 0 and 225:");
			// inputnum = input.nextInt();
			inputnum = inputnum + 1;
			
			// initialize what's left
			whats_left = inputnum;
			
			// creating binary number in string format
			if (inputnum >= A) {
				whats_left = whats_left - A;
				biannum = biannum + "1";
			} else {
				biannum = biannum + "0";
			}
			
			if (whats_left >= B) {
				whats_left = whats_left - B;
				biannum = biannum + "1";
			} else {
				biannum = biannum + "0";
			}
			
			if (whats_left >= C) {
				whats_left = whats_left - C;
				biannum = biannum + "1";
			} else {
				biannum = biannum + "0";
			}
			
			if (whats_left >= D) {
				whats_left = whats_left - D;
				biannum = biannum + "1";
			} else {
				biannum = biannum + "0";
			}
			
			
			if (whats_left >= E) {
				whats_left = whats_left - E;
				biannum = biannum + "1";
			} else {
				biannum = biannum + "0";
			}
			
			if (whats_left >= F) {
				whats_left = whats_left - F;
				biannum = biannum + "1";
			} else {
				biannum = biannum + "0";
			}
			
			if (whats_left >= G) {
				whats_left = whats_left - G;
				biannum = biannum + "1";
			} else {
				biannum = biannum + "0";
			}
			
			if (whats_left >= H) {
				whats_left = whats_left - H;
				biannum = biannum + "1";
			} else {
				biannum = biannum + "0";
			}
			
			// display
			out.println("\nThe binary number for " + inputnum + " is " + biannum);
			
			// check indexing of binary number
			char xnum7 = biannum.charAt(7);
			char xnum6 = biannum.charAt(6);
			char xnum5 = biannum.charAt(5);
			char xnum4 = biannum.charAt(4);
			char xnum3 = biannum.charAt(3);
			
			// assign to sets
			if (xnum7 == '1') {
				set1 = set1 + inputnum;
			}
			if (xnum6 == '1') {
				set2 = set2 + inputnum;
			}
			if (xnum5 == '1') {
				set3 = set3 + inputnum;
			}
			if (xnum4 == '1') {
				set4 = set4 + inputnum;
			}
			if (xnum3 == '1') {
				set5 = set5 + inputnum;
			}
			
			// display
			out.println("\nset1 is : " + set1);
			out.println("set2 is : " + set2);
			out.println("set3 is : " + set3);
			out.println("set4 is : " + set4);
			out.println("set5 is : " + set5);
			
		}
		
		
		// finds the binary numbers
		out.println("\n\n\nIs your birthday in set 1 (1 for yes, 0 for no)?");
		String q1 = input.nextLine();
		
		out.println("Is your birthday in set 2 (1 for yes, 0 for no)?");
		String q2 = input.nextLine();
		
		out.println("Is your birthday in set 3 (1 for yes, 0 for no)?");
		String q3 = input.nextLine();
		
		out.println("Is your birthday in set 4 (1 for yes, 0 for no)?");
		String q4 = input.nextLine();
		
		out.println("Is your birthday in set 5 (1 for yes, 0 for no)?");
		String q5 = input.nextLine();
		
		
		int number = 0;
		
		if (q1.equals("1")) {
			number = number + 1;
		}
		if (q2.equals("1")) {
			number = number + 2;
		}
		if (q3.equals("1")) {
			number = number + 4;
		}
		if (q4.equals("1")) {
			number = number + 8;
		}
		if (q5.equals("1")) {
			number = number + 16;
		}
		
		out.println("\n\nYour birthday is: " + number + ".");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/**
		 * binary
		 * ______
		 * 
		 * conversion numbers:
		 * 128, 64, 32, 16, 8, 4, 2, 1
		 * number:
		 * 77
		 * 
		 * 77 >= 128 = false		0
		 * 77 >= 64 = true			1		77 - 64
		 * 13 >= 32 = false			0
		 * 13 >= 16 = false			0
		 * 13 >= 8 = true			1		13 - 8
		 * 5 >= 4 = true			1		5 - 4
		 * 1 >= 2 = false			0
		 * 1 >= 1 = true			1		1 - 1
		 * 
		 * binary number:
		 * 01001101
		 */

	}

}
