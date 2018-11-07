package c_spik3.chapter_5;

import static java.lang.System.out;
import java.util.Scanner;

public class Hex_Digit {
  
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		out.println("Enter a hex digit 0-9 or A-F:");
		String hex_string = input.nextLine();
		
		int value1 = 0;
		int value2 = 0;
		int value3 = 0;
    
		if (hex_string.length() != 3) {
			out.println("You must enter exactly one character.");
			System.exit(1);
		}
    
		char ch1 = Character.toUpperCase(hex_string.charAt(0));
		char ch2 = Character.toUpperCase(hex_string.charAt(1));
		char ch3 = Character.toUpperCase(hex_string.charAt(2));
		
		if (ch1 <= 'F' && ch1 >= 'A') {
			value1 = ch1 - 'A' + 10;
			
		} else if (Character.isDigit(ch1)) {
			value1 = ch1;
			
		} else {
			out.println (ch1 + " in " + hex_string + " is invalid.");
		}
		
		if (ch2 <= 'F' && ch2 >= 'A') {
			value2 = ch2 - 'A' + 10;
			
		} else if (Character.isDigit(ch2)) {
			value2 = ch2;
			
		} else {
			out.println (ch2 + " in " + hex_string + " is invalid.");
		}
		
		if (ch3 <= 'F' && ch3 >= 'A') {
			value3 = ch3 - 'A' + 10;
			
		} else if (Character.isDigit(ch3)) {
			value3 = ch3;
			
		} else {
			out.println (ch3 + " in " + hex_string + " is invalid.");
		}
		
		out.println("The decimal value for hex digit " + ch1 + " in " + hex_string + " is " + value1 + ".");
		out.println("The decimal value for hex digit " + ch2 + " in " + hex_string + " is " + value2 + ".");
		out.println("The decimal value for hex digit " + ch3 + " in " + hex_string + " is " + value3 + ".");
  }

}
