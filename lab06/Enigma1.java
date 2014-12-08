/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String [] args){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    Scanner scan = new Scanner(System.in);
    double x;
    x = scan.nextDouble();
   // double x = ((new Scanner(System.in)).nextDouble());
       System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   double sub = 1 - x/100, answer;
    System.out.println("The proportion remaining is" +sub);
   
    if(1-x/100==0.93)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if(1-x/100==0.59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(1-x/100==0.86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(1-x/100==0.67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(1-x/100==0.4)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
     - Needed space after String [] args
     - also it only printed a statemetn if it equaled the few examples so
     new code was necessary to print out a response no matter what the user entered
    
 
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 * 
 * 
 * 
 */
