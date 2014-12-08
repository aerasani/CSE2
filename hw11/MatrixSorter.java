// Ashish Erasani
// CSE 02
// December 5th 
// hw11 
public class MatrixSorter {
    public static void main(String arg[]) {
        int mat3d[][][] = new int[3][][]; // intiilizaes the array with 3 slabs
        mat3d = buildMat3d(); // calls method to create the 3d array
        show(mat3d); // calls method to print out the array
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d)); // calls array to find lowest number 
        System.out.println("After sorting the 3rd matrix we get");
        System.out.println("---");
        sort(mat3d[2]); // calls array to sort the 3rd slab
        show(mat3d); // prints out the sorted array
    }
    public static int[][][] buildMat3d() { // array to create a 3d array
        int mat3d[][][] = new int[3][][]; // creates a array with 3 slabs
        // loop to create a 2d ragged array for each slab thats 3+2*i
        for (int i = 0; i < mat3d.length; i++) { 
            for (int j = 0; j < 7; j++) {
                mat3d[i] = new int[3 + 2 * i][];
            }
        }
        // loop to create the 1d array for each block for i+j +1
        for (int w = 0; w < mat3d.length; w++) {
            for (int q = 0; q < mat3d[w].length; q++) {
                for (int k = 0; k < 9; k++) {
                    mat3d[w][q] = new int[w + q + 1];
                }
            }
        }
        // populates the array with random numbers from 0 - 99
        for (int s = 0; s < mat3d.length; s++) {
            for (int x = 0; x < mat3d[s].length; x++) {
                for (int v = 0; v < mat3d[s][x].length; v++) {
                    mat3d[s][x][v] = (int)((Math.random() * 99)+1);
                }
            }
        }
        return mat3d; // returns the array 
    }
    public static void sort(int mat3d[][]) { // sorts the 2d array
        int temp; 
        int[] key;
        // uses selection sort to sort 3rd slab rows from smallest to largest
        for (int i = 0; i < mat3d.length; i++) {
            for (int j = 0; j < mat3d[i].length; j++) {
                for (int k = 0; k < mat3d[i].length; k++) {
                    if (mat3d[i][j] < mat3d[i][k]) { 
                        temp = mat3d[i][k];
                        mat3d[i][k] = mat3d[i][j];
                        mat3d[i][j] = temp;
                    }
                }
            }
        }
        // uses insertion sort to sort rows by their first numeber from smallest to largest 
        for (int s = 0; s < mat3d.length; s++) {
            for (int n = s + 1; n < mat3d.length; n++) {
                key = new int[s];
                if (mat3d[n][0] < mat3d[s][0]) {
                    key = mat3d[s];
                    mat3d[s] = mat3d[n];
                    mat3d[n] = key;
                }
            }
        }
    }
    public static int findMin(int mat3d[][][]) {
        int low = mat3d[0][0][0]; // sets lowest number as the first number in array
        for (int i = 0; i < mat3d.length; i++) {
            for (int j = 0; j < mat3d[i].length; j++) {
                for (int k = 0; k < mat3d[i][j].length; k++) {
                    if (mat3d[i][j][k] < low) { // if any number is less than low, low changes
                        low = mat3d[i][j][k];
                    }
                }
            }
        }
        return low; // returns low
    }
    public static void show(int mat3d[][][]) { // array to print out the array
       // loop to print out the array - 3rd one is sorted 
        for (int z = 0; z < mat3d.length; z++) {
            for (int c = 0; c < mat3d[z].length; c++) {
                for (int n = 0; n < mat3d[z][c].length; n++) {
                    System.out.print(mat3d[z][c][n]);
                    System.out.print(" ");
                }
                System.out.println("  ");
            }
            System.out.println("---");
        }
    }

}
