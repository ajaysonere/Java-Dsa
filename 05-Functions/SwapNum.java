import java.util.*;

public class SwapNum {
  
  public static void swapNumber(int a , int b) {
     int x = a ;
     a = b;
     b = x;
  }

  public static int multiply(int a , int b) {
    int prod = a*b;
    return prod;
  }

  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     System.out.println("A " + a + " B " + b);
     swapNumber(a ,b);
     System.out.println("A " + a + " B " + b);
     int prod = multiply(a , b);
     System.out.println("Product of a and b is : " + prod);
  }
}
