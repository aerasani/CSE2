// Ashish Erasani
// CSE 2
// October 28, 2014
//  Use overloaded methods
import java.util.Scanner;
public class HW8 {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in); // defining the input variable for the user 
		System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); // ask the user to enter an input 
		System.out.println("You entered " + getInput(scan, "Cc") + ""); // call the method for Cc
		System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); // ask the user to enter an input 
		System.out.println("You entered " + getInput(scan, "YyNn", 5) + ""); // call the method for YyNn
		System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-"); // ask the user to enter an input
		System.out.println("You entered '" + getInput(scan, "Choose a digit", "0123456789") + "'"); // call the method for the digits 

	}
	public static char getInput(Scanner scan, String inputstring) { // overload method for a scanner and a string "Cc"
		char input = ' '; // initializes the variable input 
		char check;
		String first = scan.nextLine(); // allows the user for the input
		check = first.charAt(0); // converts the input into a char

		if (check == 'C') { // if its C or c then it stores the variable into input which gets returned  
			input = check;
		}
		else if (check == 'c') {
			input = check;
		}
		else {
			System.out.println("Did not enter C or c"); // tells the user they did not enter the correct variable
			System.exit(0);
		}
		return input; // returns the input 
	}
	public static char getInput(Scanner scan, String inputstring, int inputint) { // overlaod method for the scanner, an string, and a integer
		// String a = "a", Y = "Y", y = "y", n = "n", N = "N";		

		String second = " ";	// initiallzie the string
		for (int i = 0; i < inputint; i++) {	// runs a loop for the number of times declared in the call 
			String first = scan.nextLine();	// asks the user for input
			if (first.equals("Y") || first.equals("y") || first.equals("n") || first.equals("N")) { // checks to see if the input is NnYy
				return first.charAt(0);	// returns the inout character 
			}
			else {
				System.out.print("Please try again"); // asks the user to try again if not YyNn
			}
		}
		System.out.print("You failed after " + inputint + " tries"); // exits the loop after a number of tries 
		return second.charAt(0);	// returns the input character 
	}

	public static char getInput(Scanner scan, String inputstring, String numberstring) { // overload method for the scanner, string, string 
		String num = " "; // initializes the string 
	
		do {								// runs a loop until the user enters 1 character 
			num = scan.nextLine();
			if (num.length() > 1) {
				System.out.println("Did not enter 1 character");
			}
		} while (num.length() > 1); 

		char check = num.charAt(0);		// declares the string as char 
		
		
		int index = numberstring.indexOf(check);	// checks to see if the user entered one of the digits in the call method 

		if (index == -1) {		// of the index comes back -1 it maans that it was not one of the digits and returns nothing 
			System.out.println("Did not enter a correct number");
			return check; // returns the wrong variable user entered
		}
		
		return check;	// returns check to the call method 
	}
}
