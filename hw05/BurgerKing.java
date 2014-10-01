//Ashish Erasani
// CSE 2
// September 28, 2014
// HW 05
// give the user options for their burger king order  
    import java.util.Scanner;   // import the scanner
    public class BurgerKing {   // name the class
      public static void main (String [] args) {    //main method required for every Java program
            Scanner input = new Scanner(System.in);  // define the scanner
            // promt the user for the type of food they want 
            System.out.print("Enter a letter to indicate a choice of\n");
            System.out.print("Burger (B or b)\n");
            System.out.print("Soda (S or s)\n");
            System.out.print("Fries (F or f)\n");
            // define the variable that the user will input
            String first = input.nextLine();
            char ch = first.charAt(0);
            //System.out.println("The character entered is" +ch);
            // define the strings that the input character will be checked against
            String a = "a", n = "n", c = "c", A = "A", N = "N", C = "C";
            String s = "s", S = "S", m = "m", M = "M", p = "p", P = "P", l = "l", L = "L";
            // depending on what the user enters, the program switches what is going to ask next
                switch (ch) {
                    // asks what they want on their burger
                 case 'b': System.out.println("Enter A or a for all the fixins\n");
                           System.out.println("Enter C or c for cheese\n");
                           System.out.println("N or n for none of the above\n");
                           Scanner burger = new Scanner(System.in); // needed for the user input
    
                              String second = burger.next(); // converts the user input into string
                                // Checks what the user entered and then displays an approritate respose
                               if (second.equals(a)) {
                                   System.out.println("You ordered a burger with everything");
                                   return;
                               }
                               if(second.equals(c)){
                                   System.out.println("You ordered a burger with cheese");
                                   return;
                               }
                               if(second.equals(n)){
                                   System.out.println("You ordered a burger with nothing");
                                   return;
                               }
                               if (second.equals(A)) {
                                   System.out.println("You ordered a burger with everything");
                                   return;
                               }
                               if(second.equals(C)){
                                   System.out.println("You ordered a burger with cheese");
                                   return;
                               }
                               if(second.equals(N)){
                                   System.out.println("You ordered a burger with nothing");
                                   return;
                               }
                            else {
                               System.out.println("Please enter one of the options");
                               return;
                            }
                         
                           // asks what they want on their burger
                case 'B':  System.out.println("Enter A or a for all the fixins\n");
                           System.out.println("Enter C or c for cheese\n");
                           System.out.println("N or n for none of the above\n");
                           Scanner burger1 = new Scanner(System.in); // needed for the user input
                           String second1 = burger1.nextLine();
                            // checks what the user entered and then displays an approritate reponse 
                               if (second1.equals(a)) {
                                   System.out.println("You ordered a burger with everything");
                                   return;
                               }
                               if(second1.equals(c)){
                                   System.out.println("You ordered a burger with cheese");
                                   return;
                               }
                               if(second1.equals(n)){
                                   System.out.println("You ordered a burger with nothing");
                                   return;
                               }
                               if (second1.equals(A)) {
                                   System.out.println("You ordered a burger with everything");
                                   return;
                               }
                               if(second1.equals(C)){
                                   System.out.println("You ordered a burger with cheese");
                                   return;
                               }
                               if(second1.equals(N)){
                                   System.out.println("You ordered a burger with nothing");
                                   return;
                               }
                            else {
                               System.out.println("Please enter one of the options");
                               return;
                           }
                           // asks what kind of soda they want 
                case 's':  System.out.println("Enter P or p for Pepsi\n");
                           System.out.println("Enter C or c for Coke\n");
                           System.out.println("M or m for Mountain Dew\n");
                           System.out.println("S or s for Sprite\n");
                           Scanner third = new Scanner(System.in); // needed for the user input
                           String soda = third.nextLine();
                         
                          // checks what the user entered and then displays an approritate reponse 
                               if (soda.equals(p)) {
                                   System.out.println("You ordered a Pepsi");
                                   return;
                               }
                               if(soda.equals(c)){
                                   System.out.println("You ordered a Coke");
                                   return;
                               }
                               if(soda.equals(m)){
                                   System.out.println("You ordered a Mountain Dew");
                                   return;
                               }
                               if (soda.equals(s)) {
                                   System.out.println("You ordered a Sprite");
                                   return;
                               }
                               if(soda.equals(P)){
                                   System.out.println("You ordered a Pepsi");
                                   return;
                               }
                               if(soda.equals(C)){
                                   System.out.println("You ordered a Coke");
                                   return;
                               }
                               if(soda.equals(M)){
                                   System.out.println("You ordered a Mountain Dew");
                                   return;
                               }
                               if(soda.equals(S)){
                                   System.out.println("You ordered a Sprite");
                                   return;
                               }
                            else {
                               System.out.println("Please enter one of the options");
                               return;
                           }
                           // asks what kind of soda they want 
                case 'S':  System.out.println("Enter P or p for Pepsi\n");
                           System.out.println("Enter C or c for Coke\n");
                           System.out.println("M or m for Mountain Dew\n");
                           System.out.println("S or s for Sprite\n");
                           Scanner third1 = new Scanner(System.in); //needed for user input
                           String soda1 = third1.nextLine();
                           // checks what the user entered and then displays an approritate reponse 
                               if (soda1.equals(p)) {
                                   System.out.println("You ordered a Pepsi");
                                   return;
                               }
                               if(soda1.equals(c)){
                                   System.out.println("You ordered a Coke");
                                   return;
                               }
                               if(soda1.equals(m)){
                                   System.out.println("You ordered a Mountain Dew");
                                   return;
                               }
                               if (soda1.equals(s)) {
                                   System.out.println("You ordered a Sprite");
                                   return;
                               }
                               if(soda1.equals(P)){
                                   System.out.println("You ordered a Pepsi");
                                   return;
                               }
                               if(soda1.equals(C)){
                                   System.out.println("You ordered a Coke");
                                   return;
                               }
                               if(soda1.equals(M)){
                                   System.out.println("You ordered a Mountain Dew");
                                   return;
                               }
                               if(soda1.equals(S)){
                                   System.out.println("You ordered a Sprite");
                                   return;
                               }
                            else {
                               System.out.println("Please enter one of the options");
                               return;
                           } 
                           // asks what size of fries they wnat 
                 case 'f': System.out.println("Enter s or S for Small\n");
                           System.out.println("Enter M or m for Medium\n");
                           System.out.println("Enter L or l for Large\n");
                           Scanner fourth = new Scanner(System.in); // needed for user input 
                           String fries = fourth.nextLine();
                           // checks what the user entered and then displays an approritate reponse 
                               if (fries.equals(s)) {
                                   System.out.println("You ordered small fries");
                                   return;
                               }
                               if(fries.equals(S)){
                                   System.out.println("You ordered small fries");
                                   return;
                               }
                               if(fries.equals(m)){
                                   System.out.println("You ordered medium fries");
                                   return;
                               }
                               if (fries.equals(M)) {
                                   System.out.println("You ordered medium fries");
                                   return;
                               }
                               if(fries.equals(l)){
                                   System.out.println("You ordered large fries");
                                   return;
                               }
                               if(fries.equals(L)){
                                   System.out.println("You ordered large fries");
                                   return;
                               }
                            else {
                               System.out.println("Please enter one of the options");
                               return;
                           } 
                           // asks what size fries they want 
                 case 'F': System.out.println("Enter s or S for Small\n");
                           System.out.println("Enter M or m for Medium\n");
                           System.out.println("Enter L or l for Large\n");
                           Scanner fourth1 = new Scanner(System.in); // needed for user input 
                           String fries1 = fourth1.nextLine();
                     // checks what the user entered and then displays an approritate reponse 
                               if (fries1.equals(s)) {
                                   System.out.println("You ordered small fries");
                                   return;
                               }
                               if(fries1.equals(S)){
                                   System.out.println("You ordered small fries");
                                   return;
                               }
                               if(fries1.equals(m)){
                                   System.out.println("You ordered medium fries");
                                   return;
                               }
                               if (fries1.equals(M)) {
                                   System.out.println("You ordered medium fries");
                                   return;
                               }
                               if(fries1.equals(l)){
                                   System.out.println("You ordered large fries");
                                   return;
                               }
                               if(fries1.equals(L)){
                                   System.out.println("You ordered large fries");
                                   return;
                               }
                            else {
                               System.out.println("Please enter one of the options");
                               return;
                           } 
                          }
             }
          }
            
        
            