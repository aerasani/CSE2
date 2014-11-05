// Ashish Erasani  
// CSE 2
// November 4, 2014
// prints out a increasing number of characters based on input
import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlock(m); // calls the allBlock method 
    }
    public static int getInt() { // gets the correct input(checks to see if int and in range)
        while (true) {
            boolean inputCheck;
            int rangeCheck = -1;
            Scanner input = new Scanner(System.in); // calls scanner for input
            System.out.print("Enter an integer from 1 - 9:"); // asking the user for an input
            inputCheck = checkInt(input); // calles checkInt to see if integer 

            if (inputCheck == false) { // if its false it tells user to do it again
                System.out.println("Did not enter a interger");
            }
            if (inputCheck == true) { // if its integer it checks to see if within range
                rangeCheck = checkRange(input);
                if (rangeCheck != 10) { // rangeCheck is 10 automatically 
                    return rangeCheck;
                }
            }
        }
    }
    public static boolean checkInt(Scanner input) {
        if (input.hasNextInt()) { // sees if its a integer 
            return true;
        }
        else {
            return false;
        }
    }
    public static int checkRange(Scanner input) {
        int c = input.nextInt();
        if (c <= 9 && c >= 1) { // checks range of input 
            return c;
        }
        else {
            System.out.println("Did not enter an integer bewteen 1-9");
        }
        return 10;
    }
    public static void allBlock(int x) { // runs loop until the numebr of lines has been pritned
        for (int i = 1; i <= x; i++) {

            block(i, x); // calls block method 
            space(i, x); // calls the space method 
        }
    }

    public static void space(int r, int i) { // prints out correct space before each block
        for (int s = 1; s <= (r - i); s++) {
            System.out.print(" "); // prints out a space
        }
    }
    public static void block(int k, int x) { // prints out the numebr of lines (7 for 7)
        for (int j = 1; j <= k; j++) {
            line(k, x); // calls line method 

        }
        for (int i = 1; i <= (x - k); i++) { // prints out correct # of space befoe the dash
            System.out.print(" ");
        }
        for (int r = 1; r <= (k * 2) - 1; r++) {
            System.out.print("-"); // prints out dashes 
        }
        System.out.print("\n"); // prints out new line after dash
    }

    public static void line(int m, int i) {
        for (int j = 1; j <= (i - m); j++) { // prints out correct # of spaces before numbers 
            System.out.print(" ");
        }
        for (int n = 1; n <= (m * 2) - 1; n++) { // runs to print the number of characters (1,3,5,ect) in each line

            System.out.print(m); // prints out the number inputed 
        }

        System.out.print("\n"); // prints new line after each diffeent numeber 
    }
}