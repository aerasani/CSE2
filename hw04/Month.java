//Ashish Erasani
// CSE 2
// September 23, 2014
// HW 04
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
            int days = 0;
            
            if (month == 1) {
                days = 31;
            }
            else if (month == 2) {
                days = 28;
            }
            else if (month == 3) {
                days = 31;
            } 
            else if (month == 4) {
                days = 30;
            }
            else if (month == 5) {
                days = 31;
            } 
            else if (month == 6) {
                days = 30;
            } 
            else if (month == 7) {
                days = 31;
            } 
            else if (month == 8) {
                days = 31;
            } 
            else if (month == 9) {
                days = 30;
            } 
            else if (month == 10) {
                days = 31;
            } 
            else if (month == 11) {
                days = 30;
            } 
            else if (month == 12) {
                days = 31;
            }
            if (month ==2) {
               
                System.out.println("Enter an int giving the year");
                if(myScanner.hasNextInt()) {
                    int year = myScanner.nextInt();
                    double check;
                    check = year/4;
                    System.out.println(+check);
                }
                else 
                    System.out.println("Bitch Please");
            }
                
            // display the days
             System.out.println("This month has " +days+ " days");
        }
    }