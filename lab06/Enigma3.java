
import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
   // System.out.println(k%14);
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40; //out = 40
          n/=3; // n = 13
          k-=7; // k = 53
    }
//    System.out.println("n:" +n);
//   System.out.println("k:" +k);
//    System.out.println(n*k%12);
    if(n*k%12< 12){ // = 5
      n-=20; // n = - 7
      out+=n;  // out = 40-7
 //    System.out.println(out);
    }
    if(n*n>k){  // 
      n=42; 
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
 //   System.out.println("n:" +n); // n = 45
 //   System.out.println("out:"+ out); // out = 40-798
 //   System.out.println(n+k);
    
    switch(n+k){  
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5; // n = 9
        k/=9; // k = 5
      default:
        n-=3;
        k-=4;
    }
  //  System.out.print("n:" +n);
 //   System.out.println("k:" +k);
     out+=1/n + 1/k;   
   System.out.println(out);
  }
}

/*
 * Error report:
 * // there is a divide by zero error at like 54
 * this is becasue in the switch statement, k becomes 5 but then due to the 
 default, it gets subtracted by 5 so it becomes 0
 * i changed it to 4 so this error doesnt become a problem
 * 
 */

