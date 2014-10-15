//Ashish Erasani    
// CSE 02
// October 14, 2014
// HW 06
// Simulate spins of roulette and then calculate the amount won
import java.util.Random; // needed to get random numbers
    public class Roulette {
    public static void main (String [] args) {
    int wins = 0, losses = 0, betnumber, roulettenumber, i = 0, limit = 100, winnings;
    for (i = 0; i < 100; i++) {
     for (int j = 0; j < limit; j++) {
      betnumber = (int)(Math.random() *38); // gives the number that the user bets on
      roulettenumber = (int)(Math.random() *38);// gives the number that the ball lands on
        if (betnumber == roulettenumber) { // if the betting number is the same that the ball lands on it adds 1 to the wins
            wins++;
        }
            else {  // else it adds one to the losses
                losses++;
            }
            
    }
   
    }
    winnings = 36 * wins;  // finds out how much you won
    System.out.println("Out of 1000 spins you won " +wins+ " times");
    System.out.println("Out of 1000 spins you lost " +losses+ " times");
    System.out.println("You won: $" +winnings);
    
    }
}
