//Ashish Erasani
//CSE 02
//September 15, 2014
//FourDigits
    // import the scanner 
    import java.util.Scanner;
    // define the class
    public class FourDigits {
        public static void main (String [] args) {
            // define scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            System.out.print("Enter a double");
            // create a variable that the user can input
            double digits = myScanner.nextDouble();
            // convert the double digits to a integer myint
            int myint = (int) digits;
            // define dig1 which is used to multiply by 10000
            int dig1;
            dig1=10000;
            // define dig2 to store the value when multiplying by 10000
            double dig2;
            dig2 = digits * dig1;
            // convert dig2 to another integer
            int myint2 = (int) dig2;
            // get the individual digits in the stored value
            int tenthousand = myint2 % 10 ;
            int thousand = myint2 / 10 % 10;
            int hundred = myint2 / 100 % 100;
            // print out the indiviual digits
            System.out.println("the answer is "
            +hundred+thousand+tenthousand);
            
            
        }
    }