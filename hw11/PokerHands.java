// Ashish Erasani
// CSE 2
// December 5th, 2014
// hw11
import java.util.Scanner;
public class PokerHands {
    public static void main(String[] args) {   
        String clubanswer = "Clubs: ";
        String diamondanswer = "Diamond: ";
        String heartsanswer = "Hearts: ";
        String spadesanswer = "Spades: ";
        int[] hand = {  // populates hand with 52's
            52, 52, 52, 52, 52
        };
        int[] deck = new int[51]; // intiizatizes the deck
        int counter = 0, number = 0; 
        
        String tempsuit = "", temprank = "";

        int[] suitnum = { // populates array with suit numbers ( 0 for C, 13 for d, 26 for h, 39 for s)
            0, 13, 26, 39
        };
        
        String[] ranks = { // array to compare user input for rank
            "c", "d", "h", "s"
        };
        String[] faces = { // array to compare user input for type of card 
            "a", "k", "q", "j", "10", "9", "8", "7", "6", "5",
            "4", "3", "2"
        };
        Scanner scan = new Scanner(System.in); // defines scanner 
        
        do { // runs while the hand is populated with 5 cards 
            System.out.print("Enter the suit: c, d, h, s: "); // asks user for input
            tempsuit = scan.nextLine(); // user input = tempsuit
            for (int k = 0; k < ranks.length; k++) {  // checks the input with rank and saves coresponding suit number
                if (tempsuit.equals(ranks[k])) { 
                    number = suitnum[k];
                }
            }
            System.out.print("Enter one of 2, 3, 4, 5, 6, 7, 8, 9, 10, j, q, k, a: "); // asks user for card
            temprank = scan.nextLine(); //user input = temprank
            for (int x = 0; x < faces.length; x++) { // adds the suit number with the number of the card they enter 
                if (temprank.equals(faces[x])) {
                    number += x;
                }
            }
            for (int g = 0; g < hand.length; g++) { // if the number is already there, it asks them again
                if (number == hand[g]) {
                    System.out.println("Already entered that card, try again");
                    counter--;
                    break; // runs again
                }
            }
            // adds the users hand to the string answers so that the hand can be displayed
                if(tempsuit.equals("c")){    
                clubanswer += temprank+ " ";
                }
                if(tempsuit.equals("d")){
                diamondanswer += temprank + " ";
                }
                if(tempsuit.equals("h")){
                heartsanswer += temprank+ " ";
                }
                if(tempsuit.equals("s")){
                spadesanswer += temprank+ " ";
            }
            
            hand[counter] = number; // inserts the number of the card they entered into the hand array
            number = 0; // resets numeber to 0
            counter++; 
        }while (counter < 5); // runs until counter is less than 5 - 5 cards per hand
             // Prints out the users hand
             System.out.println(clubanswer);
             System.out.println(diamondanswer);
             System.out.println(heartsanswer);
             System.out.println(spadesanswer);
             // prints out the rank
        System.out.println("your rank is: " +answer(hand));
        
    }
    public static String answer(int[] hand) { 
        // intiizalizes a number of arrays that are used to check the rank of the hand
        int[] rank = new int[13]; 
        int[] suit = new int[4];
        int[] rankcheck = new int[5];
        int[] suitcheck = new int[5];
        int[] handcheck = new int[5];
        int temp = 0, intstraight = 0, royal = 0;
        String answer = "";
        int counter = 0;
        for (int i = 0; i < rank.length; i++) { // populates the rank array with 0
            rank[i] = 0;
        }
        for (int w = 0; w < suit.length; w++) { //populates the suit array wih 0
            rank[w] = 0;
        }
        for (int z = 0; z < handcheck.length; z++) { // populates the rank array with 0
            rank[z] = 0;
        } 
        for (int k = 0; k < rankcheck.length; k++) { // gets the rank and suit of each card and puts it the array
            rankcheck[k] = hand[k] % 13;
            suitcheck[k] = hand[k] / 13;
        }
        for (int j = 0; j < rankcheck.length; j++) {  // adds 1 for every rank that is in the rankcheck array
            rank[rankcheck[j]]++;
        }
        for (int r = 0; r < suitcheck.length; r++) { // adds for 1 for every suit that is in the suitchcheck array
            suit[suitcheck[r]]++;
        }
        
        for (int y = 0; y < rank.length; y++) {  // runs through the rank array and sees how many times a
                                                // a rank has show up and adds one in the handcheck array
             if (rank[y] == 0) {
                handcheck[0] ++;
            }
            if (rank[y] == 1) {
                handcheck[1] ++;
            }
            if (rank[y] == 2) {
                handcheck[2] ++;
            }
            if (rank[y] == 3) {
                handcheck[3] ++;
            }
            if (rank[y] == 4) {
                handcheck[4] ++;
            } 
        }// runs through the rank array and sees how many times a suit has show up and adds one in the suitcheck array
        for (int s = 0; s < suitcheck.length; s++) {
            if (suitcheck[s] == 0) {
                suit[0] ++;
            }
            if (suitcheck[s] == 1) {
                suit[1] ++;
            }
            if (suitcheck[s] == 2) {
                suit[2] ++;
            }
            if (suitcheck[s] == 3) {
                suit[3] ++;
            }
        }
        // checks the number of 0's in the rankcheck array to see what kind of hand it is 
        
        if (handcheck[0] == 11){
            if (handcheck[4] == 1){  // if there are 11 0's and 1 4 then its a 4 of a kind
                answer = "4 of a kind";
            }
            else{
                answer = " Full House";
            }
        }
        // if there are 10 0's then its a 2 pair
        if (handcheck[0] == 10){
            answer = "2 pair";
        }
        // if there are 9 0's then its a 1 pair
        if (handcheck[0] == 9){
            answer = "1 pair";
        }
        // checks to see if there are all 5 cards that are the same suit
        for (int p = 0; p < suit.length; p++){
            if (suit[p] == 5){
                temp++;
            }
        }
        // runs through the rank array to see if there are any spaces bewteen the 
        // numbers and if there are none, it means that its a straight
        for (int e = 0; e < rank.length; e++){
            if (rank[e] == 1){
                if (rank[e+1] == 1){
                    if (rank[e+2] == 1){
                        if (rank[e+3] == 1){
                            if (rank[e+4] == 1){
                             intstraight++;
                            break;
                            }
                        }
                    }
                }
            }
        }
        // checks to see if there is a A to see if its a royal flush
        for (int h = 0; h < rankcheck.length; h++){
            if (rankcheck[h] == 0){
                royal++;
            }
        }
        // if there are 8 0's then it means it can be a flush, straight, flush, straight or high card 
            if (handcheck[0] == 8) {
                // if intstraight is not 0 then it means its a straight flush or a straight
                if (intstraight == 1) { 
                    if (royal != 0) { // if royal is not 0 then its a royal straight
                        answer = "royal flush";
                    }
                    else if (temp != 0) {
                        answer = "straight flush";
                    }
                    else {
                        answer = "straight";
                    }
                }
                else if (temp != 0) {
                    answer = "Flush";
                }
                else {
                    answer = "High Card";
                }
            }
    return answer; // returns answer 
    }
}