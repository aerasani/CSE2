//Ashish Erasani
// CSE 2
// September 23, 2014
// HW 04
// this program is supposed to take a course number input and tell the user what year and semester it was it 
    // import the scanner
    import java.util.Scanner;
    // name the class
    public class CourseNumber {
        //main method required for every Java program
        public static void main (String [] args) {
            // define the scanner
            Scanner myScanner;
            myScanner = new Scanner (System.in);
            // promt the user for the input number 
            System.out.print("Enter the course code as an integer");
            // define the variable that the user will input
            int course = myScanner.nextInt();
            double calc1 = course/100;// this outputs a number which is the year with some remainder attached
            int year = (int) calc1; // this gets rid of the remainder telling us the year of the course
            int year1 = 0; // defines year as 0 so that it can change with the input
            if (year>=1860 && year<=2014){ // checks to make sure that the year is within the school history
                 year1 = year;
            }
            
            int cnum = course % 100; // removes teh first 4 digits which is the year and gives us the semester information
          
            if (cnum ==10) {    // checks to see if its in the spring semester and displays it 
               String sem = "spring";
               System.out.println("This course was in "+year1+" and in the "+sem+ " semester");
            }
            else if (cnum == 20) {  // checks to see if its in the summer semester and displays it 
                String sem = "summer";
                System.out.println("This course was in "+year1+" and in the "+sem+ " semester");
            }
            else if (cnum == 30) {  // checks to see if its in the summer 2 semester and displays it 
               String sem = "summer2";
               System.out.println("This course was in "+year1+" and in the "+sem+ " semester");
            }
            else if (cnum == 40) { // checks to see if its in the fall semester and displays it 
                String sem = "fall";
                System.out.println("This course was in "+year1+" and in the "+sem+ " semester");
            }
            else {  // tells the user they need to input another course number 
                System.out.println("Wrong course number");
            }
        }
    }
