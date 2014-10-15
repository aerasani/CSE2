    
    
    
    
    import java.util.Scanner;
    public class test { // name the class
        public static void main (String [] args) { 
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number");
                int input = scan.nextInt();
            if (input == 1 || input == 0 || input == 10 || input == 11 || input == 100 || input == 101 || input == 110 || input == 111){ 
                if (input == 1 || input == 0){
                    double single = input * Math.pow(2,0);
                    int one = (int) single;
                    System.out.println(one);
                 }
                 else if (input == 10 || input == 11){
                     int twonumdigit1 = input/10;
                     int twonumdigit2 = input%10;
                     double answer1 = (twonumdigit1* (Math.pow(2,1)));
                     double answer2 = (twonumdigit2 * (Math.pow(2,0)));
                     int onetwo = (int)answer1;
                     int twotwo = (int) answer2;
                     System.out.println(+onetwo+twotwo);
                 }
                 else if (input == 100 || input == 101 || input == 110 || input == 111){
                     int threenumdigit1 = input/100;
                     int threenumdigit2 = (input%100)/10;
                     int threenumdigit3 = (input%100)%10;
                     double numdigit1 = (threenumdigit1 * (Math.pow(2,2)));
                     double numdigit2 = (threenumdigit2 * (Math.pow(2,1)));
                     double numdigit3 = (threenumdigit3 * (Math.pow(2,0)));
                     int onethree = (int) numdigit1;
                     int twothree = (int) numdigit2;
                     int threethree = (int) numdigit3;
                     System.out.println(+onethree+twothree+threethree);
                 }
            }
                 else {
                     System.out.println("Did not enter one of the numbers");
                 }
            
                 
                 
                 
                 
                 
                 
                 
         }
    }
    
    


            