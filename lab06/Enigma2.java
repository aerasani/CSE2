import java.util.Scanner;
public class Enigma2{
  public static void main(String [] args){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=0;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *   the java.lang exception says that the error is / by zero
 *   this error is foudn in line 9 where its 40/0
 *      fixed the error by removing the 40/0 to to just 0
 * 
 * 
 */
