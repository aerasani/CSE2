import java.util.Scanner;
public class Enigma0{
  public static void main (String arg []){
    Scanner scan = new Scanner(System.in); // defining the scanner
    
    
    System.out.println("Enter an int- "); // ask user for int
    int n = scan.nextInt(); // set int n to user input 
    if(scan.hasNextInt()){ // check to see if user inputed int
      System.out.println("You entered "+n); // if so, it tells user what they entered 
    }
    else{ // other wise, n is set to 4
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8; // adds up to 25
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25"); // will alwasy print becasue sum of int = 25
      default:
        System.out.println("Again, you entered "+n); // repeats what the user entered
    }
  }
}

/*import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      int n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8,n;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}
*/
// error was putting int n = scan.nextInt() after the if statemetn becasue then
// n never gets initialized and the whole program wont work