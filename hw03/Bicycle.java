//Ashish Erasani
//CSE02
//Speptember 13, 2014
//Bicycle 
    // import the scanner
 import java.util.Scanner;
 // define the class
 public class Bicycle {
    public static void main (String [] args) {
        // define the scanner 
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        // asks the user for the number of counts
        System.out.print(
        "Enter the number of counts on the cyclometer as an integer > 0:");
        // defines the variable nCycles which is how many counts there are
        int nCycles = myScanner.nextInt();
        // asks the user for the number of seconds
        System.out.print(
        "Enter the number of seconds as an integer > 0:");
        // defines the variable nSeconds which is how many seconds it took
        int nSeconds = myScanner.nextInt();
        // define the set variables
        double wheelDiameter=27.0;
        double secondsPerMinute=60;
        double PI=3.14159;
        double inchesPerFoot=12;
        double feetPerMile=5280;
        // define the variables that have to be calcualted
        double distanceTrip1;
        double minutes ;
        // this is the forumla to get the minutes and the distance
        minutes=nSeconds/secondsPerMinute;
        distanceTrip1=nCycles*wheelDiameter*PI;
        distanceTrip1/=inchesPerFoot*feetPerMile;
        // prints out the distance and minutes for the user
        System.out.println("The distance was "+distanceTrip1+
        "and took " +minutes+ " minutes");
        // defines mph 
        double mph;
        // formuala to claculate mph
        mph=distanceTrip1/(minutes/60);
        // prints out mph for user
        System.out.println("The average miles per hours was "+mph+ " mph");
    }
    
 }