// Ashish Erasani
// CSE 02
// October 31, 2014

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    public static int addDigit(int a,int b){
        int result = a;
        if (b <= 9 && a > 0){
        String num1 = "" + a;
        String num2 = "" + b;
        String add = num2 + num1;
        result = Integer.parseInt(add);
        }
        if ( a < 0 ){
            a *= -1;
        String num3 = "" + a;
        String num4 = "" + b;
        String add1 = num4 + num3;
        result = Integer.parseInt(add1);
        result *= -1;
        
        System.out.println("value of negative a: " + result);
        }
        
          //System.out.println("" +num3);
       // System.out.println("" +num4);
        return result;
    }
    public static int join(int f, int g){
        String result1;
        if (g <= 9){
        String num1 = "" + f;
        String num2 = "" + g;
        String add = num1 + num2;
        //result1 = Integer.parseInt(add);
        }
        return g;
    }  
}