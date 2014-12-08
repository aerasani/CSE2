// Ashish Erasani
// CSE 2
// Lab 11
// Arrays
import java.util.Scanner;
public class Arrays{
    public static void main (String [] args){
    Scanner user = new Scanner(System.in);
    int input; 
    int numinput = 10;
    int userarray [] = new int[numinput];
    System.out.println("Enter 10 integers");
    for ( int i = 0; i < numinput; i++){
        userarray [i] = user.nextInt();
    }
    int min = userarray[0];
        for (int i = 0; i < userarray.length; i++){
            if (userarray[i] < min) {
                min = userarray[i];
            }
        }
    System.out.println("The lowest number is:" + min);
    int max = userarray[0];
        for (int i = 0; i < userarray.length; i++){
            if (userarray[i] > max) {
                max = userarray[i];
            }
        }
    System.out.println("The highest number is:" + max);
    
    int add = 0;
    for (int i = 0; i < userarray.length; i++ ){
           add += userarray[i];
    }        
    System.out.println("The sum is: " +add);
    
     for (int i = 0; i < userarray.length; i++){
       System.out.print(+userarray[i]);
       System.out.print("   ");
       System.out.print(+userarray[(userarray.length - 1) - i]);
       System.out.println(" ");
   }
   
    }
}