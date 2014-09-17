//Ashish Erasani
//9/5
//CSE02 Lab 2

// Cyclometer 
// given 2 trips, given time and rotation count, the program will:
//a) give the number of minutes of each trip
//b) print the number of counts for each trip
//c)print the distance of each trip in miles
//d)print the distance of the two trips combined

public class Cyclometer {
    // main method required for each program
    public static void main(String [] args) {
    // out input data
    int secsTrip1=480; // Number of seconds in Trip 1
    int secsTrip2=3220; // Number of seconds in Trip 2
    int countsTrip1=1561; // Number of rotations in Trip1
    int countsTrip2=9037; // Number of rotations in Trip2
    double wheelDiameter=27.0, //
    PI=3.14159,//
    feetPerMile=5280,
    inchesPerFoot=12,
    secondsPerMinute=60;
    double distanceTrip1, distanceTrip2, totalDistance;//
    // print out the numbers that you have stored in the variables
    System.out.println("Trip 1 took "+
    (secsTrip1/secondsPerMinute)+ " minutes and had "+ 
    countsTrip1+ " counts.");
    System.out.println("Trip 2 took "+
    (secsTrip2/secondsPerMinute)+ " minutes and had " + 
    countsTrip2+ " counts.");
    //run the calculations; store the values. Document you calculation here.
    // What are you calculating?
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    //above gives distance in inches
    // for each count a rottation of the whheel travels
    // the diamerter in inches times PI
    distanceTrip1/=inchesPerFoot*feetPerMile;//gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    //print out the output data
    int distanceTrip2 = (int)
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
       }
}