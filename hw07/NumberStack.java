//Ashish Erasani    
// CSE 02
// October 21, 2014
// HW 07
// Create a loop that stacks the numebr which the user entered 
import java.util.Scanner;
    public class NumberStack {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in); // defining the scanner variable
        System.out.print("Enter an integer from 1 - 9:"); // asking the user for an input
        int user = input.nextInt(); // defining the variable that the user inputs as integer
        System.out.println("Using for loops");
      int i;    
        for (i = 1; i <= user; i++){        // runs loop until the number of lines has been printed 
            for (int k = 1; k<=i; k++){   // prints out the number of lines ( 7 lines for number 7) 
              for (int j = 1; j<=(i*2)-1; j++){ // runs to print the number of characters (1,3,5,ect) in each line
                    System.out.print(+i);   
                    
                }
                System.out.print("\n"); // creates a new line for each number
              
           }
            System.out.print("---");            // seperates the numbers with ---
            System.out.print("\n");             // creates a new line for the different number
        } 
            System.out.println("Using while loops");
        i = 0;
        int k, j;
        while (i <= user){  // runs loop until the number of lines has been printed 
            k = 1;
            while(k<=i){     // prints out the number of lines ( 7 lines for number 7) 
                j = 1;
                while(j<=(i*2)-1){  // runs to print the number of characters (1,3,5,ect) in each line
                    System.out.print(+i);
                    j++;
                }
                k++;
               System.out.print("\n");  // creates a new line for each number
            }
            i++;
            System.out.print("---");     // seperates the numbers with ---
            System.out.print("\n");     // creates a new line for the different number
        }
        
        System.out.println("Using do while loops");
        
        i = 1;
        do{
            k = 1;
            do{
                j = 1;
                do{
                    System.out.print(+i);
                    j++; 
            }while (j<=(i*2)-1);  // runs to print the number of characters (1,3,5,ect) in each line
            k++;
            System.out.print("\n"); // creates a new line for each number  
        }while( k <= i);
           i++;
           System.out.print("---"); // septerates the numbers with ---
           System.out.print("\n"); // creates a new line for the different number 
        
    }while(i <= user);      // runs loop until the number of lines has been printed 
    }
}
    