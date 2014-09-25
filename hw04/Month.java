//Ashish Erasani
// CSE 2
// September 23, 2014
// HW 04
// is supposed to give you the number of days given the month and 
// based on which year, give the correct days for feburary 
    // import the scanner
    import java.util.Scanner;
    // name the class
    public class Month {
        //main method required for every Java program
        public static void main (String [] args) {
            // define the scanner
            Scanner myScanner;
            myScanner = new Scanner (System.in);
            // promt the user for the input number 
            System.out.print("Enter the month (1-12) as an integer");
            // define the variable that the user will input
            int month = myScanner.nextInt();
            int days = 0; // sets the default value for days which will change based on the input 
            
            if (month == 1) { // for january
                days = 31;
            }
            else if (month == 2) { // for feburary
                days = 28;
            }
            else if (month == 3) { // for march
                days = 31;
            } 
            else if (month == 4) { // for april
                days = 30;
            }
            else if (month == 5) { // for may
                days = 31;
            } 
            else if (month == 6) { // for june
                days = 30;
            } 
            else if (month == 7) { // for july
                days = 31;
            } 
            else if (month == 8) { // for august 
                days = 31;
            } 
            else if (month == 9) { // for septemeber
                days = 30;
            } 
            else if (month == 10) { // for october
                days = 31;
            } 
            else if (month == 11) { // for november
                days = 30;
            } 
            else if (month == 12) { // for december 
                days = 31;
            }
            if (month ==2) { // for feburary to see if 28 or 29 days
               
                System.out.println("Enter an int giving the year"); // asks user for year
                if(myScanner.hasNextInt()) { // checks to see if input is int
                    int year = myScanner.nextInt(); // defines year as variable
                    double check; 
                    check = year/4; // checks to see if year is divisible by 4 and if it is then its a leap year
                 // if (check.hasNextInt()) {
                }
                else 
                    System.out.println("This month has 28 days");
            }
                
            // display the days
             System.out.println("This month has " +days+ " days");
        }
    }
    