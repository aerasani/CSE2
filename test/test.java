// Ashish Erasani
// CSE 2 Test Practice
// Fuck CSE 2

public class test {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int k = 1;
        for (i = 1; i < 4; i++){
            for (j = 1; j < 3; j++){
                for ( k = 0; k < j; k++){
                    System.out.println("("+ i + "," + j +")");
                }
            }
           i++;
        }
    for (int u = 6; u >= 1; u--){
        System.out.println(" [ " + ((u*5)+1) + "]");
    }
    for (i = 1; i <= 3; i++){
        for (j = 0; j <= i; j++){
            for(k = 0; k <= j; k++ ){
                System.out.print("b");
            }
            System.out.print("\n");
            
        }
    }
    
    }
}
    