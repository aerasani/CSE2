//Ashish Erasani
// CSE 2
// September 23, 2014
// HW 04
    // import the scanner
    import java.util.Scanner;
    // name the class
    public class IncomeTax {
        //main method required for every Java program
        public static void main (String [] args) {
            // define the scanner
            Scanner myScanner;
            myScanner = new Scanner (System.in);
            // promt the user for the input number 
            System.out.print("Enter your income as an integer");
            // define the variable that the user will input
            int income = myScanner.nextInt();
            if(myScanner.hasNextInt()) {
                else {
                    System.out.println("You did not enter an int");
                    return;
                }
                
            double tax = 0.00  ;
            //check if input is integer

             if (income < 20) { 
                    tax = income * 0.05;
                 }
                 else if (income < 40) {
                    tax = income * 0.07;
                 }
                 else if (income < 78) {
                    tax = income * 0.12; 
                 }
                 else {
                    tax = income * 0.14;
                 }
                
            // Display Tax
                System.out.println("The tax is" +(int)(tax*1000));
                
                
            
        }
    }