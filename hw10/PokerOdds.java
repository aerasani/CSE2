// Ashish Erasani
// CSE 02
// November 18, 2014

import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
        showHands(); // calls method showhands; 
        simulateOdds();
    }
    public static void showHands() {
        Scanner scan=new Scanner(System.in); // names scanner 
        String answer = " "; // initialzies the answer 
        int[] deck = new int[52]; // sets deck at 52 length 
        int[] hand = new int[5]; // sets hand at 5
        do{ // runs until user says otherwise 
        
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"}; 
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] handsuit = new String[5]; 
        String [] handrank = new String[5];
        String clubanswer = "Clubs: ";
        String diamondanswer = "Diamond: ";
        String heartsanswer = "Hearts: ";
        String spadesanswer = "Spades: ";
       
       
           
        for (int i = 0; i < deck.length; i++) { // initializes the deck from 0 - 51
            deck[i] = i;
        }
        for (int i = 0; i < 5; i++) { // initializes the hand with -1's; 
            hand[i] = -1;
        }
        int counter = 0;
        for (int j = 0; j < hand.length; j++) { // gets the random number and puts in in the hand and then places -1 at end of it 
            int index = (int)(Math.random() * (deck.length - counter)); // gets the random number 
            hand[j] = index; // places the number in hand 
            deck[index] = -1; // replaces the number with -1 
            for (int i = index; i < deck.length - 1 - counter; i++) {  // moves the deck to the left and then places the -1 at the end of it 
                deck[index] = deck[index + 1];
            }
            deck[deck.length - (j + 1)] = -1; // sets the last number at -1 
            String suit = suits[deck[index] / 13]; // gets the suit of the number 
            String rank = ranks[deck[index] % 13]; // gets the rank of the number 
            
            // checks to see what suit the number is and then adds it to the answer for return value 
            if(suit == "Clubs"){    
                clubanswer += rank+ " ";
            }
            if(suit == "Diamonds"){
                diamondanswer += rank + " ";
            }
            if(suit == "Hearts"){
                heartsanswer += rank+ " ";
            }
            if(suit == "Spades"){
                spadesanswer += rank+ " ";
            }
            counter++; // needed to make sure that the deck length is shortened 
            }
            // prints out answer 
             System.out.println(clubanswer);
             System.out.println(diamondanswer);
             System.out.println(heartsanswer);
             System.out.println(spadesanswer);
     System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); // asks user if they want a new hand
     answer=scan.next(); // gets input from user 
    }while(answer.equals("Y") || answer.equals("y")); // keeps on running until they stop pressing y
    }
        
    public static void simulateOdds() {
       //int count = 0;
            int [] count = new int [13]; // intitializes count at 13 and sets all numbers at 0
            for (int e = 0; e < count.length; e++){
                count[e] = 0;
            }
            String[] lables = new String[13];
            String[] labels = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; // array for printing out the answer
            int[] ranking = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; // array to check the rank of the hand
        for (int k = 0; k < 10000; k++) { // runs for 1000 times
            int[] deck = new int[52]; // sets deck at 52 length 
            int[] hand = new int[5]; // sets hand at 5
            for (int i = 0; i < deck.length; i++) { // initializes the deck from 0 - 51
                deck[i] = i;
            }
            for (int i = 0; i < 5; i++) { // initializes the hand with -1's; 
                hand[i] = -1;
            }
            int counter = 0;
            for (int j = 0; j < hand.length; j++) { // gets the random number and puts in in the hand and then places -1 at end of it 
            int index = (int)(Math.random() * (deck.length - counter)); // gets the random number 
            hand[j] = index; // places the number in hand 
            deck[index] = -1; // replaces the number with -1 
            for (int i = index; i < deck.length - 1 - counter; i++) {  // moves the deck to the left and then places the -1 at the end of it 
                deck[index] = deck[index + 1];
            }
            deck[deck.length - (j + 1)] = -1; // sets the last number at -1 
                counter++;
            }
            
            for (int r = 0; r < ranking.length; r++){ // checks all possible ranks
               if (exactlyOneDup(hand) == r){ // calls the method exactlyOneDup and sees if there is a match with a rank
                    count[r]++; // if there is then it adds one to the rank counter 
                }
                else{
                    count[r] += 0; // if not then doesnt add anything 
                }
            }
        }         
        for ( int l = 0; l < lables.length; l++){  // prints out the rank and the corrosponding count of pairs 
           System.out.println(labels[l]+ ":" +count[l]);
            }
        int runningcount = 0;  // adds all the counts of paris together for final tally 
        for ( int q = 0; q < count.length; q++){
            runningcount += count[q];
        }
        System.out.println("-------------------"); 
        System.out.println("Total not exactly one pair: " +(10000 - runningcount)); // prints out how many non pairs there were 
}
    public static int exactlyOneDup( int[] hand){

        int[] returnval = {14,14}; // sets the two spaces 
        int[] rank = new int [5]; // to populate the rank array because suit doesnt matter 
        for ( int k = 0; k < rank.length; k++){ // populates the rank array with the ranks of each card
            rank[k] = hand[k] % 13;
        }
       
        for (int j = 0; j < rank.length; j++) {         // loop to cycle throught first number to check 
            for (int i = j + 1; i < rank.length; i++) {  // loop to cycle throught the second number to check
                if (rank[i] == rank[j]) { // if the two numbers match then it replaces the returnvariable with that rank
                     returnval[0] = rank[j];
                }
                else{
                    returnval[0] = 14;  // if it doesnt then it repleaces it with 14 so that no number with match the return variable 
                }
            }
        }
    return returnval[0];  // returns the value 
    }
}