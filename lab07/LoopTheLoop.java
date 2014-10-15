//Ashish Erasani
// Lab 07
// Loop the loop
import java.util.Scanner;
public class LoopTheLoop{
    
    public static void main(String [] args) {
    int nStars = 10;
    int counter = 0;
    /*while (counter < nStars){
        System.out.print("*");
        counter++;
    }*/
    
    System.out.println("part 2:");
    
    for (int i = 0; i < nStars; i++){
        for (int j = 0; j <=i; j++){
            System.out.print("*");
        }
        System.out.print("\n");
        
    }
    System.out.println("Part 3:");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a int bewteen 1-15");
    nStars = input.nextInt();
    while (nStars >= 1 & nStars <= 15) {
        //while (!nStars.hasNextInt()){
            for (int i = 0; i<nStars; i++){
                for (int j = 0; j<=i; j++){
                    System.out.print("*");
                }
                System.out.print("\n");
              
            }
            return; 
        
        }
       // response = input.nextLine();
       // System.out.println("Enter Y or y if you want to go again");
       // while (input == "y"|| input == "Y");
    }
    }

    /*nStars = input.nextInt();
    if (input.hasNextInt()){
        while (nStars >= 1 && nStars <=15){
            for (int i = 0; i < nStars; i++){
        for (int j = 0; j <=i; j++){
            System.out.print("*");
        }
        System.out.print("\n");
            }
            return;*/


