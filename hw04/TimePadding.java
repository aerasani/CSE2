//Ashish Erasani
// CSE 2
// September 23, 2014
// HW 04
// is supposed to output the hours, minutes and seconds given the total seconds in the 00:00:00 format
    // import the scanner
    import java.util.Scanner;
    // name the class
    public class TimePadding {
        //main method required for every Java program
        public static void main (String [] args) {
            // define the scanner
            Scanner myScanner;
            myScanner = new Scanner (System.in);
            // promt the user for the input number 
            System.out.print("Enter the numeber of seconds as an integer");
            // define the variable that the user will input
            double secs = myScanner.nextInt();
            // defines the variables that are needed for calculation
            double min;
            double hours;
            double min1;
            double secs1;
            double calc1;
            double calc2;
            min = secs/60; // gets the number of mins
            hours = min/60; // gets the number of hours
            int hours1 = (int) hours; // converts the hours to intger so it drops the rest of the numbers
            calc1 = hours1 * 60; // calcualtes the number of minutes in the hours so it can be subtraceted to find mins
            calc2 = min - calc1; // subtracts the hours that are already accounted for 
            int calc3 = (int) calc2; // converts the minutes to an integer so that it loose the seconds
            secs1 = secs % 60; // finds the remainder which is the number of seconds
            System.out.println(+hours1+":"+calc3+":"+secs1); // prints out the answer
      
            
        }
    }