// Ashish Erasani
// CSE 2
// Lab 12

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
           y[]={2.3, 3, 4, -2.1, 82, 23},
           z[]={2.3, 13, 14},
           w[]={2.3, 13, 14, 12}, 
           v[],
           u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = "  +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  public static boolean equals(double [] x, double [] y){
      boolean answer = false;
      if (x.length != y.length){
            return answer;   
      }
      int counter = 0;
      for (int i = 0; i < x.length; i++){
         if (x[i] == y[i]){
             counter++;
         }
      }
      if (counter == x.length){
          answer = true;
      }
      return answer; 
  }
  public static double [] addArrays(double [] x, double [] y){
     int longer = x.length;
       
    double [] newy = new double[longer];
    double [] newarray = new double [longer];
    
    for (int i = 0; i < newarray.length; i++){
        newarray[i] = 0;
        newy[i] = 0;
    }
    for (int k = 0; k < y.length; k++){
        newy[k] = y[k];
    }
    
      for (int j = 0; j < newarray.length; j++){
          newarray[j] = x[j] + newy[j];
      }
      return newarray;
      
      
      
      
  }
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}
