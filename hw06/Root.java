//Ashish Erasani
//CSE 2
// October 14 2014
// HW 06
// Find the square root of a number given a input 

    import java.util.Scanner; // need to get user input
    public class Root { // reqired for all java programs
        public static void main (String [] args){
            Scanner input = new Scanner(System.in); // defining the scanner variable
            System.out.print("Enter an integer greater than 0:"); // asking the user for an input
            int user = -1; // intitializing the variable
            if (input.hasNextInt()) { // check to see if is an integer
            user = input.nextInt();
            }
            else {
                System.out.println("Did not enter a integer");
                return;
            }
            
                    double high; // intializing the varibles 
                    double low = 0, i = 0.00001;
                    double middle = 0.00, middlesquare, difference = 2;
                    high = user + 1; // defining the high variable
                    middle = ((low + high)/2); // formula for finding the middle 
                    middlesquare = Math.pow(middle,2); // squaring the middle 

                for (i = 0; i < 100; i++) { // loop which runs until the difference is less than 0.00001
                   if (middlesquare > user) { // checks to see if the square of the middle is greater than user input
                        high = middle;
                    }
                    else if (middlesquare < user) { // checks to see if the square of the middle is less than the user input
                        low = middle;
                    }

                   middle = ((low + high)/2);   // recalulates the middle with the new variables
                   middlesquare = Math.pow(middle,2); // recalculates the square of the middle
                   difference = high - low; // calcualtes the difference 
                   
                   if (difference < 0.00001) {  // checks to see if the difference is less than the threshold 
                   System.out.println("Square Root = " +high); // prints out the square root
                   System.out.println("square = " +middlesquare);
                       return;
                   }
                 }
            //  }
            }
          }