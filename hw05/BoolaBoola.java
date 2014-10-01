//Ashish Erasani
// CSE 2
// September 28, 2014
// HW 05
// randomize booleans and get user to evaluate them, telling them if they are 
// right or wrong
    import java.util.Random; // needed to get random numbers
    import java.util.Scanner; // needed for user input
    public class BoolaBoola { // name the class
        public static void main (String [] args) { // main method required for every java program
            boolean trueorfalse1, trueorfalse2, trueorfalse3; // define the 3 true or false variables that are going to be generated
            int trueorfalse = (int)(Math.random()*2); // gives number bewteen 0 or 1 
            if(trueorfalse == 0) {      // checks to see what the first value is 
                trueorfalse1 = true;    // defines the variable as true or false
            }
            else {
                trueorfalse1 = false;
            }
            trueorfalse = (int)(Math.random()*2); // checks to see what the second value is 
            if(trueorfalse == 0) {          // defines the variable as true or false
                trueorfalse2 = true;
            }
            else {
                trueorfalse2 = false;
            }
            trueorfalse = (int)(Math.random()*2);   // checks to see what the thrid value is 
            if (trueorfalse == 0) {
                trueorfalse3 = true;    // defines the variable as true or false
            }
            else {
                trueorfalse3 = false;
            }
            
            int i = (int) (Math.random()*4);    // generates value from 0-3 for generating the questions
            switch (i){
                case 0:
                    boolean answer = (trueorfalse1 && trueorfalse2 && trueorfalse3); // computes what the answer is for && &&
                    String ans = String.valueOf(answer); // changes the boolean answer to string so it can be compared 
                    System.out.println("Does "+trueorfalse1+ "&&"+trueorfalse2+ "&&"+trueorfalse3); // asks the user the question
                    Scanner andand = new Scanner(System.in); // needed so that the user can input the answer
                    String check = andand.next(); // converts the users question so that it can be compared
                    if (check.equals(ans)){ // sees if the answer inputed is the same as the computers answer
                        System.out.println("Correct"); 
                    }
                    else {
                        System.out.println("False");
                    }
                    return; // quits the program 
                case 1: 
                    boolean answer1 = (trueorfalse1 || trueorfalse2 || trueorfalse3); // computes what the answer is for || ||
                    String ans1 = String.valueOf(answer1); // changes the boolean answer to string so it can be compared 
                    System.out.println("Does "+trueorfalse1+ "||"+trueorfalse2+ "||"+trueorfalse3); // asks the user the question
                    Scanner andand1 = new Scanner(System.in); // needed so that the user can input the answer
                    String check1 = andand1.next(); // converts the users question so that it can be compared
                    if (check1.equals(ans1)){ // sees if the answer inputed is the same as the computers answer
                        System.out.println("Correct"); 
                    }
                    else {
                        System.out.println("False");
                    }
                    return;
                case 2:
                    boolean answer2 = (trueorfalse1 && trueorfalse2 || trueorfalse3); // computes what the answer is for && ||
                    String ans2 = String.valueOf(answer2); // changes the boolean answer to string so it can be compared 
                    System.out.println("Does "+trueorfalse1+ "&&"+trueorfalse2+ "||"+trueorfalse3);
                    Scanner andand2 = new Scanner(System.in); // needed so that the user can input the answer
                    String check2 = andand2.next(); // converts the users question so that it can be compared
                    if (check2.equals(ans2)){   // sees if the answer inputed is the same as the computers answer
                        System.out.println("Correct");
                    }
                    else {
                        System.out.println("False");
                    }
                    return;
                case 3:
                    boolean answer3 = (trueorfalse1 || trueorfalse2 && trueorfalse3); // computes what the answer is for || &&
                    String ans3 = String.valueOf(answer3); // changes the boolean answer to string so it can be compared 
                    System.out.println("Does "+trueorfalse1+ "||"+trueorfalse2+ "&&"+trueorfalse3);
                    Scanner andand3 = new Scanner(System.in); // needed so that the user can input the answer
                    String check3 = andand3.next(); // converts the users question so that it can be compared
                    if (check3.equals(ans3)){ // sees if the answer inputed is the same as the computers answer
                        System.out.println("Correct");
                    }
                    else {
                        System.out.println("False");
                    }
                    return; // quits the program 
            }
        }
    }