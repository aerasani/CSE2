// Ashish Erasani
// CSE 02
// November 18 2014
// find duplicates
import java.util.Scanner; // imports the scanner
public class FindDuplicates {
  public static void main(String[] arg) {
    Scanner scan = new Scanner(System.in); // names scanner 
    int num[] = new int[10]; // initializes array num 
    String answer = "";
    do {
      System.out.print("Enter 10 ints- ");
      for (int j = 0; j < 10; j++) {
        num[j] = scan.nextInt();
      }
      String out = "The array ";
      out += listArray(num); //return a string of the form "{2, 3, -9}"   
      if (hasDups(num)) { // calls hasDups to see if its true or not
        out += "has "; // 
      }
      else {
        out += "does not have ";
      }
      out += "duplicates.";
      System.out.println(out); // prints out the statement 
      out = "The array ";
      out += listArray(num);
      if (exactlyOneDup(num)) { // calls exactlyOneDup to see if it has exacly one pair
        out += "has ";
      }
      else {
        out += "does not have ";
      }
      out += "exactly one duplicate.";
      System.out.println(out); // prints out statement
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer = scan.next();
    } while (answer.equals("Y") || answer.equals("y")); // keeps on running until they stop pressing y
  }

  public static String listArray(int num[]) { // array for listing the array into a line 
    String out = "{";
    for (int j = 0; j < num.length; j++) {
      if (j > 0) {
        out += ", "; // adds comma
      }
      out += num[j];
    }
    out += "} ";
    return out;
  }

  public static boolean hasDups(int[] num) { // method to see if there are duplicates 
    int counter = 0; // initializes counter 
    for (int j = 0; j < num.length; j++) { // loop to cycle throught first number to check 
      for (int i = j + 1; i < num.length; i++) { // loop to cycle throught the second number to check
        if (num[i] == num[j]) { // if first number and second number is same then counter is added 1
          counter++;
        }
      }
    }
    if (counter > 0) { // if couunter is greater than 1 there are duplicates 
      return true; // returns true or false 
    }
    else {
      return false;
    }
  }
  public static boolean exactlyOneDup(int[] num) { // method to see if there are 1 duplicates 

    int counter = 0;
    for (int j = 0; j < num.length; j++) { // loop to cycle throught first number to check 
      for (int i = j + 1; i < num.length; i++) { // loop to cycle throught the second number to check
        if (num[i] == num[j]) { // if first number and second number is same then counter is added 1
          counter++;
        }
      }
    }
    if (counter == 1) { // if there is only in counter then there is only 1 duplicate
      return true; // returns true or false 
    }
    else {
      return false;
    }

  }
}