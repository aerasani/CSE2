
public class finals{
    public static void main (String [] args){
        
    /* double y = 4.4F; Fall 2012
     y += 2;
     System.out.println(y);
    */
   /* int i = 5, j = i, k = i;
    do{
        do{
            do{
                System.out.print(i);
                k--;
             }while(k <= i);
            System.out.println(" ");
            j--;
        }while(j <= i);
        i--;
    }while(i <= 5);
        */
        
    for (int i = 0; i <= 5; i--){
        for (int j = 5; j >= i; j--){
            for (int k = 5; k >= j; k--){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
    }
}