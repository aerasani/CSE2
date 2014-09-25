//Ashish Erasani
// CSE 2
// September 23, 2014
// HW 04
// given input the program is supposed to calculate the income tax that should be paid 
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
                
            double tax = 0.00  ; // defines tax as originally 0 which will chanage based on input

             if (income < 20) {  // for income less than 20
                    tax = income * 0.05;
                 }
                 else if (income < 40) { // for income less than 40
                    tax = income * 0.07;
                 }
                 else if (income < 78) { // for income less than 78
                    tax = income * 0.12; 
                 }
                 else {                 // for income greater than 78
                    tax = income * 0.14;
                 }
                
            // Display Tax
                System.out.println("The tax is" +(int)(tax*1000));
                
                
            
        }
    }