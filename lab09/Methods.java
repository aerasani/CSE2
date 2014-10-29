
import java.util.Scanner;
public class Methods {
    public static void main(String[] arg) {
            Scanner scan = new Scanner(System.in);
            int a, b, c;
            System.out.println("Enter three ints");
            a = getInt(scan);
            b = getInt(scan);
            c = getInt(scan);
            System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
            System.out.println("The larger of " + a + ", " + b + ", and " + c +
                " is " + larger(a, larger(b, c)));
            System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b +
                ", and " + c + " are in ascending order");
  }
  public static int getInt(Scanner scan) {
       int a = input.nextInt();
       int b = input.nextInt();
       int c = input.nextInt();
  }
  public static int larger(int num1, int num2) {
      int largerNum;
      if ( num1 > num2){
         // System.out.print ("The larger of " + a + " and " + b + "is" + larger(a , b));
          largerNum = num1;
      }
          else {
          //    System.out.print ("The larger of " + a + " and " + b + "is" + larger(b , a));
            largerNum = num2;  
          }
      
  
      return largerNum;
  }
  public static int ascending( int num3, int num4, int num5) {
      int num3 = int1;
      int num4 = int2;
      if (num3 > num4 && num3 > num4){
          ascending = true;
      }
      else {
          ascending = false;
      }
  }
}
    
  
