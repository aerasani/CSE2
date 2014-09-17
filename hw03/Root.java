//Ashish Erasani
//CSE 02
// September 15, 2014
//HW 03
    // import the Scanner
    import java.util.Scanner;
    // name the class
    public class Root {
        public static void main (String [] args) {
        
        // define the scanner 
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        // promt user for the input number
        System.out.print("Enter a double and I will print its cube");
        // define the variable that the user will input
        double root = myScanner.nextDouble();
        double guess1; 
        // first divide the root number by 3 to get a rough estimate
        guess1=root/3;
        // then repeat the process 4 more times to refine the estimate
        double guess2;
        guess2=((guess1*guess1*guess1)+root)/(3*guess1*guess1);
        double guess3;
        guess3=((2*guess2*guess2*guess2)+root)/(3*guess2*guess2);
        double guess4;
        guess4=((2*guess3*guess3*guess3)+root)/(3*guess3*guess3);
        double guess5;
        guess5=((2*guess4*guess4*guess4)+root)/(3*guess4*guess4);
        // the best estimate is guess 5
        // this prints out the estimate for the user
        System.out.println("the guess is" +guess5+ "");
        // this shows the user the estimate and that when the estimate is 
        // multiplied by 3 times it roughtly equals the origial input number
        double multiplication;
        multiplication=(guess5*guess5*guess5);
        System.out.println(+guess5+"*"+guess5+"*"+guess5+"=" +multiplication);
        

        
        }
    }