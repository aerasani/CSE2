 public class test2 {
   /* public static void main (String [] arg){
    int i = 3;
    int j = 5;
    double k = 4.0;
    double l = 5.0;
    System.out.println("v1:" + heyYo(i, j));
    System.out.println("v2:" + yoHey(k, l));
    
    
    public static int heyYo( int i, int j){
        int i, j;
        return (i*(j*2));
    }
    public static double yoHey( int i, int j){
        int i, j;
        return (i * j);
    }
   }
   */
   public static void main (String[] argc){
    int i = 0, j = 20;
     while (i < 30) {
          while (j > 0){
              System.out.println( i + j);
              j -= 4;
          }
          i += 4;
          
      }
      
     
     for (i = 0; i < 30; i += 4){
         for (j = 20; j > i; j -=4){
             System.out.println(i + j);
             }
              if (j <= 0){
                 return;
         }
     }
    
 /*    int sum = 0, i = 1;
     while (i < 10) {
         sum = sum + i;
         i++;
         System.out.println(sum);
     }
     System.out.println("Sum is: " +sum);
     */
   }
 } 
