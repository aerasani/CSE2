
public class practice{
    public static void main (String [] args){
      /*  int[] in = new int[5];
        int last = in[in.length - 1];
        
        for (int k = 0; k < in.length; k++){
            in[k] = k; 
        }
        for(int i = 0; i < in.length - 1; i++){
            in[i+1] = in[i];
            System.out.print(in[i]);
        }
        in[0] = last; 
        //for (int j = 0; j < in.length ; j++){
       //     System.out.print(in[j]+ " ," );
      // }

     
    }
    public static int[] arrayStats (int[] array) {
        int min = 0;
        int max = 0;
        int [] answer = {0, 0};
        for (int e: array){
            if (e < min){
                min = e;
             }
            answer[0] = e; 
            if (e > max){
                max = e;
            } 
            
        }
        
    }
    
    int [] test = {3, 5, 6, 7, 5, 5};
    for(int e: makeZero(test.length)){
        System.out.println(e);
    }
    oddEven(test);
    }
    
    public static int[] makeZero(int input){
        int [] zeroArray = new int[input];
        for (int i = 0; i < zeroArray.length; i++){
            zeroArray[i] = 0;
        }
        return zeroArray; 
    }
    public static void oddEven(int[] input){
        int even = 0, odd = 0, evencounter = 0, oddcounter = 0;
        //for (int e = 0; e < input.length; e++){
        for (int e: input ){
            if ((e % 2) == 0){
                even += e;
                evencounter++;
            }
            if((e % 2) == 1){
                odd += e;
                oddcounter++;
            }
        }
        for (int j: input){
            System.out.println(j);
        }
        System.out.println(" even avg: " +(even/evencounter)+ "odd avg: " +(odd/oddcounter));
    }
    
    int[] A = {12, 43, 23, 5, 2, 10, 9, 18, 40, 11};
   // System.out.println(findMinInRange(A, 2, 8));
    
  //  for (int e: swapMember(A, 4, 2)){
    //    System.out.println(e);
  //  }
    insertationSort(A);
    } 
    public static int findMinInRange(int[] A, int min, int max){
        int check = A [min], index = 0, answer = -1;
      
        if ((min < 0) || (max > A.length) || min > max){
            System.out.println("Unaccepcatable answer" );
            return answer; 
        }
        
        for (int i = min; i < max; i++){
            if (A[i] < check){
                check = A[i];
                index = i;
            }
            answer = index;
        }
        
        return answer; 
    }
    public static int[] swapMember(int A[], int one, int two){
      /* if ((one || two < A.length) || (one || two > A.length)){
            System.out.println("Unaccepcatable answer" );
            return A; 
      }
      
      
     
        int temp = A[one];
        A[one] = A[two];
        A[two] = temp;
       return A;        
  */
    int x[] = {1, 2, 4, 6};
    double [] u = {3, 4, 5, 6, 7};
    v = {2, 4, 5};
    
    System.out.println(enigma(u, v, x));
    }
    /*
    public static void insertationSort (int[] A){
        int temp = 0; 
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A.length; j++){
                if (A[i] < A[j]){
                     temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        for (int e: A){
            System.out.println(e);
        }
    swapMember()
    }
    */
    public static void print(int [] x){
        
        for (int e: x.length){
            System.out.print(e);
        }
        
        
        
        
    }
    public static int enigma(double x[], double []y, int z[]){
        double [] temp;
        temp = x;
        temp[z[2]] = 42.0;
        y = x; 
        y[0] = 2.34;
        return z[z[0]];
    }
}