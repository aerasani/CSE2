//Ashish Erasani
// CSE 2
// September 23, 2014
// Lab 5
    // import the scanner
    import java.util.Scanner;
    import java.util.Random;
    // name the class
    public class RandomGames {
        //main method required for every Java program
        public static void main (String [] args) {
            // define the scanner
            Scanner scan = new Scanner (System.in);
            // promt the user for the input number 
            System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick up card");
            // define the variable that the user will input
            String input = scan.nextLine();
            String user = input;
            double roulette;
            switch (user){
                case "r": roulette = Math.random() * 38;
                          if (roulette == 1){
                              roulette = 00;
                          }
                          System.out.println("Roulette:" +(int)roulette);
                            break;
                case "R": roulette = Math.random() * 38;
                          if (roulette == 1){
                              roulette = 00;
                          }
                          System.out.println("Roulette:" +(int)roulette);
                            break;
                case "c": System.out.println("The option will be implemented");
                            break;
                case "C": System.out.println("The option will be implemented");
                            break;
                case "p": System.out.println("The option will be implemented");
                            break;
                case "P": System.out.println("The option will be implemented");
                            break;
                
                default: System.out.println("Did not enter one of the options");
                            break;
            }
            
        }
    }
    
            