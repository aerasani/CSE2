public class test {
    public static void main (String args []){
    /*int i = 1, val = 3;
    for (i = 3; i>0; i--){
        val += Y(val);
    }
    System.out.println("val:" + val);
    }
    public static int Y(int k){
        int j = X(k);
        return j;
    }
    public static int X(int k){
        int j = k+2;
        return j;
    }
 */
    int i = 3;
    int j = 5;
    double k = 4.0;
    double l = 5.0;
    System.out.println("v1:" + X((double) i, (double) k));
    System.out.println("v2:" + X((int)k , l));
    }
    public static double X(double i, double j){
        return i*(j*2);
    }
    public static int X(int i, int j){
        return i * j;
    }
   
}
