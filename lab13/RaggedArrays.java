// Ashish Erasani
// CSE 2
// Lab 13
// Ragged Array
import java.util.Random;
import java.util.Arrays;
public class RaggedArrays{
    public static void main (String [] args){
        int [][] array = new int[5][];
        for (int i = 0; i < array.length; i++){
            array[i] = new int [(i*3) + 5];
        }
        for (int k = 0; k < array.length; k++){
            for (int j = 0; j < array[k].length; j++){
                array[k][j] = (int) (Math.random() * 40);
            }
        }
       
        
     for (int x = 0; x < array.length; x++){
         java.util.Arrays.sort(array[x]);
     }

        
         int counter = 0;
         for (int k = 0; k < array.length; k++){
            for (int j = 0; j < array[k].length; j++){
                System.out.print(+array[k][j]);
                System.out.print(" ");
                counter++;
            }
            System.out.println(" ");
            
         }
         System.out.println("coutner:" +counter);
    }
}