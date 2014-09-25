//Ashish Erasani
// CSE 2
// September 23, 2014
// HW 04
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
            double calc1 = course/100;
            int year = (int) calc1;
            int dope = 0;
            if (year>=1860 && year<=2014){
                 dope = year;
            }
            
            int cnum = course % 100;
          
            if (cnum ==10) {
               String sem = "spring";
               System.out.println(sem +"And"+dope);
            }
            else if (cnum == 20) {
                String sem = "summer";
                System.out.println(sem +"And"+dope);
            }
            else if (cnum == 30) {
               String sem = "summer2";
               System.out.println(sem +"And"+dope);
            }
            else if (cnum == 40) {
                String sem = "fall";
                System.out.println(sem +"And"+dope);
            }
            else {
                System.out.println("Wrong semester");
            }
        }
    }
